package DDS;
public abstract class _MultiTopicLocalBase extends org.omg.CORBA.LocalObject implements MultiTopic {
  private String[] _type_ids = {"IDL:DDS/MultiTopic:1.0", "IDL:DDS/TopicDescription:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
