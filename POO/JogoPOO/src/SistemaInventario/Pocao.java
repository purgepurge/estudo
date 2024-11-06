package SistemaInventario;

public class Pocao extends Item{
	
	//atributos
	
	public int restauracao;
	
	//construtor
	
	public Pocao(int restauracao) {
		restauracao = this.restauracao;
	}
	
	public Pocao() {}
	
	//getters and setters
	
	public int getRestauracao() {
		return restauracao;
	}

	public void setRestauracao(int restauracao) {
		this.restauracao = restauracao;
	}
	
	//metodos
	
	public void beberPocao(int vida_Personagem, int vidamax_Personagem) {
		vida_Personagem += restauracao;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
			}
		System.out.println("você restaurou: "+restauracao+ "sua vida atual é: "+vida_Personagem);
		
	}
}
