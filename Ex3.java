
/**
 *  O programa abaixo apresentará um erro de representação. Exibirá Diferenca =
0.07000000000000028 ao invés de Diferenca = 0.07. Sem modificar os
tipos das variáveis, como podemos corrigir esse erro para que o programa
exiba o resultado correto ?
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ex3
{
   public static void main(String args[]){
double valorDaCompra = 19.93;
double pagamento = 20.0;
double diferenca = pagamento - valorDaCompra;
double arredondamento = Math.round(diferenca*100)/100.0;
System.out.println("\fDiferenca = " + arredondamento);
}
}
