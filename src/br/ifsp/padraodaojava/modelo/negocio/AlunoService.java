package br.ifsp.padraodaojava.modelo.negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ifsp.padraodaojava.modelo.entidade.Aluno;

public class AlunoService {

	public void inserirAluno(Aluno novoAluno) throws Exception {
		// Validações de regras de negócio sobre o aluno
		// this.validarAluno(novoAluno)
		Connection conexao = null;
		try {
			// Abre conexão com o banco de dados
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/padraodao", "postgres", "postgres");
			// Cria comando sql para inserir aluno
			String sql = "insert into aluno " + "(nome,cpf) " + "values (?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// Preenche os valores
			stmt.setString(1, novoAluno.getNome());
			stmt.setString(2, novoAluno.getCpf());
			// Executa e finaliza o insert
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// Tratamento de exceção
			e.printStackTrace();
			throw new Exception("Não foi possível cadastrar o aluno.");
		} finally {
			// Fecha conexão com o banco de dados
			conexao.close();
		}
	}
}