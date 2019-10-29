package agenda;

import java.util.Scanner;

public class Menu {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		String opcao;
		Agenda agenda = new Agenda();
		int posicao;
		
		do{
			System.out.println("(C)adastrar contato");
			System.out.println("(L)istar contatos");
			System.out.println("(E)xibir contato");
			System.out.println("(S)air");
			System.out.print("Op��o>");
			opcao = entrada.nextLine();
			
			switch (opcao){
			case "C":
				System.out.print("Posi�ao: ");
				posicao = entrada.nextInt();
				entrada.nextLine();
				System.out.print("Nome: ");
				String nome = entrada.nextLine();
				System.out.print("Sobrenome: ");
				String sobrenome = entrada.nextLine();
				System.out.print("Telefone: ");
				String telefone = entrada.nextLine();
				
				boolean situacao = agenda.cadastrarContato(posicao, nome, sobrenome, telefone);
				
				if (situacao){
					System.out.println("CADASTRO REALIZADO!");
				}
				else{
					System.out.println("POSI��O INV�LIDA!");
				}
				break;
				
			case "L":
				System.out.println(agenda.listaContatos());
				break;
				
			case "E":
				System.out.print("Posi�ao: ");
				posicao = entrada.nextInt();
				entrada.nextLine();
				System.out.println(agenda.exibirContato(posicao));
				break;
				
			case "S":
				System.out.println("Opera��o finalizada!");
				return;
				
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}
		while (!opcao.equals("S"));

	}
}
