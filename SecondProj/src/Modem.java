interface Modem {

  public String modemVersion = "V1";
  public boolean open();                               
  public boolean close();
  public int read ();
  public int write(byte[] buffer);
  
 public static String getMyName() {
 	return "modem";

 }
 
}
 