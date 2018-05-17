package DDS;
public abstract class _ContentFilteredTopicLocalBase extends org.omg.CORBA.LocalObject implements ContentFilteredTopic {
  private String[] _type_ids = {"IDL:DDS/ContentFilteredTopic:1.0", "IDL:DDS/TopicDescription:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
