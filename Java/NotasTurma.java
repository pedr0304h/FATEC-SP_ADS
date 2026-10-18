/*Implementação da classe notasTurma

Utilização de constantes e arrays bidimensionais*/

import java.util.Scanner;

public class NotasTurma {
	public static void main(String args[]) {
	   
		final int ALUNOS = 5;
		final int PROVAS = 2;
	
		int lin, col;
		double media, somaMedias = 0, mediaTurma, mediaAluno;
	
		double notas[][] = new double[ALUNOS][PROVAS];
		Scanner entrada = new Scanner(System.in);
	
		for (lin = 0; lin < ALUNOS; lin++){
			System.out.printf("\nDigite as notas do %dº aluno: ", lin+1);
		  
			for (col = 0; col < PROVAS; col++)
				notas[lin][col] = entrada.nextDouble();
		} 
	   
		for (lin = 0; lin < ALUNOS; lin++) {
			media = 0;
		
			for (col = 0; col < PROVAS; col++)
				media += notas[lin][col];
		
			somaMedias += media / PROVAS;
		}
	   
		mediaTurma = somaMedias / ALUNOS;
		System.out.printf("\nMédia da turma: %2.1f", mediaTurma);
	
		System.out.println("\n\nNotas e Média ");
	   
		for (lin = 0; lin < ALUNOS; lin++){
			System.out.printf("\nAluno %d: ", lin+1);
			media = 0;
		   
			for (col = 0; col < PROVAS; col++){
				System.out.printf("%2.1f ", notas[lin][col]);
				media += notas[lin][col];
				}
		   
			mediaAluno = media / PROVAS;
			
         if(mediaAluno > mediaTurma)
				System.out.printf(" - Média %2.1f - Acima da média", mediaAluno);
			else if(mediaAluno < mediaTurma)
				System.out.printf(" - Média %2.1f - Abaixo da média", mediaAluno);
			else
				System.out.printf(" - Média %2.1f - Na média", mediaAluno);
		}          
	} 
}