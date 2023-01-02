interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Hello! Ram");
  }
  public void myOtherMethod() {
    System.out.println("I hope you are fine with this method");
  }
}

class eight {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
    System.out.println("Lab No:8d Name:Susmita Lohani Roll No:23 Section:A"); 
  }
}