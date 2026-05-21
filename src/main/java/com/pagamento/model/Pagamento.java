package com.pagamento.model;

import com.pagamento.prototype.PagamentoPrototype;

public class Pagamento implements PagamentoPrototype {
    private String tipo;
    private double valor;

    public Pagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public Pagamento clone() {
        return new Pagamento(this.tipo, this.valor);
    }

    @Override
    public String toString() {
        return "Pagamento: " + tipo + " | Valor: R$ " + valor;
    }
}