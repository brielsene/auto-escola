import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private int cpf;
	private List<String>tipoCarta = new ArrayList<>();
	private AutoEscola autoescola;
	
	
	public Aluno(String nome, int cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+this.nome+", cpf: "+this.cpf+", Tipos de carta: "+this.tipoCarta;
	}
	
	public List<String> getTipoCarta() {
		return tipoCarta;
	}
	
	public void adicionaTipoCarta(String tipo) {
		this.tipoCarta.add(tipo);
	}
	

	
	

}
