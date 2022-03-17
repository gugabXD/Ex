
/**
 *  Faça um programa que leia as dimensões de um terreno (largura e comprimento) e a dimensões da casa (largura e comprimento) construída nesse
mesmo terreno, o programa deve calcular e escrever a área livre existente
no terreno.
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex8
{
   public static void main(String args[])
   {
       Scanner teclado = new Scanner(System.in);
       int cterreno, lterreno, ccasa, lcasa, aterreno, acasa, alivre;
       System.out.print("\fInsira o comprimento do terreno: ");
       cterreno = teclado.nextInt();
       System.out.print("Insira a largura do terreno: ");
       lterreno = teclado.nextInt();
       System.out.print("Insira o comprimento da casa: ");
       ccasa = teclado.nextInt();
       System.out.print("Insira a largura da casa: ");
       lcasa = teclado.nextInt();
       aterreno = cterreno*lterreno;
       acasa = ccasa*lcasa;
       alivre = aterreno-acasa;
       System.out.println("Essa é a área livre do terreno: " +alivre +"m²");
   }
}
