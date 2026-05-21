package com.pagamento.registry;

import com.pagamento.model.Pagamento;

import java.util.HashMap;
import java.util.Map;

public class PagamentoRegistry {
    private static final Map<String, Pagamento> pagamentos = new HashMap<>();

    static {
        pagamentos.put("Pix", new Pagamento("Pix", 100.0));
        pagamentos.put("Boleto", new Pagamento("Boleto", 200.0));
        pagamentos.put("Cartao", new Pagamento("Cartão de Crédito", 300.0));
    }

    public static Pagamento getPagamento(String tipo) {
        Pagamento pagamento = pagamentos.get(tipo);
        return pagamento != null ? pagamento.clone() : null;
    }
}