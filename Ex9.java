
/**
 * Faça um programa que lê a altura de uma pessoa em metros e a escreve
em centímetros e em milímetros.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex9
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        double altura, acm, amm;
        System.out.print("\fInforme sua altura: ");
        altura = teclado.nextDouble();
        acm = altura*100;
        System.out.println("Sua altura em centímetros: "+acm);
        amm = altura*1000;
        System.out.println("Sua altura em milímetros: "+amm);
    }
}
