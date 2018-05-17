package DDS;
public abstract class _DataWriterLocalBase extends org.omg.CORBA.LocalObject implements DataWriter {
  private String[] _type_ids = {"IDL:DDS/DataWriter:1.0", "IDL:DDS/Entity:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
