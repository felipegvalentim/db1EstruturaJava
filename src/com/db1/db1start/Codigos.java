//package com.db1.db1start;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

//public class App {
// Exercicios 1 e 2 com metodos
//    public static Integer soma(Integer numero1, Integer numero2) {
//        Integer resultado;
//        resultado = numero1 + numero2;
//        return resultado;

//        public static Integer soma(Integer numero1, Integer numero2) {
//        Integer resultado;
//        resultado = numero1 - numero2;
//        return resultado;

//Exercicios 3 e 4 com metodos
//    public static String lowerCase(String texto){
//        return texto.toLowerCase();
//    }
//    public static String uperCase(String texto){
//        return texto.toUpperCase();
//    }

    //Exercicio 5
//    public static Double menor(Double valor1, Double valor2){
//        if(valor1 < valor2){
//            return valor1;
//        }
//            return valor2;
//    }
    //Exercicio 6
//    public static Double menor(Double valor1, Double valor2){
//        if(valor1 < valor2){
//            return valor1;
//        }
//            return valor2;
//    }
//    public static Double menor(Double valor1, Double valor2, Double valor3) {
//        return menor(menor(valor1, valor2),valor3);
//    }

//public static void main(String[] args) {

// Exercicios 1 e 2 com metodos
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Informe número 01: ");
//        Integer numero1 = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Informe número 02: ");
//        Integer numero2 = scan.nextInt();
//        scan.nextLine();
//        Integer resultado = soma(numero1, numero2);
//        System.out.println(resultado);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Informe número 01: ");
//        Integer numero1 = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Informe número 02: ");
//        Integer numero2 = scan.nextInt();
//        scan.nextLine();
//        Integer resultado = soma(numero1, numero2);
//        System.out.println(resultado);

//Exercicio 3 e 4 com metodos
//      Scanner ler = new Scanner(System.in);
//      System.out.println("Informe um nome: ");
//      String texto = ler.nextLine();
//      System.out.println("Maiusculo: " + uperCase(texto));
//      System.out.println("Minusculo: " + lowerCase(texto));

        //Exercicios 5 e 6 metodos
//        Scanner ler = new Scanner(System.in);
//        System.out.println("Informe um número: ");
//        Double valor1 = ler.nextDouble();
//        System.out.println("Informe outro número: ");
//        Double valor2 = ler.nextDouble();
//        System.out.println("menor valor: "+menor(valor1,valor2));
        //Exercicio 6
//}
//}
// * Exercício  de informar o número menor * \\
//Scanner ler = new Scanner(System.in);
//System.out.println("Digite um número:");
//Integer valor1 = ler.nextInt();
//System.out.println("Digite um número:");
//Integer valor2 = ler.nextInt();
//if(valor1 > valor2){
//System.out.println("Valor 1 maior que valor 2");
//System.out.println("Soma dos dois valores: " + (valor1+valor2));
//}else{
//System.out.println("Valor 1 menor que valor 2");
//System.out.println("Subtração dos dois valores: " + (valor1-valor2));}

// * Exercício  de alterar o tamanho das letras * \\
//Scanner ler = new Scanner(System.in);
//System.out.println("Informe um nome:");
//String textoNormal = ler.nextLine();
//String maisculo =textoNormal.toUpperCase();
//String minusculo =textoNormal.toLowerCase();
//System.out.println("Texto normal: " + textoNormal);
//System.out.println("Texto Maiusculo: " + maisculo);
//System.out.println("Texto Minusculo: " + minusculo);

//* Exercicio de informar qual é o maior e menor valor *\\
//Scanner ler = new Scanner(System.in);
//System.out.println("Informe o primeiro valor:");
//Integer valor1 = ler.nextInt();
//System.out.println("Informe o segundo valor:");
//Integer valor2 = ler.nextInt();
//System.out.println("Informe o terceiro valor:");
//Integer valor3 = ler.nextInt();
//if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
//System.out.println("V1: " + valor1 + " é maior");
//System.out.println("V3: " + valor3 + " é menor");
//}
//else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2 ){
//System.out.println("V1: " + valor1 + " é maior");
//System.out.println("V2: " + valor2 + " é menor");
//}
//else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3 ){
//System.out.println("V2: " + valor2 + " é maior");
//System.out.println("V3: " + valor3 + " é menor");
//}
//else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1 ){
//System.out.println("V2: " + valor2 + " é maior");
//System.out.println("V1: " + valor1 + " é menor");
//}
//else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2 ){
//System.out.println("V3: " + valor3 + " é maior");
//System.out.println("V2: " + valor2 + " é menor");
//}
//else if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1 ){
//System.out.println("V3: " + valor3 + " é maior");
//System.out.println("V1: " + valor1 + " é menor");