package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        //*for (int i = 0; i < aprovados.size() ; i++) {
        // System.out.println(aprovados.get(i));

        System.out.println("Usando o foreach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator..."); //tem próximo.
        Iterator<String> iterator = aprovados.iterator(); //percorre lista criada. É UMA INTERFACE

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nUsando Stream..." ); ///usando sequencia de dados..
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //Laço interno!!!!

    }
}

