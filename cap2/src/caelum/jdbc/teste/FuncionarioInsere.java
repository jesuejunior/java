package caelum.jdbc.teste;

import caelum.jdbc.dao.FuncionarioDAO;
import caelum.jdbc.modelo.Funcionario;

public class FuncionarioInsere {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Jurema");
		f1.setUsuario(f1.getNome().toLowerCase());
		f1.setSenha("123");

		Funcionario f2 = new Funcionario();
		f2.setNome("Carla");
		f2.setUsuario(f2.getNome().toLowerCase());
		f2.setSenha("123");
		
		
		
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		dao.adiciona(f1);
		dao.adiciona(f2);
		
		System.out.println("Funcionário salvo com sucesso");
		
	}

}
