
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
class qsnI implements Serializable{
String s="Test Serializable and Deserializable";
public static void Implementation() throws Exception{
qsnI q9inside=new qsnI();
FileOutputStream fos = new FileOutputStream("D:\\sus\\testout.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(q9inside);
System.out.println("Serializaion Completed");
FileInputStream fis = new FileInputStream("D:\\sus\\testout.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
qsnI q92inside= (qsnI) ois.readObject();
System.out.println("Deserialization completed");
System.out.println(q92inside.s);
}
}
public class SeriDemo {
public static void main(String[] args) {
try{
qsnI.Implementation();
}catch(Exception e){
System.out.println(e.getMessage());
}
System.out.println("\nLab no: 14i Name: Susmita Lohani Roll No:23 Section:A");
}


}
