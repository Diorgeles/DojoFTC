public class jokenpoTeste {
	
	private int Pedra = 1;
	private int Papel = 2;
	private int Tesoura = 3;
	private Jogador jogador;
	
	
	
	public void teste(int jogador1, int jogador2)
	{
		if(jogador1 == jogador2)
		{
			System.out.println("empate");
		}
		if(jogador1 != jogador2 )
		{
			if(jogador1 == 1 && jogador2 == 2)
			{
				System.out.println("Jogador 2 ganhou!");
			}
			
			if(jogador1 == 2 && jogador2 == 3)
			{
				System.out.println("Jogador 2 ganhou!");
			}
			
			if(jogador1 == 3 && jogador2 == 1)
			{
				System.out.println("Jogador 2 ganhou!");
			}
		}
		
		
		Jogador jog01 = new Jogador("Uelington", "Conceição", 2);
		Jogador jog02 = new Jogador("Luciano", "Martins", 3);
		
	
		public void jogando(){
			if(){
				
			}
		}
			
	}
	
	
	
	
	
	
	
	
	public void Teste_Pedra_vs_Pedra(int Jogador1, int Jogador2)
	{
		if(Jogador1 == Jogador2)
		{
			System.out.println("Empate");
		}		
	}
	
	public void Teste_Pedra_vs_Papel(int Jogador1, int Jogador2)
	
	
		if(Jogador1 = )
		{
			System.out.println("");
		}		
	}

	
	public void pedraGanha(int pedra, int papel, int tesoura){
	
			if(pedra > tesoura){
				System.out.println("Pedra venceu");
			}
		
		
	}
}