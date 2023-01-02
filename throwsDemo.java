/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
import java.io.IOException;  
class throwsDemo{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   throwsDemo obj=new throwsDemo();  
   obj.p();  
   System.out.println("normal flow...");  
   System.out.println("\nLab no:12e Name:Susmita Lohani Roll No:23 Section:A");
  }  
} 
