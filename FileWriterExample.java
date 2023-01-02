import java.io.FileWriter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\sus\\testout.txt");    
           fw.write("Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");       
    System.out.println("\nLab No:14g Name:Susmita Lohani Roll No:23 Section:A"); 
  }  
}