import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste2 {

	public static void main(String[] args) {
		//Novo Aluno
				Aluno a1 = new Aluno("Gabriel de Sene", 1556566);
				a1.adicionaTipoCarta("A");
				a1.adicionaTipoCarta("B");
				
				//Novo Alunos 2
				Aluno a2 = new Aluno("João", 555555);
				a2.adicionaTipoCarta("B");
				
				//Novo Alunos 2
				Aluno a3 = new Aluno("Isadora", 54253);
				a3.adicionaTipoCarta("A");
						
				//Novo Alunos 2
				Aluno a4 = new Aluno("Silvia", 6547455);
				a4.adicionaTipoCarta("B");
				a4.adicionaTipoCarta("A");
				
				//Novo Alunos 2
				Aluno a5 = new Aluno("Rogério", 53453454);
				a5.adicionaTipoCarta("A");
				
				//Lista para alunos auto escola 1
				List<Aluno> listaDeAluno = new ArrayList<>();
				listaDeAluno.add(a2);
				listaDeAluno.add(a1);
				listaDeAluno.add(a3);
				listaDeAluno.add(a4);
				
				
				//Novas Auto escolas
				AutoEscola ae = new AutoEscola("Auto Engenho", "Rua capitão cezar 546", 56466456, 21341241);
				AutoEscola ae2 = new AutoEscola("Auto Escola Cruz Preta", "Rua Tilapia 544", 31234124, 6543741);
				AutoEscola ae3 = new AutoEscola("Auto Escola Jardim dos Camargos", "Rua da prata 844", 31234124, 6543741);
				AutoEscola ae4 = new AutoEscola("Auto Escola Jardim dos Camargos", "Rua da prata 844", 31234124, 45456456);
				//Lista para auto escola
				List<AutoEscola>listaDeAutoEscola = new ArrayList<>();
				
				//Matriculando aluno na autoescola "ae"
				ae.matriculaAluno(a1);
				ae.matriculaAluno(a2);
				
				//Matriculando aluno na autoescola "ae2"
						ae2.matriculaAluno(a3);
						ae2.matriculaAluno(a4);
						ae2.matriculaAluno(a5);
				
				//Adicionando Auto escola na lista
				listaDeAutoEscola.add(ae);
				listaDeAutoEscola.add(ae2);
				listaDeAutoEscola.add(ae3);
				
//				listaDeAluno.stream().filter( l -> l.getCpf()>54354).forEach(System.out::println);;
//				
				
				List<String> collect = listaDeAluno.stream().map(l -> l.getNome()).collect(Collectors.toList());;
				collect.forEach(System.out::println);
				collect.sort((c1, c2)->c1.compareTo(c2));
				System.out.println();
				
				collect.forEach(System.out::println);
				

	}

}
