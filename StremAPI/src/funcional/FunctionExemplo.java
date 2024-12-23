package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExemplo {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar a Function com expressão lambda para dobrar todos os números
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    
    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    List<Integer> numerosDobrado1 = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());
    numerosDobrado1.forEach(xx -> System.out.println("n="+xx));

    
    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    List<Integer> numerosDobrado2 = numeros.stream()
        .map(n -> n * 2)
        .toList();

    // Imprimir a lista de números dobrados
    numerosDobrado2.forEach(System.out::println);
    
    
 // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    List<Integer> numerosDobrado3 = numeros.stream()
        .map(
        		new Function<Integer, Integer>()
        		{
        		  @Override
        		  public Integer apply(Integer m)
        		  {
        			return m*3;
        		  }
        		}
        		)
        .collect(Collectors.toList());
    numerosDobrado3.forEach(xx -> System.out.println("m="+xx));
    
    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    List<Integer> numerosDobrado4 = numeros.stream()
        .map(m -> m * 4)
        .toList();
    numerosDobrado4.forEach(xx -> System.out.println("z="+xx));    
    
  }
}