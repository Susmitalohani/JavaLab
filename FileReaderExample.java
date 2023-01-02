/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
import java.io.FileReader;  
public class FileReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\sus\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
          System.out.println("\nLab No:14f Name:Susmita Lohani Roll No:23 Section:A");
    }    
} 
