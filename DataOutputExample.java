/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
import java.io.*;  
public class DataOutputExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\sus\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");
        System.out.println("\nLab No:14d Name:Susmita Lohani Roll No:23 Section:A");
    }  
}