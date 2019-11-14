package com.db1.db1start;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsandoListas {
    public static void main(String[] args){
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");

        frutas.add(Arrays.asList("Jaca","Caju"));
        imprimir("Frutas iniciais:",frutas);

        frutas.add(Arrays.asList("Jaca","Caju"));
        imprimir("Mais iniciais:",frutas);

        System.out.println("Primeiro Banana: "
                + frutas.indexOf("Banana"));


        System.out.println(frutas.lastIndexOf("Banana"));

        private static void imprimir(){

        }


    }
}
