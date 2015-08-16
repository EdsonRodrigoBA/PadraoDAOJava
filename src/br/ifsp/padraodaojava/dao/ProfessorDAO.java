package br.ifsp.padraodaojava.dao;

import java.util.List;

import br.ifsp.padraodaojava.modelo.entidade.Professor;

public interface ProfessorDAO {

	public void inserir(Professor professor) throws Exception;

	public void atualizar(Professor professor) throws Exception;

	public void remover(Long id) throws Exception;

	public List<Professor> listarTodos() throws Exception;

	public List<Professor> encontrarPorId(Long id) throws Exception;

	public List<Professor> encontrarPorNivel(String nivel) throws Exception;
}
