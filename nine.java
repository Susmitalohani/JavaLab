class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class nine {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println("Sum of two classes is:"+(myInner.y + myOuter.x));
    System.out.println("\nLab no:9b Name: Susmita Lohani Roll N:23 Section:A");
  }
}