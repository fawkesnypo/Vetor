package entities;

import java.util.Scanner;

public class funcoesEstaticas {
	public static Integer decisao,selecao;
	static Scanner sc = new Scanner(System.in);

	//Tratamento para opção de encerrar
	public static int desejaEncerrar() {
		decisao=0;
		if (decisao==0) {
			do {
				System.out.println("\nDeseja continuar? (s/n)");
				char resp = sc.next().charAt(0);
			
				if (resp=='n'||resp=='N') {
				System.out.println();
				decisao=123;
				sc.nextLine();
				}
				
				else if (!(resp=='s'||resp=='S')) {
					System.out.println("Opção inválida!");
					decisao=-1;
				}
				
				else {
					System.out.println();
					decisao=1;
					sc.nextLine();
				}
				
			} while (decisao<0);
		}
		
		return decisao;
		
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
