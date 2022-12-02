import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Teste {

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
		
		//Adicionando Auto escola na lista
		listaDeAutoEscola.add(ae);
		listaDeAutoEscola.add(ae2);
		listaDeAutoEscola.add(ae3);
		
//		listaDeAutoEscola.forEach(System.out::println);
		
		System.out.println();
		
//		listaDeAutoEscola.sort((l1, l2)->l2.getNome().compareTo(l1.getNome()));
//		
//		listaDeAutoEscola.forEach(System.out::println);
		
		System.out.println("Total de Alunos:"+ (ae.getContadorDeAlunos()+ae2.getContadorDeAlunos()));
		
//		listaDeAluno.stream().sorted((l1, l2)->l2.getNome().compareTo(l1.getNome())).forEach(System.out::println);;
		
//		listaDeAluno.stream().filter(l -> l.getTipoCarta().contains("B")).map( l -> l.getNome()).forEach(System.out::println);;
//		
//		//Coletor
//		
//		List<String> collect = listaDeAluno.stream().filter(l -> l.getTipoCarta().contains("B")).map( l -> l.getNome()).collect(Collectors.toList());;
//		System.out.println();
//		collect.forEach(System.out::println);
		
		listaDeAluno.stream().filter(l -> l.getTipoCarta().contains("B")).collect(Collectors.toMap(
				l -> l.getTipoCarta(),
				l -> l.getNome()
				)).forEach((tipoCarta, nome)->System.out.println("Tipo da carta: "+tipoCarta+", Aluno: "+nome));;;;
		
		
		listaDeAluno.stream().filter(l -> l.getNome().contains("I")).collect(Collectors.toMap(
				l -> l.getNome(),
				l -> l.getTipoCarta()
				)).forEach((nome, tipoCarta )-> System.out.println("Nome: "+nome+" Tipo da Carta:"+ tipoCarta));;;
				
				
				int sum = (int)listaDeAutoEscola.stream().mapToDouble( l -> l.getListaAlunos().size()).sum();
				
				System.out.println();
				System.out.println(sum);
		
		
		
		
		
		
		
//		System.out.println(ae.getListaAlunos());

	}

}
