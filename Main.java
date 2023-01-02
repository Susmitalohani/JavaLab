/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork;

/**
 *
 * @author Ram Kumar Lohani
 */
    class variable{
static int id=23;
static String str="Susmita";
}
class method{
public static void Implementation(){
System.out.println("This is Static Method");
}
}
class block{
static{
System.out.println("This is static block");
}
}
final class fkeyword{
final int id=3;
final void Implementation() {
System.out.println(id);

}
}
public class Main {
public static void main(String[] args) {
System.out.println("\nSetA:");
System.out.println("Static Variables");
System.out.println("Id:"+variable.id);
System.out.println("String:"+variable.str);
System.out.println("\nMethod:");
method.Implementation();
System.out.println("\nBlock:");
block q3=new block();
fkeyword q4=new fkeyword();
System.out.println("\nfkeyword:");
q4.Implementation();
 System.out.println("Lab No:5 Name:Susmita Lohani Roll No:23 Section:A"); 
}
}

