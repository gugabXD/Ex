
/**
 * Implemente um programa que lê um (único) valor inteiro de 4 dígitos. A
seguir, esse programa deve escrever um inteiro que corresponde ao valor
lido na ordem inversa. (Exemplo: 1234 → 4321)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex11
{
  public static void main(String args[])
  {
      Scanner entrada = new Scanner(System.in);
      int valor, vinverso, mil, cem, dez, uni;
      System.out.println("\fDigite um valor de quatro dígitos: ");
      valor = entrada.nextInt();
      while(valor <=-9999 || valor >=9999){
          System.out.println("Erro: O valor digitado deve que conter, no máximo, quatro dígitos.");
          valor = entrada.nextInt();}
      if(valor >=-9999 && valor<=9999){ mil = valor/1000;
            cem = valor%1000/100;
            dez = valor%100/10;
            uni = valor%10;
            vinverso = uni*1000+dez*100+cem*10+mil;
            System.out.println("Esse é o valor ao contrário com 4 dígitos: " +vinverso);   
        }
    }
}


     
  

