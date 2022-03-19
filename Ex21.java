
/**
 * Uma empresa de bolinhas de gude precisa de um programa que calcula
a quantidade de caixas necessárias para embalar as bolinhas. A empresa
trabalha com caixas cuja capacidade é de 100 bolinhas. Faça um programa
que leia a quantidade de bolinhas, calcule e escreva a quantidade de caixas
necessárias para embalar as bolinhas.
 * 
 * @author Gustavo Borges Pasquali 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex21
{
    public static void main(String args[]){
        int bolinhas;
        double caixas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\fIndique a quantidade de bolinhas: ");
        bolinhas = teclado.nextInt();
        caixas = bolinhas/100.0;
        System.out.print("Essa é a quantidade de caixas necessária: " +Math.round(Math.ceil(caixas)));
    }
}
