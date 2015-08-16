package br.ifsp.padraodaojava.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.ifsp.padraodaojava.dao.ProfessorDAO;
import br.ifsp.padraodaojava.modelo.entidade.Professor;

public class ProfessorPostgresDAO implements ProfessorDAO {

	@Override
	public void inserir(Professor professor) throws Exception {
		Connection conexao = null;
		try {
			// Abre conexão com o banco de dados
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/padraodao", "postgres", "postgres");
			// Cria comando sql para inserir aluno
			String sql = "insert into professor " + "(nome,cpf,nivel) " + "values (?,?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// Preenche os valores
			stmt.setString(1, professor.getNome());
			stmt.setString(2, professor.getCpf());
			stmt.setString(3, professor.getNivel());
			// Executa e finaliza o insert
			stmt.execute();
			stmt.close();
			System.out.println("Professor inserido no Postgres");
		} catch (SQLException e) {
			// Tratamento de exceção
			e.printStackTrace();
			throw new SQLException("Não foi possível inserir");
		} finally {
			// Fecha conexão com o banco de dados
			conexao.close();
		}
	}

	@Override
	public void atualizar(Professor aluno) throws Exception {
	}

	@Override
	public void remover(Long id) throws Exception {
	}

	@Override
	public List<Professor> listarTodos() throws Exception {
		return null;
	}

	@Override
	public List<Professor> encontrarPorId(Long id) throws Exception {
		return null;
	}

	@Override
	public List<Professor> encontrarPorNivel(String nivel) throws Exception {
		return null;
	}

}
