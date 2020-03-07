package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {
        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        ContaCorrente contaCorrente = new ContaCorrente(22,22);

        guardadorDeContas.adiciona(contaCorrente);
        int quantidade = guardadorDeContas.getQuantidadeReferencias();
        System.out.println(quantidade);

        Conta ref = (Conta) guardadorDeContas.getReferencias(0);
        System.out.println(ref.getNumero());
    }
}
