package entities;

import java.util.Scanner;

public class Menu {
	private static Integer opcao;
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
			
			opcao = sc.nextInt();
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

}