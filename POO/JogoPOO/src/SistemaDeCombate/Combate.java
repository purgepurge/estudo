package SistemaDeCombate;

import Personagens.Personagem;

public class Combate {
	
	public Personagem jogador;
	public Inimigo inimigo;
	
	public Combate(Personagem jogador, Inimigo inimigo) {
		jogador = this.jogador;
		inimigo = this.inimigo;
	}
	
	public Combate() {}

	public Personagem getJogador() {
		return jogador;
	}

	public void setJogador(Personagem jogador) {
		this.jogador = jogador;
	}

	public Inimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(Inimigo inimigo) {
		this.inimigo = inimigo;
	}
	
	

}
