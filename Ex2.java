
/**
 * Teste o programa Java a seguir e indique a diferença entre as funções:
round, floor e ceil. Para obter mais informações sobre as funções acesse
também a Application Programming Interface (API) da classe Math
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner; 
public class Ex2
{
public static void main(String args[]){
Scanner entrada = new Scanner(System.in);
System.out.println("\fInforme um valor real: ");
double valor = entrada.nextDouble();
System.out.println("Resultado de floor(" + valor+ ")=" +
Math.floor(valor));
System.out.println("Resultado de ceil(" + valor+ ")=" + Math.ceil(valor));
System.out.println("Resultado de round(" + valor+ ")=" +
Math.round(valor));
}
}
// Round entrega o int mais próximo do valor dado, literalmente um arredondamento.
// Floor dá o valor inteiro (em double) mais alto menor que ou igual ao número dado, como se estivesse arredondando para baixo. (Ex: 30.9 => 30.0; 30 => 30.0)
// Ceil dá o valor inteiro (em double) mais baixo maior que ou igual ao número dado, como se estivesse arredondando para baixo. (Ex: 30.1 => 31.0; 30 => 30.0)