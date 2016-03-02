import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Jogador jogador = new Jogador();
		jokenpoTeste joken = new jokenpoTeste();
//		joken.setPedra(1);
//		joken.Teste_Get_Pedra_vs_Pedra(1, 1);
		

		System.out.println("Digite a escolha: PEDRA = 1, PAPEL = 2, TESOURA = 3 ");
		teclado = new Scanner(System.in);
		
		
		if(){
			
		}
		
		/*switch(teclado){
		case:
			
			System.out.println("Pedra ganhou");
			break;
		}*/
		
		
		System.out.println("Digige o valor da Pedra");
		joken.setPedra(teclado.nextInt());
		
		System.out.println("Digite o valor de Tesoura");
		joken.setTesoura(teclado.nextInt());
		
	}

}
