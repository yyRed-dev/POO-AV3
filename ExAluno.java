package CadastroAlunosDisciplinas;

public class ExAluno extends Aluno {

	public ExAluno(String nome, String matricula) {
		super(nome, matricula);
		this.setHapitoCursar(false);
	}
	
}