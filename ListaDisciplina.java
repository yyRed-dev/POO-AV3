package CadastroAlunosDisciplinas;
import java.util.ArrayList;
import java.util.List;

public class ListaDisciplina implements ImprimirDisciplinas {
	
	private ArrayList<Disciplina> listaDisciplinas;
	
	public ListaDisciplina() {
		listaDisciplinas = new ArrayList<>();
	}
	
	public void adicionarDisciplina(Disciplina disciplina) {
		listaDisciplinas.add(disciplina);
	}
	
	public void removerDisciplina(Disciplina disciplina) {
		listaDisciplinas.remove(disciplina);
	}
	
	public void mostrarDisciplina(int indice) {
		System.out.println("Nome: " + (listaDisciplinas.get(indice) ).getNome()
							+ " | Codigo: " + (listaDisciplinas.get(indice) ).getCodigo() );
	}
	
	@Override
	public void imprimirDisciplinas() {
		System.out.println("=== Lista de Disciplinas ===");
		
		for (int indice=0; indice<listaDisciplinas.size(); indice++) {
			this.mostrarDisciplina(indice);
		}
		
	}

}