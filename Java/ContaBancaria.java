/*
Numa agência bancária, as contas são identificadas por números de até 6 dígitos seguidos de um dígito verificador, calculado da seguinte forma:

Ex.: Seja n = 7314 o número da conta.
Obtemos a soma dos dígitos de n: s = 7+3+1+4 = 15
Obtemos o dígito verificador a partir do resto da divisão de s por 10: d = s % 10 = 15 % 10 = 5

O número da conta é: 007314-5
Dado um número de conta n, exiba o número de conta completo correspondente.

*/
import java.util.Scanner;

public class ContaBancaria{
   public static void main(String[] args){
      
      System.out.print("Digite o numero da conta corrente: ");
      Scanner input = new Scanner(System.in); 
      int n, s = 0, d;
      int conta = input.nextInt();
      n = conta;
      
      do{
      s = s + (n%10);
      n = n/10;
      }while(n != 0);
      
      d = s%10;
      System.out.printf("Conta bancaria: %06d-%d", conta, d);
      
      input.close();
   }
}
