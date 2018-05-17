
/*
*
*
* Distributed under the OpenDDS License.
* See: http://www.opendds.org/license.html
*/

import DDS.*;
import OpenDDS.DCPS.*;
import org.omg.CORBA.StringSeqHolder;
import Messenger.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.sql.Timestamp;
import java.util.Random;


public class TestPublisher {

   private static final int N_MSGS = 5000;

   public static boolean checkReliable(String[] args) {
     for (int i = 0; i < args.length; ++i) {
       if (args[i].equals("-r")) {
         return true;
       }
     }
     return false;
   }

   public static boolean checkWaitForAcks(String[] args) {
     for (int i = 0; i < args.length; ++i) {
       if (args[i].equals("-w")) {
         return true;
       }
     }
     return false;
   }
   public void writeLogMsg(String msg){
    System.out.println("Log writer started .\n");
    System.out.println(msg);
       try{
                   
                   String data = msg;
                   File file =new File("/tmp/log/DDS/pubDDS.log");
                   //if file doesnt exists, then create it
                   if(!file.exists()){
                       file.createNewFile();
                   }
                   //true = append file
                   FileWriter fw = new FileWriter(file.getAbsoluteFile());
                   BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(data);
                    bw.close();
               }catch(Exception e){
                   e.printStackTrace();
               }
   }

   public static void main(String[] args) {

       java.util.Date date= new java.util.Date();
       TestPublisher m = new TestPublisher();
       Random randomGenerator = new Random();
       
       String[] arrayRefVar = {" Set(DEVICE_STATE(Custom:DND_7015)=BUSY) ", " Set(DEVICE_STATE(Custom:DND_7015)=NOT_INUSE ",
               " Set(DEVICE_STATE(Custom:DND_7015)=TURN ON) ", " Set(DEVICE_STATE(Custom:DND_7015)=TURN OFF) "};
       String type, topic,subject,subjectMsg;
       





       System.out.println("Starting DDS-NAS Publisher");
       boolean reliable = checkReliable(args);
       boolean waitForAcks = checkWaitForAcks(args);

       DomainParticipantFactory dpf =
           TheParticipantFactory.WithArgs(new StringSeqHolder(args));
       if (dpf == null) {
           System.err.println("ERROR: Domain Participant Factory not found");
           return;
       }
       DomainParticipant dp = dpf.create_participant(4,
           PARTICIPANT_QOS_DEFAULT.get(), null, DEFAULT_STATUS_MASK.value);
       if (dp == null) {
           System.err.println("ERROR: Domain Participant creation failed");
           return;
       }

       MessageTypeSupportImpl servant = new MessageTypeSupportImpl();
       if (servant.register_type(dp, "") != RETCODE_OK.value) {
           System.err.println("ERROR: register_type failed");
           return;
       }

       String custom_topic = " IoT inter Device DDS communication ";
       Topic top = dp.create_topic(custom_topic,
                                   servant.get_type_name(),
                                   TOPIC_QOS_DEFAULT.get(),
                                   null,
                                   DEFAULT_STATUS_MASK.value);
       if (top == null) {
           System.err.println("ERROR: Topic creation failed");
           return;
       }

       Publisher pub = dp.create_publisher(PUBLISHER_QOS_DEFAULT.get(), null,
                                           DEFAULT_STATUS_MASK.value);
       if (pub == null) {
           System.err.println("ERROR: Publisher creation failed");
           return;
       }

       // Use the default transport configuration (do nothing)

       DataWriterQos dw_qos = new DataWriterQos();
       dw_qos.durability = new DurabilityQosPolicy();
       dw_qos.durability.kind = DurabilityQosPolicyKind.from_int(0);
       dw_qos.durability_service = new DurabilityServiceQosPolicy();
       dw_qos.durability_service.history_kind = HistoryQosPolicyKind.from_int(0);
       dw_qos.durability_service.service_cleanup_delay = new Duration_t();
       dw_qos.deadline = new DeadlineQosPolicy();
       dw_qos.deadline.period = new Duration_t();
       dw_qos.latency_budget = new LatencyBudgetQosPolicy();
       dw_qos.latency_budget.duration = new Duration_t();
       dw_qos.liveliness = new LivelinessQosPolicy();
       dw_qos.liveliness.kind = LivelinessQosPolicyKind.from_int(0);
       dw_qos.liveliness.lease_duration = new Duration_t();
       dw_qos.reliability = new ReliabilityQosPolicy();
       dw_qos.reliability.kind = ReliabilityQosPolicyKind.from_int(0);
       dw_qos.reliability.max_blocking_time = new Duration_t();
       dw_qos.destination_order = new DestinationOrderQosPolicy();
       dw_qos.destination_order.kind = DestinationOrderQosPolicyKind.from_int(0);
       dw_qos.history = new HistoryQosPolicy();
       dw_qos.history.kind = HistoryQosPolicyKind.from_int(0);
       dw_qos.resource_limits = new ResourceLimitsQosPolicy();
       dw_qos.transport_priority = new TransportPriorityQosPolicy();
       dw_qos.lifespan = new LifespanQosPolicy();
       dw_qos.lifespan.duration = new Duration_t();
       dw_qos.user_data = new UserDataQosPolicy();
       dw_qos.user_data.value = new byte[0];
       dw_qos.ownership = new OwnershipQosPolicy();
       dw_qos.ownership.kind = OwnershipQosPolicyKind.from_int(0);
       dw_qos.ownership_strength = new OwnershipStrengthQosPolicy();
       dw_qos.writer_data_lifecycle = new WriterDataLifecycleQosPolicy();

       DataWriterQosHolder qosh = new DataWriterQosHolder(dw_qos);
       pub.get_default_datawriter_qos(qosh);
       qosh.value.history.kind = HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS;
       if (reliable) {
         qosh.value.reliability.kind =
           ReliabilityQosPolicyKind.RELIABLE_RELIABILITY_QOS;
       }
       DataWriter dw = pub.create_datawriter(top,
                                             qosh.value,
                                             null,
                                             DEFAULT_STATUS_MASK.value);
       if (dw == null) {
           System.err.println("ERROR: DataWriter creation failed");
           return;
       }
       System.out.println("DDS Publisher Created DataWriter");

       StatusCondition sc = dw.get_statuscondition();
       sc.set_enabled_statuses(PUBLICATION_MATCHED_STATUS.value);
       WaitSet ws = new WaitSet();
       ws.attach_condition(sc);
       PublicationMatchedStatusHolder matched =
         new PublicationMatchedStatusHolder(new PublicationMatchedStatus());
       Duration_t timeout = new Duration_t(DURATION_INFINITE_SEC.value,
                                           DURATION_INFINITE_NSEC.value);

       while (true) {
           final int result = dw.get_publication_matched_status(matched);
           if (result != RETCODE_OK.value) {
               System.err.println("ERROR: get_publication_matched_status()" +
                                  "failed.");
               return;
           }

           if (matched.value.current_count >= 1) {
               System.out.println("DDS Publisher Matched");
               break;
           }

           ConditionSeqHolder cond = new ConditionSeqHolder(new Condition[]{});
           if (ws.wait(cond, timeout) != RETCODE_OK.value) {
               System.err.println("ERROR: wait() failed.");
               return;
           }
       }

       ws.detach_condition(sc);

       MessageDataWriter mdw = MessageDataWriterHelper.narrow(dw);
       Message msg = new Message();
       msg.subject_id = 99;
       
      // int handle = mdw.register_instance(msg);
      /* msg.from = "OpenDDS-Java-pub";
       msg.subject = "Review";
       msg.text = "Worst. Movie. Ever.";*/
       
       msg.count = 0;
       int ret = RETCODE_TIMEOUT.value;
       String bufferdMsg = "";


       for (; msg.count < N_MSGS; ++msg.count) {
           
           // String startTime = new Timestamp(date.getTime());
           int randomInt = randomGenerator.nextInt(4);
           type= "From Publisher"; //PUB SUB DCPSINFO
           topic = custom_topic; // 
           int subjectID = msg.count;
           subject = "Message ID " + System.nanoTime();
           subjectMsg = arrayRefVar[randomInt];
            //**
           msg.subject_id = subjectID;
           int handle = mdw.register_instance(msg);
           msg.from = type;
           msg.subject = subject;
           msg.text = subjectMsg;
           //**

           while ((ret = mdw.write(msg, handle)) == RETCODE_TIMEOUT.value) {
           }
           if (ret != RETCODE_OK.value) {
               System.err.println("ERROR " + msg.count +
                                  " write() returned " + ret);
           }
           /*try {
         //    Thread.sleep(100);
           } catch(InterruptedException ie) {
           }*/
                date= new java.util.Date();
                bufferdMsg = bufferdMsg +  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) + " | " + System.currentTimeMillis() + " | "+System.nanoTime() +" | DDS-NAS-PUB " + " | 1 | " + type +" | "+  topic +" | "+subjectID+" | "+ subject +" | "+
                subjectMsg + "\n";
           
   
           //String timeElapsed=startTime - new Timestamp(date.getTime());
       }

       if (waitForAcks) {
         System.out.println("DDS Publisher waiting for acks");

         // Wait for acknowledgements
         Duration_t forever = new Duration_t(DURATION_INFINITE_SEC.value,
                                             DURATION_INFINITE_NSEC.value);
         dw.wait_for_acknowledgments(forever);
       } else {
         try {
           Thread.sleep(1000);
         } catch(InterruptedException ie) {
         }
       }
       System.out.println("Stoping DDS-NAS Publisher");

       // Clean up
       dp.delete_contained_entities();
       dpf.delete_participant(dp);
       TheServiceParticipant.shutdown();

       System.out.println("Publisher exiting");
       m.writeLogMsg(bufferdMsg);
   }
}
