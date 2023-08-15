package model.services;

public class PayPalService implements ServicePagamentoOnline{
    @Override
    public Double taxaPagamento(double valor) {
        return valor * 0.02;
    }

    @Override
    public Double juros(double valor, int meses) {
        return valor * 0.01 * meses;
    }
}
