import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class AutoEscola implements Comparable<AutoEscola> {
	private String nome;
	private String endereco;
	private int cnpj;
	private int cep;
	private List<Aluno>listaAlunos = new ArrayList<>();
	private int contadorDeAlunos = 0;
	
	
	public AutoEscola(String nome, String endereco, int cnpj, int cep) {
		if(nome.equals(null) || endereco.equals(null)|| cnpj == 0 || cep ==0) {
			throw new NullPointerException("Algum campo não foi digitado!");
		}
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.cep = cep;
		
	}
	
	public int getContadorDeAlunos() {
		return contadorDeAlunos;
	}
	
	public int getCep() {
		return cep;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Auto escola: "+this.nome+", Endereco: "+this.endereco+", cep: "+this.cep+", Total de alunos: "+this.contadorDeAlunos;
	}

	@Override
	public int compareTo(AutoEscola o) {
		
		return this.nome.compareTo(o.getNome());
	}
	
	public List<Aluno> getListaAlunos() {
		return Collections.unmodifiableList(listaAlunos);
	}
	
	public void matriculaAluno(Aluno aluno) {
		listaAlunos.add(aluno);
		this.contadorDeAlunos +=1;
		
	}
	
	

}
