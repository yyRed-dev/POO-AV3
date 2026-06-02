package CadastroAlunosDisciplinas;

public class Disciplina {

	private String nome;
	private int codigo;
	
	public Disciplina(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String imprimirDisciplina() {
		return "Nome: " + this.getNome() + " | Codigo: " + this.getCodigo() ;
	}
	
}