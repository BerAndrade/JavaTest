/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testefaixaetaria;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bernardo
 */
public class ClassificaFaixaEtariaTeste {
    
    public ClassificaFaixaEtariaTeste() {       
    }
   

    @Test
    public void testClassificarIdadeInvalida() {
        System.out.println("Teste de Idade inválida");
        int idade = 0;
        ClassificaFaixaEtaria instance = new ClassificaFaixaEtaria();
        String expResult = "Idade inválida";
        String result = instance.classificar(idade);
        System.out.println("Saída: "+result+"\n");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testClassificarCriança() {
        System.out.println("Teste Criança");
        int idade = 2;
        ClassificaFaixaEtaria instance = new ClassificaFaixaEtaria();
        String expResult = "Criança";
        String result = instance.classificar(idade);
        System.out.println("saida: "+result+"\n");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testClassificaAdolescente() {
        System.out.println("Teste Adolescente");
        int idade = 12;
        ClassificaFaixaEtaria instance = new ClassificaFaixaEtaria();
        String expResult = "Adolescente";
        String result = instance.classificar(idade);
        System.out.println("saida: "+result+"\n");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testClassificaAdulto() {
        System.out.println("Teste Adulto");
        int idade = 19;
        ClassificaFaixaEtaria instance = new ClassificaFaixaEtaria();
        String expResult = "Adulto";
        String result = instance.classificar(idade);
        System.out.println("saida: "+result+"\n");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testClassificaIdoso() {
        System.out.println("Teste Idoso");
        int idade = 60;
        ClassificaFaixaEtaria instance = new ClassificaFaixaEtaria();
        String expResult = "Idoso";
        String result = instance.classificar(idade);
        System.out.println("saida: "+result+"\n");
        assertEquals(expResult, result);
    }
}
