package functional_interface;

import java.util.function.BinaryOperator;

public class Calculadora {

  public static <T> T calcular(T op1, T op2, BinaryOperator<T> operador){
    return operador.apply(op1, op2);
  }
}
