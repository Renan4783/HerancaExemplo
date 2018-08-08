package br.unicentro.acaddecomp.heranca2ex1;

public class ContaCorrente {
	private double saldo;
	
	public double getTaxa(){
		return 0.05;
	}
	
	public void sacar (double quantia){
		this.saldo -= (quantia-(getTaxa()*quantia));
	}
	
	public void deposito (double quantia){
		this.saldo += quantia;
	}
	
	public double getSaldo(){
		return saldo;
	}
}
