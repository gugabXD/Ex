
/**
 * Construa um programa que lê o tempo de um evento em segundos e o
escreve decomposto em horas, minutos e segundos.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex10
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        int seg, min, h, resto, segundos;
        System.out.print("\fInsira o tempo decorrido em segundos: ");
        seg = teclado.nextInt();
        h = seg/3600;
        resto = seg%3600;
        min = resto/60;
        segundos = resto-min*60;
        System.out.println("Resultado = "+h+" hora(s), "+min+" minuto(s) e "+segundos+" segundo(s) ");
    }
}