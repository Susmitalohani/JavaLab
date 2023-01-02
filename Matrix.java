/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Ram Kumar Lohani
 */

public class Matrix {

  public static void main(String[] args) {
    int matrix[][] =new int[3][3];
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 3x3 Matrix elements: ");
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++) {
        matrix[i][j] = scan.nextInt();
      }
    }
    System.out.println("Entered Matrix: ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
     System.out.println("Diagonal Elements");
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    if(i==j){
    System.out.print(matrix[i][j]+"");
}
}
System.out.println();

      }
     System.out.println("Lab No:3b Name:Susmita Lohani Roll No:23 Section:A");
  }
}


