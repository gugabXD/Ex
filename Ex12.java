
/**
 * Faça um programa que leia uma quantia inteira em R$ e decompõe essa
quantia na menor quantidade de notas de 100, 50, 20, 10, 5, 2 e 1. Por
exemplo, se o usuário informar R$ 236 como entrada, o programa deve
exibir:
• 2 nota(s) de 100
• 0 nota(s) de 50
• 1 nota(s) de 20
• 1 nota(s) de 10
• 1 nota(s) de 5
• 0 nota(s) de 2
• 1 moeda(s) de 1
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex12
{
   public static void main(String args[])
   {
       int valor, n100, n50, n20, n10, n5, n2, m1, resto;
       Scanner teclado = new Scanner(System.in);
       System.out.print("\fInsira uma quantia: R$");
       valor = teclado.nextInt();
       n100 = valor/100;
       resto = valor%100;
       n50 = resto/50;
       resto = resto%50;
       n20 = resto/20;
       resto = resto%20;
       n10 = resto/10;
       resto = resto%10;
       n5 = resto/5;
       resto = resto%5;
       n2 = resto/2;
       resto = resto%2;
       m1 = resto;
       System.out.print("Irás precisar de:\n•"+n100+" Nota(s) de 100 reais\n•"+n50+" Nota(s) de 50 reais\n•"+n20+" Nota(s) de 20 reais\n•"+n10+" Nota(s) de 10 reais\n•"+n5+" Nota(s) de 5 reais\n•"+n2+" Nota(s) de 2 reais\n•"+m1+" Moeda(s) de 1 real");
   }
}
