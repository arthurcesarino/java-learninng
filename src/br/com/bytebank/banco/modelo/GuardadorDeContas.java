package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Object[] referencias;
    private int quantiade;

    public GuardadorDeContas(){
        this.referencias = new Object[10];
    }

    public void adiciona(Object conta){
        this.referencias[this.quantiade] = conta;
        this.quantiade++;
    }


    public int getQuantidadeReferencias() {
        return this.quantiade;
    }

    public Object getReferencias(int posicao) {
        return this.referencias[posicao];
    }
}
