package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExemplo {
  public static void main(String[] args)
  {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) 
      {
        System.out.println("metodo1="+numero);
      }
    };
    //metodo 1
    numeros.stream().forEach(imprimirNumeroPar);
    
    //metodo 2
    numeros.stream().forEach(new Consumer<Integer>() {
    	@Override
    	public void accept(Integer ni)
    	{
    		if (ni % 2 == 0) 
    	      {
    	        System.out.println("metodo2="+ni);
    	      }
    	}
    });
    
    //metodo3
    // Usar o Consumer para imprimir números pares no Stream
    System.out.println("metodo3:");
    numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    
  }//main
}//class