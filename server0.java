import java.io.*;
import java.net.*;

class server0{
  public static void main(String args[]){
    try{
      ServerSocket s_s  = new ServerSocket(1235);
      System.out.println("server started.......");
      System.out.println("waiting for client.......");
      Socket s = s_s.accept();
      System.out.println("connection established....");
      DataInputStream inp = new DataInputStream(s.getInputStream());
      String msg="";
      while(!msg.equals("stop")){
        msg = inp.readUTF();
       
        System.out.println("client :"+ msg);
      }
      s_s.close();
    }
   catch(Exception e){
      System.out.println(e);
   }
  }
}

