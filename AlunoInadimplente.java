package CadastroAlunosDisciplinas;

public class AlunoInadimplente extends Aluno {

	private boolean endividado;
	private double dividas;
	
	public AlunoInadimplente(String nome, String matricula) {
		super(nome, matricula);
		this.setHapitoCursar(false);
		this.endividado = true;
	}
	
	public double getDividas() {
		return this.dividas;
	}
	public void setDividas(double dividas) {
		this.dividas = dividas;
	}
	
	public String verificarDividas() {
		if (this.endividado) {
			return "O Aluno possui dividas pendentes.";
		} else {
			return "O Aluno não possui dividas pendentes.";
		}
	}
	
}