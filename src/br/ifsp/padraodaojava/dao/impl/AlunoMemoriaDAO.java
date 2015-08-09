package br.ifsp.padraodaojava.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ifsp.padraodaojava.dao.AlunoDAO;
import br.ifsp.padraodaojava.modelo.entidade.Aluno;

public class AlunoMemoriaDAO implements AlunoDAO {

	List<Aluno> alunos = new ArrayList<Aluno>();

	@Override
	public void inserir(Aluno aluno) throws SQLException {
		this.alunos.add(aluno);
		System.out.println("Aluno inserido na memória");
	}

	@Override
	public void atualizar(Aluno aluno) throws SQLException {
	}

	@Override
	public void remover(Long id) throws SQLException {
	}

	@Override
	public List<Aluno> listarTodos() throws SQLException {
		return null;
	}

	@Override
	public List<Aluno> encontrarPorId(Long id) throws SQLException {
		return null;
	}

}
