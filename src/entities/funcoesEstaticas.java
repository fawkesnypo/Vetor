package entities;

import java.util.Scanner;

public class funcoesEstaticas {
	public static Integer decisao;
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
	
}
