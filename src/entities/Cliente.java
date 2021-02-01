package entities;

public class Cliente {

	private String email, nome;
	private Integer nmrQuarto;
	
	public Cliente(String email, String nome, int nmrQuarto) {
		this.email = email;
		this.nome = nome;
		this.nmrQuarto = nmrQuarto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}

	public int getNmrQuarto() {
		return nmrQuarto;
	}
	
	public void setNmrQuarto(int quarto) {
		this.nmrQuarto=quarto;
	}
	
	public String toString() {
		return "Quarto "+getNmrQuarto()+":"
			+"\n"
			+"Cliente: " + getNome()
			+"\n"
			+"E-mail: "+ getEmail()
			+"\n";
	}
	
}
