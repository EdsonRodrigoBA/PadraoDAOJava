package br.ifsp.padraodaojava.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.ifsp.padraodaojava.dao.AlunoDAO;
import br.ifsp.padraodaojava.modelo.entidade.Aluno;

public class AlunoPostgresDAO implements AlunoDAO {

	@Override
	public void inserir(Aluno aluno) throws SQLException {
		Connection conexao = null;
		try {
			// Abre conexão com o banco de dados
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/padraodao", "postgres", "postgres");
			// Cria comando sql para inserir aluno
			String sql = "insert into aluno " + "(nome,cpf) " + "values (?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// Preenche os valores
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getCpf());
			// Executa e finaliza o insert
			stmt.execute();
			stmt.close();
			System.out.println("Aluno inserido no Postgres");
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
