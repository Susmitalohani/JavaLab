
import java.io.FileWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
class qsnH{
public static void Implementation() throws Exception{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the text you want to enter in file:");
String s=sc1.nextLine();
FileWriter fw=new FileWriter("D:\\sus\\testout.txt");
fw.write(s);
System.out.println("Written in File");
fw.close();
}
}
public class WriteInFileDemo {
public static void main(String[] args) {
try{
qsnH.Implementation();
}catch(Exception e){
System.out.println(e.getMessage());
}
System.out.println("\nLab No:14h Name:Susmita Lohani Roll No:23 Section:A");
}
}
