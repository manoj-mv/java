import java.io.*;
import java.net.*;

class client0 {
   public static void main( String args[] ){
    try{
      Socket s = new Socket("localhost",1235);
      DataInputStream inp = new DataInputStream(System.in);
      DataOutputStream d_out = new DataOutputStream(s.getOutputStream());
      String msg = "";
      while(!msg.equals("stop")){
        msg =  inp.readLine();
        d_out.writeUTF(msg);
      }
    }
      catch(IOException e){
         System.out.println(e);
       }
   }
}
