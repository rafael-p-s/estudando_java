package OOComposicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Rafael");
		Aluno aluno2 = new Aluno("Irene");
		Aluno aluno3 = new Aluno("Gabriel");
		
		Curso curso1 = new Curso("ADS");
		Curso curso2 = new Curso("Engenharia");
		Curso curso3 = new Curso("ADM");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno1);
		
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso: "+curso1.name);
			System.out.printf("E meu nome é %s",aluno.name);
			System.out.println();
			System.out.println();
		}
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso: "+curso2.name);
			System.out.printf("E meu nome é %s",aluno.name);
			System.out.println();
			System.out.println();
		}
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso: "+curso3.name);
			System.out.printf("E meu nome é %s",aluno.name);
			System.out.println();
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).alunos);
		System.out.println();
		Curso cusroEncontrado = aluno1.getCursoByName("ADS");
		if(cusroEncontrado != null) {
			System.out.println(cusroEncontrado.name);
			System.out.println(cusroEncontrado.alunos);
		}
	}
}
