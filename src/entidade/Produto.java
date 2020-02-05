package entidade;

public class Produto implements Comparable <Produto>{
	
	private String nome;
	private Double pre�o;
	public Produto(String nome, Double pre�o) {
		
		this.nome = nome;
		this.pre�o = pre�o;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPre�o() {
		return pre�o;
	}
	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", pre�o=" + pre�o + "]";
	}
	@Override
	public int compareTo(Produto arg0) {
		
		return nome.compareTo(arg0.getNome());
	}
	
	

}
