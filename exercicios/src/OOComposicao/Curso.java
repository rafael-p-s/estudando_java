package OOComposicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	final String name;
	final List<Aluno> alunos = new ArrayList<>();//"lista constante, que foi instânciada na memoria. Porém a lista é constante os itens dentro dela não."
//	No caso ao criar um novo curso, uma nova instância é criada para receber novos alunos.	
	Curso(String name){
		this.name = name;
	}
	
	void adicionarAluno(Aluno aluno){
		//realação bidirecional
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
