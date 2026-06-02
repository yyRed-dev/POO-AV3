package CadastroAlunosDisciplinas;
import java.util.ArrayList;
import java.util.List;

public class ListaDisciplina implements ImprimirDisciplinas {
	
	private ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
	
	public ListaDisciplina() {
		listaDisciplinas = new ArrayList<>();
	}
	
	@Override
	public void imprimirDisciplinas() {
		System.out.println("Lista de Disciplinas:");
		
		for (int x=0; x<listaDisciplinas.size(); x++) {
			System.out.println("Nome: " + (listaDisciplinas.get(x) ).getNome()
							+ "( | Codigo: " + (listaDisciplinas.get(x) ).getCodigo() );
		}
		
	}

}