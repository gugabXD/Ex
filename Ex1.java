
/**
 * Execute o programa Java abaixo e descubra o intervalo de representação
do tipos numéricos: int e double
(a) Que outros tipos numéricos (primitivos) existem em Java ?
(b) Quantos bytes cada um desses tipos ocupa de memória ?
(c) Qual o intervalo de representação desses outros tipos numéricos ?
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ex1
{
public static void main(String args[]){
System.out.println("O Tipo int utiliza 4 bytes e consegue representar valores inteiros de :" + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
System.out.println("O Tipo double utiliza 8 bytes e consegue representar valores reais de : " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
}
}
//int -2147483648 a 2147483647
//double 4.9E-324 a 1.7976931348623157E308
//A e B) outros tipos primitivos e tamanho (em bits): byte(8), short(16), long(64) e float(32).
//C)Intervalos -> byte = -128 a 127 / short = -32.768 a 32.767 / long = -2^63 a (2^63)-1 / float = 1,4e-45 a 3,4e+38