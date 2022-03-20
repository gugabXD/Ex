
/**
 * Faça um programa que leia a quantidade e a altura dos degraus de uma
escada. A seguir, o programa deve solicitar a altura do usuário e a altura
que essa pessoa deseja atingir ao usar a escada. A partir desses dados, o
programa deve informar quantos degraus a pessoa deve subir para atingir
a altura desejada. O programa deve informar também a altura máxima
que essa pessoa pode atingir se subir todos os degraus da escada.
 * 
 * @author Gustavo Borges Pasquali
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex16
{
   public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       int degq;
       double dega, ap, ad,degn,atotal;
       System.out.print("\fQuantidade de degraus: ");
       degq = teclado.nextInt();
       System.out.print("Altura de cada degrau em metros: ");
       dega = teclado.nextDouble();
       System.out.print("Sua altura em metros: ");
       ap = teclado.nextDouble();
       System.out.print("Altura desejada em metros: ");
       ad = teclado.nextDouble();
       degn = Math.ceil((ad-ap)/dega);
       atotal = dega*degq+ap;
       System.out.println("Para a altura desejada, suba essa quantidade de degraus: "+Math.round(degn));
       System.out.println("Altura máxima subindo os degraus: "+atotal+  " metros");
   }
}
