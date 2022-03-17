
/**
 * Escreva uma descrição da classe Ex4 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex4
{
  public static void main(String args[])
  {
  Scanner teclado = new Scanner(System.in);
  double raio, area;
  System.out.print("\fInforme o valor do raio: ");
  raio = teclado.nextDouble();
  area = 4*Math.PI*Math.pow(raio,2);
  System.out.print("Área da esfera =" + area);  
}
}
