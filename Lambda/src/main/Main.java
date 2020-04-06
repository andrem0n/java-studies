package main;

import interfaces.CarroPredicate;
import model.Carro;

public class Main {
	public static void main(String[] args) {
		CarroPredicate carroPredicate = new CarroPredicate() {
			@Override
			public boolean test(Carro carro) {
				return carro.getCor().equals("verde");
			}
		};

		CarroPredicate carroPredicate1 = carro -> carro.getCor().equals("verde");

		System.out.println(carroPredicate.test(new Carro("verde", 2020)));
		System.out.println(carroPredicate1.test(new Carro("verde", 2020)));
	}
}
