/* Atividade - Temperatura

Faça um programa em Java que leia uma temperatura em Fahrenheit, calcule e exiba seu valor em Celsius.

*/

import java.util.Scanner;

public class Temperatura
{
   public static void main(String main[])
   {
      Scanner inputTemperatura = new Scanner(System.in);
      float temperaturaCelsius, temperaturaFahrenheit;
      
      System.out.println("Conversão de temperatura para Celsius");
      System.out.println("Digite a temperatura em Fahrenheit:");
      temperaturaFahrenheit = inputTemperatura.nextFloat();
      
      temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
      
      System.out.printf("Temperatura em Celsius: %.1f\n", temperaturaCelsius);
      
      inputTemperatura.close();
   }
}

