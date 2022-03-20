
/**
 * Na ginástica olímpica, a nota de um atleta é a soma das notas de duas
bancas de árbitros: banca A e banca B. A nota da banca A é a nota de
partida do atleta. A nota da banca B é calculada da seguinte forma:
(a) 6 juízes atribuem notas ao atleta;
(b) a nota mais baixa e a mais alta são descartadas;
(c) é feita a média das notas restantes.
Faça um programa que leia a nota da banca A e as notas dos 6 juízes.
O programa deve calcular e escrever a média da banca B e a nota final
do atleta. Para calcular a nota da banca B use as fórmulas :maior = (a+b+Math.abs(a-b))/2 e menor = (a+b-Math.abs(a-b))/2
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex19
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a, b1, b2, b3, b4, b5, b6, bmedia, notaFinal, maior12, maior34, maior56, menor12, menor34, menor56;
        double maior1234, menor1234, maior123456, menor123456;
        System.out.print("\fNota A: ");
        a = teclado.nextDouble();
        System.out.print("Primeiro juíz: ");
        b1 = teclado.nextDouble();
        System.out.print("Segundo juiz: ");
        b2 = teclado.nextDouble();
        System.out.print("Terceiro juiz: ");
        b3 = teclado.nextDouble();
        System.out.print("Quarto juiz: ");
        b4 = teclado.nextDouble();
        System.out.print("Quinto juiz: ");
        b5 = teclado.nextDouble();
        System.out.print("Sexto juiz: ");
        b6 = teclado.nextDouble();
        maior12 = (b1+b2+Math.abs(b1-b2))/2;
        maior34 = (b3+b4+Math.abs(b3-b4))/2;
        maior56 = (b5+b6+Math.abs(b5-b6))/2;
        maior1234 = (maior12+maior34+Math.abs(maior12-maior34))/2;
        maior123456 = (maior1234+maior56+Math.abs(maior1234-maior56))/2;
        menor12 = (b1+b2-Math.abs(b1-b2))/2;
        menor34 = (b3+b4-Math.abs(b3-b4))/2;
        menor56 = (b5+b6-Math.abs(b5-b6))/2;
        menor1234= (menor12+menor34-Math.abs(menor12-menor34))/2;
        menor123456 = (menor1234+menor56-Math.abs(menor1234-menor56))/2;
        bmedia = (b1+b2+b3+b4+b5+b6-maior123456-menor123456)/4;
        System.out.println("Média da banca B: " +bmedia);
        notaFinal = a+bmedia;
        System.out.print("Nota Final: " +notaFinal);
    }
}
