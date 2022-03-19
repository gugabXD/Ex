
/**
 *Implemente um programa que leia o horário de um evento qualquer ocorrido durante o dia. Considerando que o horário é representado em hora,
minuto e segundo, o programa deve:
(a) converter esse horário para segundos e escrever tal informação na
tela.
(b) escrever na tela quantos segundos faltam para o dia acabar.
 * 
 * @author Gustavo Borges Pasquali
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex15
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hora,min,seg,segt,segf;
        System.out.print("\fInforme as horas: ");
        hora = teclado.nextInt();
        System.out.print("Informe os minutos: ");
        min = teclado.nextInt();
        System.out.print("Informe os segundos: ");
        seg = teclado.nextInt();
        segt = hora*3600+min*60+seg;
        System.out.println("Esse é o total de segundos nesse horário: " +segt);
        segf = 86400 -segt;
        System.out.println("Esse é o total de segundos faltando para acabar o dia: "+segf);
    } 
}

