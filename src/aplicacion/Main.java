package aplicacion;
import mates.*;
import mates.Mates;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Mates mates = new Mates();

        // 1
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        System.out.println("Números: "+numeros);

        // 2
        List<Integer> cuadrados = mates.cuadradosLista(numeros);
        System.out.println("Cuadrados: "+cuadrados);

        // 3
        int suma = mates.sumaLista(numeros);
        System.out.println("Suma: "+suma);

        // 4
        List<Integer> pares = mates.paresLista(numeros);
        System.out.println("Pares: "+pares);

        // 5
        int sumaPares = mates.sumaPares(numeros);
        System.out.println("Suma de pares: "+sumaPares);

        // 6
        double media = mates.mediaLista(numeros);
        System.out.println("Media: "+media);

        // 7
        double desviacion = mates.desviacionTipica(numeros);
        System.out.println("Desviación típica: "+desviacion);

        // 8 + 10
        int menor = mates.menorLista(numeros);
        System.out.println("Menor elemento de la lista: "+menor);

        // 9
        List<String> mayusculas = List.of("HOLA", "QUE", "TAL");
        System.out.println("Mayúsculas: "+mayusculas);

        // 11
        List<String> minusculas = mates.aMinusculas(mayusculas);
        System.out.println("Minúsculas: "+minusculas);

        //
        String concatenacion = mates.concatenarCadenas(minusculas);
        System.out.println("Concatenación: "+concatenacion);


    }


}