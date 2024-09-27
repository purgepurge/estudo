package POO;

public class Agenda {
	
	//Atributos
	Contato [] contatos; //array do tipo Contatos, aqui não declaramos o tamanho no atributo, deixamos livre para ser definido no construtor.
	
	//Construtor
	public Agenda (int n) { //construtor que cria o objeto Agenda, onde definimos qual vai ser o tamanho do Array Contatos.
		this.contatos= new Contato[n];
	}
	
	//Métodos
	public void addContato (int position, Contato contatos) {//método que serve para pegar a posição que foi colocada como parâmetro e adiciona o contato escolhido nessa posição
		this.contatos[position] = contatos;
	}
	
	public void MostrarContatos () { // método que vai usar o FOR para pecorrer todas as posições do array contatos, printando na tela os seus atributos e usando uma condicional para mostrar se é um favorito ou não
		for (int i = 0; i < contatos.length; i++) {
			System.out.println(contatos[i].nome);
			System.out.println(contatos[i].email);
			System.out.println(contatos[i].telefone);
			if (contatos[i].favorito == true) {
				System.out.println("é favorito");
			}else {
				System.out.println("não é favorito");
			}
		}
	}
	//Getters and Setters
	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	

}
