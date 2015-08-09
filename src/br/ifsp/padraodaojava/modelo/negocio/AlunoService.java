package br.ifsp.padraodaojava.modelo.negocio;

import br.ifsp.padraodaojava.dao.AlunoDAO;
import br.ifsp.padraodaojava.modelo.entidade.Aluno;

public class AlunoService {

	private AlunoDAO alunoDAO;

	public AlunoService(AlunoDAO alunoDAO) {
		this.alunoDAO = alunoDAO;
	}

	public void inserirAluno(Aluno novoAluno) throws Exception {
		// Validações de regras de negócio sobre o aluno
		// this.validarAluno(novoAluno)
		alunoDAO.inserir(novoAluno);
	}

}