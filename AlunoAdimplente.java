package CadastroAlunosDisciplinas;

public class AlunoAdimplente extends Aluno {

	public AlunoAdimplente(String nome, String matricula) {
		super(nome, matricula);
		this.setHapitoCursar(true);
	}
	
}