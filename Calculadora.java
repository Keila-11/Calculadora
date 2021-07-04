//
// Calculadora.java
// Por Keila Brito - 03/07/2021
// Desafio_Capgemini_Parte1
//
// Calculadora do alcance de anúncios oline 

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char opcao;
		do{
			System.out.println("\n_____ CALCULADORA DE ALCANCE DE ANUNCIOS _____");
		
			int n = leInteiroPositivo();
			System.out.println("      Visualizacoes obtidas: "+ Criterios(n));
		
			entrada = new Scanner(System.in);
			System.out.print("\n    Deseja realizar novo calculo [s|n]? ");
			opcao = entrada.nextLine().charAt(0);
		
		}while(opcao == 's');
    }
	//----- CRITÉRIOS DE VISUALIZAÇÕES -----
	public static int Criterios (int n){
		
		int Original = 30;
		int Qt_Original = (n*Original);				// Investimento multiplicado
		int Comp_Original = ((Qt_Original/30)*4);   // Compartilhamento do Original
		int Comp_Visualizar = Comp_Original*40;		// Visualizações do compartilhamento
		
		int Clicam2=0;
		int Compartilhar2=0;
		int Visualizacao = 0;
		int Total=0;
		
		if (Qt_Original >= 100){ 
		
			int Clicam = (Qt_Original/100); 
			Clicam2 = Clicam*12; 					// Quantidade de clicadas no anúncio
			
			int Compartilhar = (Clicam2/20);
			Compartilhar2 = Compartilhar*3;			// Quantidade de compartilhamento
			
			Visualizacao = Compartilhar2*40;		// Visualizações dos compartilhamentos
			
			Total= Qt_Original + Comp_Visualizar + Visualizacao; // Total de Visualizações
			
		}else{
			Total= Qt_Original + Comp_Visualizar;
		}
		
        return Total; 
    }
	//---------- LÊ INTEIRO POSITIVO ------------
	public static int leInteiroPositivo(){
        Scanner entrada = new Scanner(System.in);
		
        int n;
        do {
            System.out.print("\n      Quanto deseja investir? ");
            n = entrada.nextInt();  
        } while (n < 0);  
        return n;
    }	
}



	