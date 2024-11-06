package SistemaInventario;

public class Armadura extends Item {
	
	//Atributos
	
	public int defesa;
	public String tipo;
	
	//Construtor
	
	public Armadura(int defesa, String tipo) {
		defesa = this.defesa;
		tipo = this.tipo;
	}
	
	public Armadura() {}
	
	//Getters and Setters

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodos

}
