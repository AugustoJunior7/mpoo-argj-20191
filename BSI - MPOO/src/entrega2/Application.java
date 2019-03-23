package entrega2;

import java.util.Date;

public class Application {
	public static void main(String[] args) {
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		Date data = new Date();

		aluno.setNome("Augusto");
		aluno.setCpf("00000000000");
		aluno.setAnoEntrada(2018);
		aluno.setPeriodoEntrada(1);

		Endereco enderecoA = new Endereco();
		enderecoA.setRua("84");
		enderecoA.setNumero(403);
		enderecoA.setCidade("Paulista");
		enderecoA.setComplemento("Rua em frente à lotérica");

		aluno.setEndereco(enderecoA);

		professor.setNome("Gabriel");
		professor.setCpf("11111111111");
		professor.setAdmissao(data);

		Endereco enderecoP = new Endereco();
		enderecoP.setRua("105");
		enderecoP.setNumero(204);
		enderecoP.setCidade("Olinda");
		enderecoP.setComplemento("Rua em frente a uma Farmácia");

		professor.setEndereco(enderecoP);

		aluno.imprimirAluno();
		professor.imprimirProfessor();

		Professor novoProfessor = aluno.converter();
		Aluno novoAluno = professor.converter();

		novoAluno.imprimirAluno();
		novoProfessor.imprimirProfessor();

	}

}
