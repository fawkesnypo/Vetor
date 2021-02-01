package entities;

import java.util.Scanner;

public class Menu {
	private static Integer opcao,selecao;
	static Scanner sc = new Scanner(System.in);
	
	//método criado para a escolha da função
	public static void menu() {

		Cliente[] vect= new Cliente[11];
		Hotel quartos = new Hotel();
		
		opcao = 0;
		
		do {
			System.out.println("\n\n### SISCO - Sistema de controle  ###");
			System.out.println("\n      =========================");
			System.out.println("      |     1 - Check-in      |");
			System.out.println("      |     2 - Check-out     |");
			System.out.println("      |     3 - Consulta      |");
			System.out.println("      |     4 - Relatório     |");
			System.out.println("      |     0 - Sair          |");
			System.out.println("      =========================\n");
			
			selecaoMenu();
			opcao = selecao;
			System.out.print("\n");
			
			switch (opcao) {
			case 1:
				quartos.checkIn(vect);
				break;
				
			case 2:
				quartos.checkOut(vect);
				break;
			
			case 3:
				quartos.consulta(vect);
				break;
			
			case 4:
				quartos.relatorio(vect);
				break;
				
			default:
				break;
			}
			
			
		} while (opcao != 0);
		
	}
	
	//Função para selecionar opção através de string
	public static Integer selecaoMenu() {
		
		int x = 0;
		do {
			System.out.printf("Informe a opção desejada:");
			String select = sc.nextLine();
			select=select.toLowerCase();
			
			if (select.contains("1")||select.contains("check-in")) {
				selecao=1;
				x=1;
			}
			
			else if (select.contains("2")||select.contains("check-out")) {
				selecao=2;
				x=1;
			}
			
			else if (select.contains("3")||select.contains("consulta")) {
				selecao=3;
				x=1;
			}
			
			else if (select.contains("4")||select.contains("relat")) {
				selecao=4;
				x=1;
			}
			
			else if (select.contains("0")||select.contains("sair")) {
				selecao=0;
				x=1;
			}
			
			if (x!=1) {
				System.out.println("Opção inválida!\n");
				x=0;
			}
			
		} while (x!=1);
		
		return selecao;
	}
	

}