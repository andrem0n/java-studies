package optionalAlga.teste;

import optionalAlga.model.Caminhao;
import optionalAlga.model.Motorista;
import optionalAlga.model.Seguro;
import optionalAlga.repository.Motoristas;

public class TesteSemOptional {

  public static void main(String[] args) {
    Motoristas motoristas = new Motoristas();
    Motorista motorista = motoristas.getPorNome("José");

    // exemplo sem optional
    String cobertura = "Não possui seguro.";

    if (motorista != null) {
      Caminhao caminhao = motorista.getCaminhao();
      if (caminhao != null) {
        Seguro seguro = caminhao.getSeguro();
        if (seguro != null) {
          cobertura = seguro.getCobertura();
        }
      }
    }
    System.out.println("Sua cobertura é: " + cobertura);
  }
}
