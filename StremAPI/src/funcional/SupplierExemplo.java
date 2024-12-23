package funcional;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExemplo {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes1 = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
    listaSaudacoes1.forEach(sai -> System.out.println("metodo1="+sai));
    
    
    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes2 = Stream.generate(
    		new Supplier<String>() {
    			@Override
    			public String get()
    			{
    				return "Ola, metodo2!!!!";
    			}//get
    		}//new
    		).limit(5).toList();
    listaSaudacoes2.forEach(System.out::println);
      
    
    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes3 = Stream.generate(saudacao).limit(5).toList();
    // Imprimir as saudações geradas
    listaSaudacoes3.forEach(System.out::println);
    
    
 // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes4 = Stream.generate(
    		() -> {
    				return "Ola, metodo4!!!!";
    		      }//new
    		).limit(5).toList();
    listaSaudacoes4.forEach(System.out::println);
    
 // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes5 = Stream.generate(() -> "Ola,outro  metodo5!!!!").limit(5).toList();
    listaSaudacoes5.forEach(System.out::println);
    
    
    
  }
}
