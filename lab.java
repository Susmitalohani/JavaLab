/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
class Lab{
    public int a=30;
    public int b=20;
    public void DisplayCalculation(){
        System.out.println("In parent class-> Addition: "+(a+b));
    }
}
class Lab_child extends Lab{
    public int a=40;
    public int b=20;
    public void DisplayCalculation(){
        System.out.println("The new value of a: "+a);
        System.out.println("The new value of b: "+b);
        System.out.println("In base class -> Subtraction: "+ (a-b));
        System.out.println("The old value of a: "+super.a);
        System.out.println("The old value of b: "+super.b);
        super.DisplayCalculation();
    }

}



public class lab{
    public static void main(String[] args) {
      
  
        Lab_child q2=new Lab_child();
        q2.DisplayCalculation();

        
        System.out.println("\nLab no: 7 \nName: Sunisha Bhattarai \nRoll No/Section: 21/A");
    }
}
