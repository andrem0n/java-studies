package interfaces;

import model.Carro;

@FunctionalInterface
public interface CarroPredicate {
	boolean test(Carro carro);
}
