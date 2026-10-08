//Media - solução com estrutura de decisão encadeada

import java.util.Scanner;

public class Media{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double n1, n2, media;
        
      System.out.println("Digite as duas Notas");
      n1 = input.nextDouble();
      n2 = input.nextDouble();
      media = (n1 + n2)/2;
      
      if (media >= 6)
         System.out.println("Aprovado!\nMedia: " + media);
      else if(media >= 4)
               System.out.println("Recuperação! \nMedia: " + media);
           else   
               System.out.println("Reprovado! \nMedia: " + media);
         
      input.close();
   }
}