package entrega2;

import java.util.Date;

public class Aluno extends Pessoa {
	private int anoEntrada;
	private int periodoEntrada;
	Date admissao = new Date();

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public int getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}

	public Professor converter() {
		Professor novoProfessor = new Professor();
		novoProfessor.setNome(this.getNome());
		novoProfessor.setCpf(this.getCpf());
		novoProfessor.setEndereco(this.getEndereco());
		novoProfessor.setAdmissao(admissao);
		return novoProfessor;
	}

	public void imprimirAluno() {
		System.out.println("Aluno\nNome: " + this.getNome() + "\nCpf: " + this.getCpf() + "\nAno e Período de entrada: "
				+ this.getAnoEntrada() + "." + this.getPeriodoEntrada() + "\nEndereço: " + this.transformaEndereco()
				+ ".\n");
	}
}
