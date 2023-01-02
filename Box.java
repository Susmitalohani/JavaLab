/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork;

/**
 *
 * @author Ram Kumar Lohani
 */
public class Box {
    int length,breadth,height;
    Box(int a,int b,int c){
        length=a;
        breadth=b;
        height=c;
    }
    public void print(){
        System.out.println("Length is:" +length);
         System.out.println("Breath is:" +breadth);
          System.out.println("Height is:" +height);
    }
    public void volume(){
         int volume=length*breadth*height;
        System.out.println("volume of box is:"+volume);
    }
    public static void main(String args[]){
        Box b1=new Box(7,8,9);
        Box b2=new Box(8,6,4);
        System.out.println("\nFirst Box");
        b1. print();
        b1.volume();
        System.out.println("\nSecond Box");
        b2.print();
        b2.volume();
        System.out.println("Lab No:1 Name:Susmita Lohani Roll No:23 Section:A");
    }
    
}
