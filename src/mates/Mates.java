package mates;
import mates.*;
import java.util.ArrayList;

public class Mates {
    public static List<Integer> cuadradosLista(List<Integer> numeros) {
        List<Integer> cuadrados = new ArrayList<>();
        numeros.forEach(numero -> cuadrados.add(numero * numero));
        return cuadrados;
    }
}