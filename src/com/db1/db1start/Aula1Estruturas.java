package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula1Estruturas {
    public static void main(String[] args) {
        List<String> coresPreferidas = new ArrayList<>();
        coresPreferidas.add("Azul");
        coresPreferidas.add("Branco");
        coresPreferidas.add("Verde");
        coresPreferidas.add("Preto");

        coresPreferidas.addAll(Arrays.asList());
        exibir(coresPreferidas);
    }
    private static void exibir(List<String> coresPreferidas) {
        System.out.println(coresPreferidas);
    }
}
