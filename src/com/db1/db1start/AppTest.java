package com.db1.db1start;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    //Exercícios de Inteiro (Integer)
    @Test
    public void testeSomar(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.somar(3,5);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeSubtrair(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.subtrair(5,3);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeMultiplicar(){
        Application application = new Application();
        Integer expected = 4;
        Integer response = application.multiplicar(2,2);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeDividir(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.dividir(4,2);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeNumber(){
        Application application = new Application();
        Boolean expected = true;
        Boolean response = application.par(10);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeMaior(){
        Application application = new Application();
        Integer expected = 25;
        Integer response = application.maior(25,20);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeImpares(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.impares(10);
        Assert.assertEquals(expected,response);
    }
    //Exercícios de Texto (String)
    @Test
    public void testeMaiuscula(){
        Application application = new Application();
        String expected = "FELIPE";
        String response = application.maiuscula("felipe");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeMinuscula(){
        Application application = new Application();
        String expected = "felipe";
        String response = application.minuscula("FELIPE");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeQtdd(){
        Application application = new Application();
        int quantidade = application.qtddLetras();
        Assert.assertEquals(7, quantidade);
    }
    @Test
    public void testeEspacos(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.espaco(" DB1START ");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeQuatroLetras(){
        Application application = new Application();
        String expected = "Feli";
        String response = application.nomeQuatroLetras("Felipe");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeTerceiraLetra(){
        Application application = new Application();
        String expected = "ipe";
        String response = application.nomeTerceiraLetra("Felipe");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeQuartaLetra(){
        Application application = new Application();
        String expected = "lipe";
        String response = application.nomeQuartaLetra("Felipe");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeAlterarNome(){
        Application application = new Application();
        String expected = "Aluno Valentim";
        String response = application.nomeAlterar("Felipe Valentim");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeSepararTexto(){
        Application application = new Application();
        String[] esperado =
                new String[]{"banana","maca","melancia"};
        String[] resultado =
                application.separarTexto("banana, maca, melancia");
        Assert.assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testeQtddVogaisTexto(){
        Application application = new Application();
        Integer expected = 4;
        Integer response = application.qtddVogais("Rogerio");
        Assert.assertEquals(expected,response);
    }


}
