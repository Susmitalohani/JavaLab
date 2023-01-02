/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
public class TestThrow1 {   
    //function to check if person is eligible to vote or not   
    public static void validateYou(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validateYou(19);  
        System.out.println("rest of the code..."); 
        System.out.println("\nLab no:12d Name:Susmita Lohani Roll No:23 Section:A");
  }    
}
