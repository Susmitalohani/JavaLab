/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork;

/**
 *
 * @author Ram Kumar Lohani
 */
public class JaggedArray {
    public static void main(String args[]){
        int arry[][] = new int[][]  {
                new int[] {4,2,8},
                new int[] {9,11,6,27,8},
                new int[] {12,7}
        };
        System.out.print("Elements in Jagged Array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<arry[i].length;j++){
                System.out.print(arry[i][j]+" ");
            }
        }
          System.out.println("\nLab No:3c Name:Susmita Lohani Roll No:23 Section:A");
    }
}

