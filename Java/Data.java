/* Implementação da classe Data */

public class Data {
   
   private int dia;
   private int mes;
   private int ano;
   
   public Data(int d, int m, int a){
      setData(d, m, a);
   }
   
   public Data(int m, int a){
      setData(1, m, a);
   }
   
   public Data(int a){
      setData(1, 1, a);
   }
   
   public void setData(int d, int m, int a){
      if(m > 0 && m <= 12)
         mes = m;
      else{
         mes = 1;
         System.out.println("\nMes " + m + " inválido.\nConfigurado mes = 1.\n");
      }
      ano = a;
      dia = checkDia(d);
   }
      
   private int checkDia(int diaTeste){
      int diasMes[] = {0 , 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      if(bissexto(ano))
         diasMes[2] = 29;      
      if(diaTeste > 0 && diaTeste <= diasMes[mes])
         return diaTeste;
      System.out.println("\nDia " + diaTeste + " Invalido.\nConfigurado dia = 1.\n");
      return 1;
   }
   
   public int getDia(){
      return dia;
   } 
   
   public int getMes(){
      return mes;
   } 

   public int getAno(){
      return ano;
   } 
   
   private boolean bissexto(int anoTeste){
      if ((anoTeste % 4 == 0 && anoTeste % 100 != 0) || (anoTeste % 400 == 0))
         return true;
      return false;
   } 

   public String toString(){
      return dia + "/" + mes + "/" + ano;
   }
}