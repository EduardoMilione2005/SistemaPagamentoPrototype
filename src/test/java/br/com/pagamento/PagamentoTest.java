package br.com.pagamento;

import com.pagamento.model.Pagamento;
import com.pagamento.registry.PagamentoRegistry;

public class PagamentoTest {

    public static void main(String[] args) {

        Pagamento original = PagamentoRegistry.getPagamento("Pix");
        assert original != null;
        Pagamento clone = original.clone();

        clone.setValor(500.0);

        if (original == clone) {
            System.out.println("Erro: clone é o mesmo objeto");
            return;
        }

        if (!original.getTipo().equals(clone.getTipo())) {
            System.out.println("Erro: tipo deveria ser igual");
            return;
        }

        if (original.getValor() == clone.getValor()) {
            System.out.println("Erro: valores deveriam ser diferentes após alteração");
            return;
        }

        System.out.println("Todos os testes passaram com sucesso!");
    }
}