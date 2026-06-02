package CadastroAlunosDisciplinas;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		// fase de testes
		AlunoAdimplente a1 = new AlunoAdimplente("Jorge", "123");
		ExAluno a2 = new ExAluno("Pedro", "456");
		AlunoInadimplente a3 = new AlunoInadimplente("Gabriel","789");
		
		a1.imprimir();
		System.out.println("--------------");
		a2.imprimir();
		System.out.println("--------------");
		a3.imprimir();
		
		Disciplina d1 = new Disciplina("POO",1);
		Disciplina d2 = new Disciplina("CALCULO 1",2);
		Disciplina d3 = new Disciplina("PONTOS, RIOS & CANAIS",3);
		
		ListaDisciplina ld = new ListaDisciplina();
		
		
		
		/*try {
			
			
			
		}
		
		catch(Exception Erro) {
			
		} */
	
		
		
	
	}
}