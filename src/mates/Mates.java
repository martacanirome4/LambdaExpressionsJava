package mates;
import mates.*;
import java.util.ArrayList;
import java.util.List;

public class Mates {

    /**
     * Devuelve una lista con el cuadrado de cada elemento de otra lista de números
     * @param numeros - lista de enteros
     * @return cuadrados - lista de enteros con el cuadrado de cada elemento de la lista de entrada
     */
    public static List<Integer> cuadradosLista(List<Integer> numeros) {
        List<Integer> cuadrados = new ArrayList<>();
        numeros.forEach(numero -> cuadrados.add(numero * numero));
        return cuadrados;
    }

    /**
     * Devuelve la suma de los elementos de una lista de números
     * @param numeros - lista de enteros
     * @return suma - suma de los elementos de la lista de entrada
     */
    public static int sumaLista(List<Integer> numeros) {
        int suma = numeros
                    .stream()
                    .reduce(0, (a, b) -> a + b);
                    // 0: valor inicial de la operación y resultado predeterminado si la secuencia está vacía
                    // a = subtotal, b = elemento de la lista
        return suma;
    }

    /**
     * Devuelve la suma de los elementos pares de una lista de números
     * @param numeros - lista de enteros
     * @return suma - suma de los elementos pares de la lista de entrada
     */
    public static int sumaPares(List<Integer> numeros) {
        int suma = numeros
                    .stream()
                    .filter(numero -> numero % 2 == 0)
                    .reduce(0, (a, b) -> a + b);
        return suma;
    }

    /**
     * Devuelve una lista con los elementos pares de otra lista de números
     * @param numeros
     * @return pares - lista con los elementos pares de la lista de entrada
     */
    public static List<Integer> paresLista(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();
        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        });
        return pares;
    }

    /**
     * Devuelve la media de los elementos de una lista de números
     * @param numeros - lista de enteros
     * @return media - double que es la media de los elementos de la lista de entrada
     */
    public static double mediaLista(List<Integer> numeros) {
        int suma = numeros
                    .stream()
                    .reduce(0, (a, b) -> a + b);
        int media = suma / numeros.size();
        return media;
    }

    /**
     * Devuelve la desviación típica de los elementos de una lista de números
     * @param numeros - lista de enteros
     * @return desviación - double que es la desviación típica de los elementos de la lista de entrada
     */
    public static double desviacionTipica(List<Integer> numeros) {
        int suma = numeros
                .stream()
                .reduce(0, (a, b) -> a + b);
        int media = suma / numeros.size();
        double desviacion = Math.sqrt(suma / numeros.size());
        return desviacion;
    }

    /**
     * Devuelve el menor elemento de una lista de números
     * @param numeros - lista de enteros
     * @return - entero que es el menor elemento de la lista de entrada
     */
    public static int menorLista(List<Integer> numeros) {
        return numeros.stream().min(Integer::compareTo).orElse(null);
    }

    /**
     * Devuelve una lista con todos los elementos de otra lista de String en minúsculas
     * @param lista - lista de cadenas de caracteres
     * @return minusculas - lista de cadenas de caracteres en minúsculas
     */
    public static List<String> aMinusculas(List<String> lista) {
        List<String> minusculas = new ArrayList<>();
        lista.forEach(palabra -> minusculas.add(palabra.toLowerCase()));
        return minusculas;
    }

    /**
     * Devuelve una lista con todos los elementos de otra lista de String concatenados
     * @param al - lista de cadenas de caracteres
     * @return cadena - string con la concatenacion de los strings de la lista de entrada
     */
    public static String concatenarCadenas(List<String> al) {
        String cadena = al.stream().reduce("", (a, b) -> a + b);
        return cadena;
    }

    /**
     * Devuelve una lista con todos los elementos de otra lista de String que no empiezan por la letra A
     * @param al - lista de cadenas de caracteres
     * @return sinA - lista de cadenas de caracteres que no empiezan por A
     */
    public static List<String> noEmpiezaPorA(List<String> al) {
        List<String> sinA = new ArrayList<>();
        al.forEach(palabra -> {
            if (!palabra.startsWith("A")) {
                sinA.add(palabra);
            }
        });
        return sinA;
    }

    /**
     * Devuelve una lista con todos los elementos de otra lista de enteros que multiplicados por 2 son mayores que 6
     * @param lista - lista de enteros
     * @return multiplicados - lista de enteros que multiplicados por 2 son mayores que 6
     */
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
