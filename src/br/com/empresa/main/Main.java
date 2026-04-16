package br.com.empresa.main;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.empresa.modelo.Autenticavel;
import br.com.empresa.modelo.Diretor;
import br.com.empresa.modelo.Funcionario;
import br.com.empresa.modelo.Gerente;
import br.com.empresa.modelo.Programador;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		leitor.useLocale(java.util.Locale.US);

		ArrayList<Funcionario> listaEmpresa = new ArrayList<>();
		listaEmpresa.add(new Programador("Joao Silva", 3000.0));
		listaEmpresa.add(new Gerente("Pedro Castro", 5800.0));
		listaEmpresa.add(new Diretor("Luciano Silva", 11325.0));

		System.out.println("--- Cadastro de Funcionários ---");

		System.out.print("Digite o nome: ");
		String nome = leitor.nextLine();

		System.out.print("Digite o salário: ");
		double salario = leitor.nextDouble();

		System.out.println("Escolha o cargo: 1-Prog, 2-Gerente, 3-Diretor");
		int opcao = leitor.nextInt();

		if (opcao == 1) {
			listaEmpresa.add(new Programador(nome, salario));
		} else if (opcao == 2) {
			listaEmpresa.add(new Gerente(nome, salario));
		} else if (opcao == 3) {
			listaEmpresa.add(new Diretor(nome, salario));
		}

		System.out.println("\n--- RELATORIO ATUALIZADO---");
		for (Funcionario f : listaEmpresa) {
			f.exibirDados();

			if (f instanceof Autenticavel) {
				Autenticavel aut = (Autenticavel) f;
				System.out.println("Acesso ao sistema:" + aut.autentica(1234));
			}
		}

	}
}