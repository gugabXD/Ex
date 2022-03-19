
/**
 * Um robô precisa percorrer um piso revestido com cerâmidas pretas e brancas. Crie um programa que recebe como entrada a linha e a coluna (ver
imagem abaixo) correspondente a cada cerâmica do piso e escreve 0 quando
a cerâmica tem cor preta e 1 quando a cerâmica tem cor branca.
 * 0101
 * 1010
 * 0101
 * 1011
 * @author Gustavo Borges Pasquali
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex13
{
   public static void main(String args[])
   {
       String[][] piso={{"preto","branco","preto","branco"},{"branco","preto","branco","preto"},{"preto","branco","preto","branco"},{"branco","preto","branco","branco"}};
       int linha, coluna;
       Scanner teclado = new Scanner(System.in);
       System.out.print("\fEscolha a linha: ");
       linha = teclado.nextInt();
       System.out.print("Escolha a coluna: ");
       coluna = teclado.nextInt();
       String quadrado = piso[linha-1][coluna-1];
       if(quadrado == "branco"){System.out.println("1");} else{
           System.out.println("2");}
       }
        }
