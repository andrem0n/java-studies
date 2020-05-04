package optionalAlga.teste;

import java.math.BigDecimal;
import java.util.Optional;
import optionalAlga.model.Caminhao;
import optionalAlga.model.Motorista;
import optionalAlga.model.Seguro;
import optionalAlga.repository.Motoristas;

public class TesteOptional {

  public static void main(String[] args) {
    Seguro seguro = new Seguro("Cobertura total.", new BigDecimal("3000"));
    Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);
    seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);

    Motoristas motoristas = new Motoristas();

    Optional<Motorista> motorista = Optional.ofNullable(motoristas.getPorNome("José"));

    String cobertura = motorista.map(Motorista::getCaminhao)
        .map(Caminhao::getSeguro)
        .map(Seguro::getCobertura)
        .orElse("Não tem seguro.");
    System.out.println(Optional.ofNullable(seguro));
    System.out.println("Sua cobertura é: " + cobertura);
  }

}
