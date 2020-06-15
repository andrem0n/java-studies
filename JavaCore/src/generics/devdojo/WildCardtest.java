package generics.devdojo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

abstract class Animal {

  public abstract void consulta();
}

class Cachorro extends Animal implements Comparable {

  @Override
  public void consulta() {
    System.out.println("Consultando cachorro");
  }

  @Override
  public int compareTo(Object o) {
    return 0;
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
    List<Cachorro> cachorroList = Arrays.asList(new Cachorro(), new Cachorro());

    consultarAnimais(cachorros);
    consultarAnimais(gatos);
    ordenarLista(cachorroList);
  }

  public static void consultarAnimais(Animal[] animais) {
    for (Animal animal : animais
    ) {
      animal.consulta();
    }
    animais[1] = new Gato();
  }

  public static void consultarAnimaisList(List<? extends Animal> animals) {
    for (Animal animal : animals) {
      animal.consulta();
    }
  }

  public static void consultarCachorroList(List<? super Cachorro> cachorroList) {
    Cachorro cachorro1 = new Cachorro();
    Animal animal = new Cachorro();
    Object object = new Cachorro();
    cachorroList.add(new Cachorro());
  }

  public static void ordenarLista(List<? extends Comparable> lista) {
    Collections.sort(lista);
  }
}
