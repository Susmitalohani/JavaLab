/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork;

/**
 *
 * @author Ram Kumar Lohani
 */

class Student{
    public int roll_no;
    public void read(int roll_no){
        this.roll_no=roll_no;
    }
    public void display(){
        System.out.println("Roll No:"+roll_no);
    }
}
class Test extends Student{
    public int marks1;
    public int marks2;
    public void readmarks(int marks1,int marks2){
        this.marks1=marks1;
        this.marks2=marks2;
    }
    public void displaymarks(){
        System.out.println("Marks of Science:"+marks1);
        System.out.println("Marks of Math:"+marks2);
    }
}
class Result extends Test{
   public int total;
   public void Calculate(){
       total=marks1+marks2;
   }
   public void displayResult(){
       System.out.println("Total Marks obtained is:"+total);
   }
}
public class six {
    public static void main(String args[]){
        Result rsa=new Result();
        rsa.read(23);
        rsa.readmarks(95,99);
        rsa.display();
        rsa.displaymarks();
        rsa.Calculate();
        rsa.displayResult();
        System.out.println("Lab No:6 Name:Susmita Lohani Roll No:23 Section:A");
    }
    
}
