//Implementação da classe Circulo

public class Circulo{
   
   private double raio;
   
   public Circulo(double r){
      setRaio(r);
   }
   
   public void setRaio(double r){
      if(r < 0)
         System.out.println("O raio não pode ser negativo!");
      else
         raio = r;
   }
      
   public double getRaio(){
      return raio;
   }
   
   public double getDiametro() {
    return 2 * raio;
   }

   public double getArea() {
      return Math.PI * Math.pow(raio, 2);
   }

   public double getCircunferencia() {
      return 2 * Math.PI * raio;
   }   
   
   public void exibeDados(){
      System.out.printf("Dados do circulo de raio %f\n", getRaio());
      System.out.printf("Diametro: %.2f\nArea: %.2f\nCircunferencia: %.2f\n",
      getDiametro(), getArea(), getCircunferencia());
   }
}