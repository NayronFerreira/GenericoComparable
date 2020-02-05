package entidade;

public class Produto implements Comparable <Produto>{
	
	private String nome;
	private Double preço;
	public Produto(String nome, Double preço) {
		
		this.nome = nome;
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preço=" + preço + "]";
	}
	@Override
	public int compareTo(Produto arg0) {
		
		return nome.compareTo(arg0.getNome());
	}
	
	

}
