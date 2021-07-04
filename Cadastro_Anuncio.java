//
// Cadastro_Anuncio.java
// Por Keila Brito - 03/07/2021
// Desafio_Capgemini_Parte2
//
// Cadastro de Anúncios 

import java.util.Scanner;

public class Cadastro_Anuncio{
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		char opcao;
		do{
			
			System.out.println("\n __________ CADASTRO DE ANUNCIOS __________");
			
			Cadastro();
		
			entrada = new Scanner(System.in);
			System.out.print("\n  Deseja realizar novo cadastro [s|n]? ");
			opcao = entrada.nextLine().charAt(0);
		
		}while(opcao == 's');
	}
	
	public static void Cadastro (){
		Scanner entrada = new Scanner(System.in);
		
		entrada = new Scanner(System.in);
		System.out.printf("\n       Digite o nome do anuncio: ");
		String nome = entrada.nextLine();
		
		entrada = new Scanner(System.in);
		System.out.printf("       Digite o nome do cliente: ");
		String cliente = entrada.nextLine();
		
		System.out.printf("       Digite o tempo de investimento: ");
		int tempo = entrada.nextInt();
		
		System.out.println("\n -------- INFORMACOES APRESENTADAS --------");
		System.out.println("\n       NOME DO ANUNCIO: " + nome);
		System.out.println("       CLIENTE: " + cliente);
		System.out.println("       TEMPO DE INVESTIMENTO " + tempo);	
		
		Criterios(tempo);
		
		/*int n=0;
		Criterios(n);*/
	}
	
	//----- CRITÉRIOS DE VISUALIZAÇÕES -----
	public static int Criterios (int n){
		int m = leInteiroPositivo();
		
		float tempo = m/n; // Tempo de investimento
		
		int Original = 30;
		int Qt_Original = (m*Original);				// Investimento multiplicado
		int Comp_Original = ((Qt_Original/30)*4);   // Compartilhamento do Original
		int Comp_Visualizar = Comp_Original*40;		// Visualizações do compartilhamento
		
		int Clicam2=0;
		int Compartilhar2=0;
		int Visualizacao= 0;
		int Total=0;
		int TotalD=0;
		int TotalQ=0;
		int TotalC=0;
		
		if (Qt_Original >= 100){ 
		
			int Clicam = (Qt_Original/100); 
			Clicam2 = Clicam*12; 					// Quantidade de clicadas no anúncio
			
			int Compartilhar = (Clicam2/20);
			Compartilhar2 = Compartilhar*3;			// Quantidade de compartilhamento
			
			Visualizacao = Compartilhar2*40;		// Visualizações dos compartilhamentos
			
		}
			Total= ((Qt_Original + Comp_Visualizar + Visualizacao)*n); // Total de Visualizações total
			TotalD= Qt_Original + Comp_Visualizar + Visualizacao;     // Total de Visualizações por dia 
			TotalQ= ((Comp_Original + Compartilhar2)*n);             //Total de Compartilhamentos
			TotalC= Clicam2*n;                                      //Total de Clicadas 
		
			System.out.println("\n --------------- RELATORIOS ---------------");
			System.out.println("\n      "+ Total + " Visualizacoes total");
			System.out.println("      "+ TotalD + " Visualizacoes por dia");
			System.out.println("      "+ TotalC + " Clicadas total");
			System.out.println("      "+ TotalQ + " Compartilhamentos total");
			System.out.println("      R$ "+m+" de investimento total");	
			System.out.println("      R$ "+tempo+" de investimento por dia ");
			
		return 0;
    }	
	//---------- LÊ INTEIRO POSITIVO ------------
	public static int leInteiroPositivo(){
        Scanner entrada = new Scanner(System.in);
		
        int n;
        do {
            System.out.print("\n       Quanto deseja investir?: ");
            n = entrada.nextInt();  
        } while (n < 0);  
        return n;
    }
}