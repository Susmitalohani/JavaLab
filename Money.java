/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork;
import java.util.Scanner;

/**
 *
 * @author Ram Kumar Lohani
 */

 class Money {
   public  int rupee, paisa,carry=0;
    public void setMoney(int rupee,int paisa){
        this.rupee=rupee;
        this.paisa=paisa;
    }
    public void displayMoney(){
        System.out.println("\nThe addition of given money is "+ this.rupee+" Rupee "+this.paisa+" Paisa \n");
    }
        public void AddMoney(Money j1, Money j2){
        this.paisa=j1.paisa+j2.paisa;
        carry=this.paisa/100;
        this.paisa=this.paisa%100;
        this.rupee=j1.rupee+j2.rupee+carry;
    }
}
  class MoneyTest{
     public static void main(String args[]){
         Money m1=new Money();
         m1.setMoney(5,75);
         Money m2=new Money();
         m2.setMoney(7,30);
         Money m3=new Money();
         m3.AddMoney(m1,m2);
        m3.displayMoney();
       System.out.println("Lab No:2 Name:Susmita Lohani Roll No:23 Section:A"); 
     }
    
}
