package mates;
import mates.*;
import java.util.ArrayList;
import java.util.List;

public class Mates {

    // ejercicio 1
    public static List<Integer> cuadradosLista(List<Integer> numeros) {
        List<Integer> cuadrados = new ArrayList<>();
        numeros.forEach(numero -> cuadrados.add(numero * numero));
        return cuadrados;
    }

    // ejercicio 2
    public static int sumaLista(List<Integer> numeros) {
        int suma = numeros
                    .stream()
                    .reduce(0, (a, b) -> a + b);
                    // 0: valor inicial de la operación y resultado predeterminado si la secuencia está vacía
                    // a = subtotal, b = elemento de la lista
        return suma;
    }

    // ejercicio 3
    public static int sumaPares(List<Integer> numeros) {
        int suma = numeros
                    .stream()
                    .filter(numero -> numero % 2 == 0)
                    .reduce(0, (a, b) -> a + b);
        return suma;
    }

    // ejercicio 4
    public static List<Integer> paresLista(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();
        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        });
        return pares;
    }


    // ejercicio 5
    public static double mediaLista(List<Integer> numeros) {
        int suma = numeros
                    .stream()
                    .reduce(0, (a, b) -> a + b);
        int media = suma / numeros.size();
        return media;
    }


    // ejercicio 6
    public static double desviacionTipica(List<Integer> numeros) {
        int suma = numeros
                .stream()
                .reduce(0, (a, b) -> a + b);
        int media = suma / numeros.size();
        double desviacion = Math.sqrt(suma / numeros.size());
        return desviacion;
    }

    // ejercicio 7
    public static int menorLista(List<Integer> numeros) {
        return numeros.stream().min(Integer::compareTo).orElse(null);
    }


    // ejercicio 8 / 10
    public static List<String> aMinusculas(List<String> lista) {
        List<String> minusculas = new ArrayList<>();
        lista.forEach(palabra -> minusculas.add(palabra.toLowerCase()));
        return minusculas;
    }


    // ejercicio 9
    public static String concatenarCadenas(List<String> al) {
        String cadena = al.stream().reduce("", (a, b) -> a + b);
        return cadena;
    }


    // ejercicio 11
    // Devuelve una lista con todos los elementos de otra lista de String que no empiezen por la letra ‘A’
    public static List<String> noEmpiezaPorA(List<String> al) {
        List<String> sinA = new ArrayList<>();
        al.forEach(palabra -> {
            if (!palabra.startsWith("A")) {
                sinA.add(palabra);
            }
        });
        return sinA;
    }

    // ejercicio 12
    // Devuelve una lista con todos los números mayores que seis resultantes de multiplicar por 2 todos los elementos
    // de una lista de entrada
    public static List<Integer> por2MayorQue6(List<Integer> lista) {
        List<Integer> multiplicados = new ArrayList<>();
        lista.forEach(numero -> {
            if (numero * 2 > 6) {
                multiplicados.add(numero * 2);
            }
        });
        return multiplicados;
    }



}