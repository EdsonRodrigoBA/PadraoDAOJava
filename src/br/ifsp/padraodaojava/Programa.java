package br.ifsp.padraodaojava;

import br.ifsp.padraodaojava.modelo.entidade.Aluno;
import br.ifsp.padraodaojava.modelo.negocio.AlunoService;

public class Programa {

	public static void main(String args[]) throws Exception {
		AlunoService alunoService = new AlunoService();
		Aluno novoAluno = new Aluno("João", "199.999.999-99");

		try {
			alunoService.inserirAluno(novoAluno);
			System.out.println("Aluno cadastrado com sucesso");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}