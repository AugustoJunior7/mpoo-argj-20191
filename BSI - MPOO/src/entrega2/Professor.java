package entrega2;

import java.util.Date;

public class Professor extends Pessoa {
	private Date admissao;

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public Aluno converter() {
		Aluno novoAluno = new Aluno();
		novoAluno.setNome(this.getNome());
		novoAluno.setCpf(this.getCpf());
		novoAluno.setEndereco(this.getEndereco());
		novoAluno.setAnoEntrada(2019);
		novoAluno.setPeriodoEntrada(1);
		return novoAluno;
	}

	public void imprimirProfessor() {
		System.out.println("Professor\nNome: " + this.getNome() + "\nCpf: " + this.getCpf() + "\nData de Admissão: "
				+ this.getAdmissao() + "\nEndereço: " + this.transformaEndereco() + ".\n");
	}
}
