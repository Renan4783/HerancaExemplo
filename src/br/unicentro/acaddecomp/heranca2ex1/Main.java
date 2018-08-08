package br.unicentro.acaddecomp.heranca2ex1;

public class Main {
	public static void main(String[] args) {
		ContaCorrente Cc1 = new ContaCorrente();
		ClienteEspecial Ce1 = new ClienteEspecial();
		Cc1.deposito(200);
		Cc1.sacar(100);
		Ce1.deposito(200);
		Ce1.sacar(100);
		System.out.println("Conta Corrente: " + Cc1.getSaldo());
		System.out.println("Cliente Especial: " + Ce1.getSaldo());
	}
}
