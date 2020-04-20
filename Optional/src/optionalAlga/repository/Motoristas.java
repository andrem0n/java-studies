package optionalAlga.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import optionalAlga.model.Caminhao;
import optionalAlga.model.Motorista;
import optionalAlga.model.Seguro;

public class Motoristas {

  private Map<String, Motorista> motoristas = new HashMap<>();

  public Motoristas() {
    Seguro seguro = new Seguro("Parcial - não cobre roubo.", new BigDecimal("5000"));
    Caminhao caminhao = new Caminhao("Scania Truck", seguro);
    Motorista motoristaJoao = new Motorista("João", 40, caminhao);
    Motorista motoristaJose = new Motorista("José", 32, null);

    motoristas.put("João", motoristaJoao);
    motoristas.put("José", motoristaJose);
  }

  public Motorista getPorNome(String nome){
    return motoristas.get(nome);
  }
}
