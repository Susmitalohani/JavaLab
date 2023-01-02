
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */

class qsnE{
static String Path ="D:\\sus\\testout.txt";
public static void Implementation() throws IOException{
RandomAccessFile file = new RandomAccessFile(Path,"r");
file.seek(16);
byte[] bytes = new byte[22];
file.read(bytes);
for(byte bt : bytes) {
System.out.print((char)bt);
}
file.close();
}
}
public class RandomAccessExample {
public static void main(String[] args) {
try{
qsnE.Implementation();
}catch(IOException e){
System.out.println(e.getMessage());
}
System.out.println("\nLab No:14e Name:Susmita Lohani Roll No:23 Section:A");
}
}
