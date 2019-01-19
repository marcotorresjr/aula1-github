package course;

public class Produto {
	
	String nome;
	Float valor;

	public Produto() {
		
	}
	
	public Produto(String nome, Float valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
}
