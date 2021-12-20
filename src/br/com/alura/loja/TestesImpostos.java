package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculador = new CalculadoraDeImpostos();
        System.out.println(calculador.calcular(orcamento, new ICMS()));
    }
}
