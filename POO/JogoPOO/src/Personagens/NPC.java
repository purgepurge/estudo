package Personagens;

public class NPC extends Personagem{
	
	public String nome_NPC;
	public String dialogos_NPC[];
	
	public NPC(String nome_NPC, String dialogos_NPC[]) {
		nome_NPC = this.nome_NPC;
		dialogos_NPC = this.dialogos_NPC;
	}
	
	public NPC() {}

	public String getNome_NPC() {
		return nome_NPC;
	}

	public void setNome_NPC(String nome_NPC) {
		this.nome_NPC = nome_NPC;
	}

	public String[] getDialogos_NPC() {
		return dialogos_NPC;
	}

	public void setDialogos_NPC(String[] dialogos_NPC) {
		this.dialogos_NPC = dialogos_NPC;
	}

	@Override
	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}
	
	//metodos

}