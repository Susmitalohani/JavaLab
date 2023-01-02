/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
class MyCustomException extends Exception  
{  
    
}  
    
// class that uses custom exception MyCustomException  
public class TestCustomException2  
{  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new MyCustomException();  
        }  
        catch (MyCustomException ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println(ex.getMessage());  
        }  
  
        System.out.println("rest of the code...");  
        System.out.println("\nLab no:12f Name:Susmita Lohani Roll No:23 Section:A");
    }  
} 
