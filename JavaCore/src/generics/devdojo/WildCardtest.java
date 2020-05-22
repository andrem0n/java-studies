package generics.devdojo;

abstract class Animal {

  public abstract void consulta();
}

class Cachorro extends Animal {

  @Override
  public void consulta() {
    System.out.println("Consultando cachorro");
  }
}

class Gato extends Animal {

  @Override
  public void consulta() {
    System.out.println("Consultando Gato");
  }
}

public class WildCardtest {

  public static void main(String[] args) {
    Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
    Gato[] gatos = {new Gato(), new Gato()};

    consultarAnimais(cachorros);
    consultarAnimais(gatos);

  }

  public static void consultarAnimais(Animal[] animais) {
    for (Animal animal : animais
    ) {
      animal.consulta();
    }
    animais[1] = new Gato();
  }
}
