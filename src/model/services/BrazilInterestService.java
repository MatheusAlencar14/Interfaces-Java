package model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService {

    private double interesRate;

    public BrazilInterestService(double interesRate) {
        this.interesRate = interesRate;
    }

    public double getInteresRate() {
        return interesRate;
    }

    public double pagamento(double valor, int meses) {
        if (meses < 1) {
            throw new InvalidParameterException("Quantidade de meses deve ser maior do que zero.");
            }
        return valor * Math.pow(1.0 + interesRate / 100, meses);
        }
    }
