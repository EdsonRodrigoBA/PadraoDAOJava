package br.ifsp.padraodaojava.dao;

import java.util.List;

import br.ifsp.padraodaojava.modelo.entidade.Aluno;

public interface AlunoDAO {

	public void inserir(Aluno aluno) throws Exception;

	public void atualizar(Aluno aluno) throws Exception;

	public void remover(Long id) throws Exception;

	public List<Aluno> listarTodos() throws Exception;

	public List<Aluno> encontrarPorId(Long id) throws Exception;

}
