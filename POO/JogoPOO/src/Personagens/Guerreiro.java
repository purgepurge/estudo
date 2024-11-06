package Personagens;

import SistemaInventario.Arma;

public class Guerreiro extends Personagem{
	
	public Guerreiro() {}
	
	public void usarRespiroDeVida() {
		vida_Personagem += (1/4) * vidamax_Personagem;
		System.out.println("você respira profundamente e sente uma sensação de renovo, vida atua: "+ vida_Personagem);
	}
	
	public static void usarAtaqueBrutal(Arma arma) {
		
	}


	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}
	

}
