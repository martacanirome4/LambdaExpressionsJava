package aplicacion;
import mates.*;
import mates.Mates;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Mates mates = new Mates();

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        System.out.println("Números: "+numeros);

        // 1
        List<Integer> cuadrados = mates.cuadradosLista(numeros);
        System.out.println("Cuadrados: "+cuadrados);

        // 2
        int suma = mates.sumaLista(numeros);
        System.out.println("Suma: "+suma);

        // 3
        List<Integer> pares = mates.paresLista(numeros);
        System.out.println("Pares: "+pares);

        // 4
        int sumaPares = mates.sumaPares(numeros);
        System.out.println("Suma de pares: "+sumaPares);

        // 5
        double media = mates.mediaLista(numeros);
        System.out.println("Media: "+media);

        // 6
        double desviacion = mates.desviacionTipica(numeros);
        System.out.println("Desviación típica: "+desviacion);

        // 7
        int menor = mates.menorLista(numeros);
        System.out.println("Menor elemento de la lista: "+menor);

        List<String> mayusculas = List.of("HOLA", "QUE", "TAL");
        System.out.println("Mayúsculas: "+mayusculas);

        // 8 y 10
        List<String> minusculas = mates.aMinusculas(mayusculas);
        System.out.println("Minúsculas: "+minusculas);

        // 9
        String concatenacion = mates.concatenarCadenas(minusculas);
        System.out.println("Concatenación: "+concatenacion);

        List<String> palabras = List.of("AVIÓN", "JUGUETES", "PALABRAS", "AFRICA");
        System.out.println("Palabras: "+palabras);
        // 11
        List<String> palabrasSinA = mates.noEmpiezaPorA(palabras);
        System.out.println("Palabras que no empiezan por 'a': "+palabrasSinA);

        // 12
        List<Integer> mayorQueSeis = mates.por2MayorQue6(numeros);
        System.out.println("Por 2 y mayor que 6: "+mayorQueSeis);


    }


}