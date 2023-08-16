package model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService{

    private double interestRate;

    public BrazilInterestService(double interesRate) {
        this.interestRate = interesRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
