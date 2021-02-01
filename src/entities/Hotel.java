package entities;

import java.util.Scanner;

public class Hotel {
	Scanner sc = new Scanner(System.in);
	
	//Realiza o cadastro do cliente no vetor, informando o quarto, nome e e-mail
	public void checkIn(Cliente[] vect) {
		
		for (int i = 1; i!=123;) {
			System.out.println("###Check-in###");
			System.out.printf("Nome: ");
			String nome = sc.nextLine();
			System.out.printf("E-mail: ");
			String email = sc.nextLine();
			System.out.printf("Qual quarto deseja(1-10): ");
			int quarto = sc.nextInt();
			System.out.printf("Quarto: "+ quarto+"\n");
			
			i=quarto;
			
			//Tratamento para opção inválida
			if(i<=0 || i>10){
				System.out.println("Opção inválida!");
				i=0;
			}
			
			//Tratamento para caso a posição do vetor já esteja ocupada
			if (vect [i] != null) {
				System.out.println("Quarto ocupado!");
				System.out.printf("Informe outro quarto: ");
				quarto = sc.nextInt();
				System.out.printf("Quarto: "+ quarto+"\n");
				i=quarto;
			}
			
			//Realiza a inserção dos dados no vetor
			if (vect [i] == null&&(i>0 && i<=10)) {
				vect [i] = new Cliente(email, nome, quarto);
				sc.nextLine();	
				i=0;
			}
			
			funcoesEstaticas.desejaEncerrar();
			i=funcoesEstaticas.decisao;
		}
	}
	
	//Realiza o check-out
	public void checkOut(Cliente[] vect) {
		for (int i = 0; i!= 123;) {
			System.out.println("###Check-out###\n");
			System.out.println("Informe o número do quarto: ");
			i = sc.nextInt();
			
			//Tratamento para o caso da posição do vetor não estar dentro do permitido
			if (i<1 || i>10) {
				System.out.println("Opção inválida!");
				i=0;
			}
			
			//Tratamento para caso a posição esteja vazia
			else if (vect[i]==null) {
				System.out.println("Quarto "+i+": Vazio!");
				i=0;
			}
			
			//Tratamento para o caso da posição do vetor possuir valor
			else {
				vect[i]=null;
				System.out.println("Check-out realizado");
				sc.nextLine();
				i=0;
			}
			
			funcoesEstaticas.desejaEncerrar();
			i=funcoesEstaticas.decisao;
			
		}
	}
	
	//Realiza uma consulta no vetor, informando posição do registro:
	public void consulta(Cliente[] vect) {
		
		for (int i = 0; i!= 123;) {
			System.out.println("###Consulta de quartos###\n");
			System.out.println("Informe o número do quarto: ");
			i = sc.nextInt();
			
			//Tratamento para o caso da posição do vetor não estar dentro do permitido
			if (i<1 || i>10) {
				System.out.println("Opção inválida!");
				i=0;
			}
			
			//Tratamento para caso a posição esteja vazia
			else if (vect[i]==null) {
				System.out.println("Quarto "+i+": Vazio!");
				i=0;
			}
			
			//Tratamento para o caso da posição do vetor possuir valor
			else {
				System.out.println(vect[i].toString());
				sc.nextLine();
				i=0;
			}
			
			funcoesEstaticas.desejaEncerrar();
			i=funcoesEstaticas.decisao;
			
		}
		
	}
	
	//Exibe todos os dados dentro do vetor
	public void relatorio(Cliente[] vect) {
		
		System.out.println("###Relatório###");
		for (int i = 1; i < 11; i++) {
			
			//Tratamento para caso a posição esteja vazia
			 if (vect[i]==null) {
				System.out.println("Quarto "+i+": Vazio!\n");
			}
			
			//Tratamento para o caso da posição do vetor possuir valor
			else {
				System.out.println(vect[i].toString());
			}
		
		}
			
	}
}
