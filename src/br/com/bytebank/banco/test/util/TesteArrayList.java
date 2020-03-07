package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(4109,32412);
        Conta cp = new ContaPoupanca(1921,12321);
        lista.add(cc);
        lista.add(cp);

        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        lista.remove(0);

        System.out.println(lista.size());
    }
}
