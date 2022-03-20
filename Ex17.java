
/**
 *  Implemente um programa que calcula o volume de uma garrafa. O casco
de uma garrafa aproxima-se a dois cilindros de raios r1 e r2 e de alturas
h1 e h2, unidos por um cone de altura h3. Solicite ao usuário os dados
necessários, calcule e escreva o volume da garrafa, sabendo que o volume
de um cilíndro é calculado por vcl = Math.pi*Math.pow(r,2)*h e que o volume de um cone é
dado por vcn = Math.PI*(Math.pow(r1,2)+r1*r2+Math.pow(r2,2)*h/3
 * 
 * @author Gustavo Borges Pasquali
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex17
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double r1,r2, vc1, vc2, vcone, h1, h2, h3, vtotal;
        System.out.print("\fRaio do primeiro cilindro em cm: ");
        r1 = teclado.nextDouble();
        System.out.print("Altura do primeiro cilindro em cm: " );
        h1 = teclado.nextDouble();
        System.out.print("Raio do segundo cilindro em cm: ");
        r2 = teclado.nextDouble();
        System.out.print("Altura do segundo cilindro em cm: ");
        h2 = teclado.nextDouble();
        System.out.print("Altura do cone em cm: ");
        h3 = teclado.nextDouble();
        vc1 = Math.PI*Math.pow(r1,2)*h1;
        vc2 = Math.PI*Math.pow(r2,2)*h2;
        vcone = Math.PI*(Math.pow(r1,2)+r1*r2+Math.pow(r2,2))*h3/3;
        vtotal = Math.round((vc1+vc1+vcone)*100)/100.0;
        System.out.println("O volume da garrafa é: "+vtotal+" cm³");
}
}
