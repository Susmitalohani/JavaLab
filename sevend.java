/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
class qsnD{
public qsnD(){
System.out.println("Parent CLass");
}
}
class x extends qsnD{
public x(){
System.out.println("Child CLass");
}
}
class y extends x{
public y(){
System.out.println("Child CLass of Child CLass");
}
}
public class sevend {
    public static void main(String[] args) {
        y a=new y();
         System.out.println("Lab No:7d Name:Susmita Lohani Roll No:23 Section:A"); 
    }
}
