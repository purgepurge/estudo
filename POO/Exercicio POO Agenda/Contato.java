package POO;

public class Contato {
	//Atributos
	String nome;
	String email;
	String telefone;
	boolean favorito;
	
	//Construtores
	public Contato (String nome, String email, String telefone, boolean favorito) { //construtor "padrão" de uma classe.
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.favorito = favorito;
	}
	public Contato () {} //construtor vazio, caso seja preciso criar um contato e depois adicionar os atributos.
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isFavorito() {
		return favorito;
	}
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}
	
	
	
	
	
}
