package br.com.empresa.modelo;
public class Programador extends Funcionario {
	
	public Programador(String nome,double salario) {
	super(nome,salario);
	
}

@Override
public double getBonificacao() {
	return getSalario()* 0.8;
}
}