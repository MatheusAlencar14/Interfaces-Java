package model.services;

import java.security.InvalidParameterException;

public class UsaInterestService {

    private double interesRate;

    public UsaInterestService(double interesRate) {
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
