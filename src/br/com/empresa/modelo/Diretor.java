package br.com.empresa.modelo;

public class Diretor extends Funcionario implements Autenticavel {
	public Diretor(String nome, double salario) {
		super(nome, salario);
	}

	@Override

	public double getBonificacao() {
		return getSalario() * 0.5;
	}

	@Override
	public boolean autentica(int senha) {
		return senha == 1234;

	}
}
