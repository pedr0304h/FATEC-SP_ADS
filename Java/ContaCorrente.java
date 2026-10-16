//Implementação da classe ContaCorrente   

public class ContaCorrente{
   
   private int numConta;
   private String titular;
   private double saldo;
   private double limite;
   
   public ContaCorrente(int n, String t, double s, double l){
      setTitular(t);
      if(n < 0)
         System.out.println("\nNumero da conta invalido!");
      else
         numConta = n;
      if(s < 0)
         System.out.println("\nSaldo inicial invalido!");
      else
         saldo = s;
      if(l < 0)
         System.out.println("\nLimite invalido!");
      else
         limite = l;
   }

   public ContaCorrente(int n, String t, double s){
      this(n, t, s, 1000);
   }

    public ContaCorrente(int n, String t){
      this(n, t, 0, 0);    
   }
   
   public void setTitular(String str){
      titular = str;
   }
   
   public void deposito(double vDeposito){
      if(vDeposito < 0)
         System.out.println("\nValor de deposito invalido!");
      else
         saldo += vDeposito;
   }
      
   public void saque(double vSaque){
      if(vSaque < 0)
         System.out.println("\nValor de saque invalido!");
      else if(vSaque > saldo)
         System.out.println("\nSaldo insuficiente!");
      else   
         saldo -= vSaque;
   }
   
   public void verDados(){
      System.out.printf("\n==================================");
      System.out.printf("\nConta  : %07d", getConta());
      System.out.printf("\nTitular: %s", getTitular());
      System.out.printf("\nSaldo  : R$ %.2f",+ getSaldo());
      System.out.printf("\n==================================");
   }
   
   public int getConta(){
      return numConta;
   }
     
   public String getTitular(){
      return titular;
   }
   
   public double getSaldo(){
      return saldo;
   }  
}
