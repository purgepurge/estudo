package POO;

public class Main {
	public static void main(String[] args) {
		//Criando objetos para testar.
		Contato c1 = new Contato("João","hotmail","3322",true); //criando um objeto Contato c1
		Contato c2 = new Contato("maria","outlook","1122", false);//criando um objeto Contato c2
		Agenda a1 = new Agenda (2);//criando um objeto de Agenda a1, que seu array contatos vai ser de tamanho 2.
		//Utilizando os metodos
		a1.addContato(0, c1); //Adicionar o contato c1 na posição 0 de a1.
		
		a1.addContato(1, c2);//Adicionar o contato c2 na posição 1 de a1.
		
		a1.MostrarContatos(); //printa na tela todos os contatos salvos em a1.
	}
	
	
}
