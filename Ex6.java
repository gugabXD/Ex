
/**
 * Faça um programa que converte de Fahrenheit para graus Celsius. O
programa deve ler um valor em Fahrenheit, converter e escrever o valor
correspondente em Celsius. Para realizar a conversão use a fórmula c = 5/9(f-32)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex6
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        int f;
        double c;
        System.out.print("\fDê a temperatura em Farenheit: ");
        f = teclado.nextInt();
        c = (f-32)*5/9;
        System.out.println("Valor equivalente em celsius: " +Math.round(c));
    }
}
