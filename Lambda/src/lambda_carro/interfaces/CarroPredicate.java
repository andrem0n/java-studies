package lambda_carro.interfaces;

import lambda_carro.model.Carro;

@FunctionalInterface
public interface CarroPredicate {
	boolean test(Carro carro);
}
