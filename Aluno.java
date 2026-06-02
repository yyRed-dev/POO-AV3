package CadastroAlunosDisciplinas;

public abstract class Aluno implements ImprimirAluno {

	protected String nome;
	protected String matricula;
	protected boolean hapitoCursar;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public boolean getHapitoCursar() {
		return this.hapitoCursar;
	}
	public void setHapitoCursar(boolean hapitoCursar) {
		this.hapitoCursar = hapitoCursar;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Nome: " + this.getNome()
						+ "\nMatricula: " + this.getMatricula() 
						+ "\nEstado: " + ( this.getHapitoCursar() ? "Ativo" : "Inativo" ));
	}
	
}