package entrega1; 

public class HelloWorld {
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	private String data;
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void imprimir() {
		System.out.println(this.getData() + " - " + "Olá " + this.getNome() +
		". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}

}
