public class SuperKeyword {
    String color="white";
    void printColor(){
        System.out.println("I am base class");
    }
    }
class childClass extends SuperKeyword{
    String color="black";
    @Override
    void printColor(){
        System.out.println("Child class color is\t"+color);
        System.out.println("Parent class color is\t"+super.color);
        super.printColor();

        
    }
}
class main{
    public static void main(String[] args){
        childClass c=new childClass();
        c.printColor();
        System.out.println("Lab no:7b Name: Susmita Lohani  Roll No: 23  Section:A");

    }
}