package br.com.empresa.modelo;

public class Gerente extends Funcionario implements Autenticavel {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonificacao() {
		return getSalario() * 0.2;
	}
	@Override
	public boolean autentica(int senha) {
		return senha == 1234;

	
	
	}
}
