package com.pagamento;

import com.pagamento.model.Pagamento;
import com.pagamento.registry.PagamentoRegistry;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento1 = PagamentoRegistry.getPagamento("Pix");
        assert pagamento1 != null;
        pagamento1.setValor(150.0);

        Pagamento pagamento2 = PagamentoRegistry.getPagamento("Boleto");
        assert pagamento2 != null;
        pagamento2.setValor(250.0);

        Pagamento pagamento3 = PagamentoRegistry.getPagamento("Cartao");
        assert pagamento3 != null;
        pagamento3.setValor(350.0);

        System.out.println("=== Pagamentos clonados ===");
        System.out.println(pagamento1);
        System.out.println(pagamento2);
        System.out.println(pagamento3);
    }
}