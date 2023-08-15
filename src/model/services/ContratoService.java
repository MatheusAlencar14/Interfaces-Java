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
        contrato.getParcelas().add(new Parcelas(LocalDate.of(2023, 8, 15), 206.04));
        contrato.getParcelas().add(new Parcelas(LocalDate.of(2023, 9, 15), 208.08));
    }
}
