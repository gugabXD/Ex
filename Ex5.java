
/**
 * Implemente um programa que leia um valor n, calcule e escreva n^2, n^3 e n^4.

 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex5
{
 public static void main(String args[])
 {
     Scanner teclado = new Scanner(System.in);
     double n, n2, n3, n4;
     System.out.print("\fEscolha um número: ");
     n = teclado.nextDouble();
     n2 = Math.pow(n,2);
     System.out.println("n^2 = " +n2);
     n3 = Math.pow(n,3);
     System.out.println("n^3 = " +n3);
     n4 = Math.pow(n,4);
     System.out.println("n^4 = " +n4);
 }
}
