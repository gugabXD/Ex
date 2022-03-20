
/**
 *  Construa um programa que calcula o digito verificador de uma conta corrente de 3 dígitos. Para isso, inicialmente o programa deve solicitar ao
usuário o número dessa conta. O programa deve, então, calcular o dígito
verificador da seguinte forma:
(a) Soma o número da conta com um valor que corresponde ao número
na ordem inversa. (Ex: para numero = 235, o valor na ordem inversa
é 532. Faça 235 + 532 = 767)
(b) Multiplica cada dígito do valor encontrado em (a) pela sua posição e
soma os valores encontrados. (Ex:7x1 + 6x2 + 7x3 = 40)      
(c) O último dígito do valor encontrado em (b) é o dígito verificador
(Ex:40 → 0).
O programa, o final da execução, deve escrever a conta e o seu digito
verificador (Exemplo: 235.0).
 * 
 * @author Gustavo Borges Pasquali
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Ex18
{
   public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       int numero, uni, dez, cem, verificador, ninverso, a, b, pos1, pos2, pos3;
       double resultado;
       System.out.print("\fNúmero da conta: ");
       numero = teclado.nextInt();
       cem = numero/100;
       dez = numero%100/10;
       uni = numero%10;
       ninverso = uni*100+dez*10+cem;
       a = numero + ninverso;
       pos1 = a/100;
       pos2 = a%100/10;
       pos3= a%10;
       b = pos1+pos2*2+pos3*3;
       verificador = b%10;
       resultado = numero+verificador/10.0;
       System.out.print("Conta e verificador: " +resultado);
   }
}
