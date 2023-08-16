package model.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();
    default double pagamento(double valor, int meses) {
        if (meses < 1) {
            throw new InvalidParameterException("Quantidade de meses deve ser maior do que zero.");
        }
        return valor * Math.pow(1.0 + getInterestRate() / 100, meses);
    }
}
