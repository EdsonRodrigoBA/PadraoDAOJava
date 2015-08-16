package br.ifsp.padraodaojava.modelo.negocio;

import br.ifsp.padraodaojava.modelo.dao.ProfessorDAO;
import br.ifsp.padraodaojava.modelo.entidade.Professor;

public class ProfessorService {

	ProfessorDAO professorDAO;

	public ProfessorService(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}

	public void inserirProfessor(Professor professor) throws Exception {
		// Validações de regras de negócio sobre o professor
		// this.validarProfessor(professor)
		professorDAO.inserir(professor);
	}
}