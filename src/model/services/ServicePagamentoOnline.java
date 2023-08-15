package model.services;

public interface ServicePagamentoOnline {

    Double taxaPagamento(double valor);
    Double juros(double valor, int meses);
}
