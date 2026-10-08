/* Atividade - Triangulo

Dados 3 valores, verifique se os mesmos formam um triângulo ou não. Caso afirmativo, 
informe se é escaleno, isósceles ou equilátero.

*/
import java.util.Scanner;

public class Triangulo{
   public static void main(String[] main){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Digite os lados do triangulo: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      
      if ((a < b + c) && (b < a + c) && (c < a + b)) //Verifica se existe   
         System.out.println("Esse triangulo existe!"); 
         if((a == b) && (b == c))
            System.out.println("Esse triangulo é equilatero!"); 
         else if ((a == b) || (a == c) || (b == c))
                 System.out.println("Esse triangulo é isoceles!"); 
              else
                 System.out.println("Esse triangulo é escaleno!"); 
      else
         System.out.println("Esse triangulo não existe!");     
 
      input.close(); 
   }
}
