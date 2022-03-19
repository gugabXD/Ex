
/**
 *Faça um programa que leia a capacidade (em litros) do tanque de um
carro, o seu consumo médio (km/litro) e a distância (em km) que esse
carro precisa percorrer. O programa deve calcular e escrever tantas vezes
será necessário parar para abastecer para que o carro consiga percorrer a
distância informada.
 * 
 * @author Gustavo Borges Pasquali 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex20
{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
   double consumo, dist,vezes;
   int cap;
   System.out.print("\fDiga a capacidade do carro em litros: ");
   cap = teclado.nextInt();
   System.out.print("Diga o seu consumo médio em km/l: ");
   consumo = teclado.nextDouble();
   System.out.print("Diga a distância a ser percorrida em km: ");
   dist = teclado.nextDouble();
   vezes = dist*consumo/cap;
   System.out.print("Essa é a quantidade de vezes que será preciso reabastecer: " +Math.round(Math.ceil(vezes)));
}
}
