package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExemplo
{
  public static void main(String[] args) {
    // Criar uma lista de palavras
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
    palavras.forEach(x -> System.out.println("palavra="+x+" qtde letras="+x.length()));
  
    // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
    // imprimir cada palavra que passou no filtro
    System.out.println("\n Palavra mais de 5 caracteres:");
    		
    palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(x -> System.out.println("palavra="+x+" qtde letras="+x.length()));
    
    
    System.out.println("\n outro Palavra mais de 5 caracteres:");
    palavras.stream()
        .filter(
        		new Predicate<String>()
        		{
        			@Override
        			public boolean test(String s) {
        				return s.length()>5;
        			}
        		}
        		)
        .forEach(x -> System.out.println("palavra="+x+" qtde letras ="+x.length()));
    
    //////outro
    System.out.println("\n novo Palavra mais de 5 caracteres:");
    palavras.stream()
        .filter( p -> p.length() > 5)
        .forEach(x -> System.out.println(" a palavra="+x+" qtde letras ="+x.length()));
  
    
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    numeros.forEach(x -> System.out.println("n="+x));
    
    System.out.println("\n Pares:");
    numeros.stream()
        .filter( p -> p % 2 == 0)
        .forEach(x -> System.out.println(" par="+x));
  
    
  }
}
