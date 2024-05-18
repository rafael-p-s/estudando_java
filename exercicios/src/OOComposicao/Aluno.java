package OOComposicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String name;
	List<Curso> cursos = new ArrayList<Curso>();

	Aluno(String name) {
		this.name = name;
	}

	void adicionarCruso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	Curso getCursoByName(String name) {
		for (Curso curso : this.cursos) {
			if (curso.name.equalsIgnoreCase(name)) {
				return curso;
			}
		}
		return null;
	}

	// Lista todos os alunos:
	public String toString() {
		return name;
	}
}
