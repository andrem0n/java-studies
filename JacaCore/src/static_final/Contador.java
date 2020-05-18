package static_final;

public class Contador {

  public static int COUNT = 0;

  public void increment() {
    COUNT++;
  }

  public static void printCount() {
    System.out.println("Value of count: " + COUNT);
  }
}
