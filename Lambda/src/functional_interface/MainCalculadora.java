package functional_interface;

public class MainCalculadora {

  public static void main(String[] args) {
    Double result = Calculadora.calcular(30d, 20d, (a, b) -> a + b);
    System.out.println(result);

    Double maiorNumero = Calculadora.calcular(10d, 8d, (a,b) -> a > b ? a : b);
    System.out.println(maiorNumero);
  }

}
