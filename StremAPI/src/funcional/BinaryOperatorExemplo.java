package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExemplo
{
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

 // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;
    // Usar o BinaryOperator para somar todos os números no Stream
    int resultado1 = numeros.stream()
        .reduce(0, somar);
    // Imprimir o resultado da soma
    System.out.println("A soma1 dos números é: " + resultado1);
    
    // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    //BinaryOperator<Integer> somar2 = Integer::sum;
    // Usar o BinaryOperator para somar todos os números no Stream

    int resultado2 = numeros.stream()
        .reduce(0, Integer::sum);
    // Imprimir o resultado da soma
    System.out.println("A soma2 dos números é: " + resultado2);
    
    
 // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    //BinaryOperator<Integer> somar2 = (n1, n2) -> n1 + n2;

    // Usar o BinaryOperator para somar todos os números no Stream
    int resultado3 = numeros.stream()
        .reduce(0, new BinaryOperator<Integer>() {
        	@Override
        	public Integer apply(Integer i1, Integer i2) {
        		return i1 + i2;
        	}
        });

    // Imprimir o resultado da soma
    System.out.println("A soma3 dos números é: " + resultado3);

    
 // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    BinaryOperator<Integer> somar2 = Integer::sum;
    //Usar o BinaryOperator para somar todos os números no Stream
    int resultado4 = numeros.stream()
        .reduce(0, somar2);
    // Imprimir o resultado da soma
    System.out.println("A soma4 dos números é: " + resultado4);

 // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    //Usar o BinaryOperator para somar todos os números no Stream
    int resultado5 = numeros.stream()
        .reduce(0, (x1, x2) -> x1 + x2);
    // Imprimir o resultado da soma
    System.out.println("A soma5 dos números é: " + resultado5);
    
    
    
    
    
  }
}
