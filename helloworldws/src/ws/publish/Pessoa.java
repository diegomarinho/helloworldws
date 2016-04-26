package ws.publish;

public class Pessoa {

	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
