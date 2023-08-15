package model.services;

import model.entities.Contrato;
import model.entities.Parcelas;

import java.time.LocalDate;

public class ContratoService {

    private ServicePagamentoOnline servicePagamentoOnline;

    public ContratoService(ServicePagamentoOnline servicePagamentoOnline) {
        this.servicePagamentoOnline = servicePagamentoOnline;
    }

    public void processoContrato(Contrato contrato, int meses) {
        double parcelaBasica = contrato.getValorTotal() / meses;

        for (int i = 1; i<= meses; i++) {
            LocalDate vencimentoParcela = contrato.getData().plusMonths(i);

            double juro = servicePagamentoOnline.juros(parcelaBasica, i);
            double taxa = servicePagamentoOnline.taxaPagamento(parcelaBasica + juro);
            double parcela = parcelaBasica + juro + taxa;

            contrato.getParcelas().add(new Parcelas(vencimentoParcela, parcela));
        }
    }
}
