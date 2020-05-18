package static_final;

public class TesteContador {

  public static void main(String[] args) {
    Contador contador = new Contador();
    contador.increment();
    //System.out.println(Contador.COUNT);

    Contador.COUNT++;

    Contador.printCount();
  }
}
