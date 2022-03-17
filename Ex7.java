
/**
 *Construa um programa que leia dois valores inteiros e escreve na tela:
 * (a) a soma
(b) a diferença
(c) a média
(d) a distância (valor absoluto da diferença)
(e) o maior dos dois (use maior = (a+b+Math.abs(a-b))/2)
(f) o menor dos dois (use menor = (a+b-Math.abs(a-b))/2)

Pesquise, na API da classe Math, as funções que encontram o maior e o
menor de dois valores. A seguir, reescreva os itens e e f usando as funções
encontradas.
 * 
 */
import java.util.Scanner;
public class Ex7
{
   public static void main(String args[])
   {
       Scanner teclado = new Scanner(System.in);
       int a, b, soma, dif, dist, maior, menor;
       double media;
       System.out.print("\fEscolha um número: ");
       a = teclado.nextInt();
       System.out.print("Escolha outro número: ");
       b = teclado.nextInt();
       soma = a+b;
       System.out.println("Soma: " +soma);
       dif = a-b;
       System.out.println("Diferença: " +dif);
       media = (a+b)/2.0;
       System.out.println("Média: " +media);
       dist = Math.abs(a-b);
       System.out.println("Distância: " +dist);
       maior = (a+b+Math.abs(a-b))/2;
       System.out.println("Maior: " +maior);
       menor = (a+b-Math.abs(a-b))/2;
       System.out.println("Menor: " +menor);
       maior = Math.max(a,b);
       menor = Math.min(a,b);
       System.out.println("Funções diferentes: \n Maior: " +maior);
       System.out.println("Menor: " +menor);
   }
}
