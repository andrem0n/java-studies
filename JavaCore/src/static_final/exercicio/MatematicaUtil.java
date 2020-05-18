package static_final.exercicio;

public class MatematicaUtil {

  private static final Double PI = 3.14;

  public static int calcularFibonacci(int posicao) {
    if (posicao < 2) {
      return posicao;
    }
    return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
  }

  public static Double calcularAreaCirculo(Double raio) {
    return Math.pow(raio, 2) * Math.PI;
  }
}
