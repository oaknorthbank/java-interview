package com.interview.credit;

public class CreditScoreCalculator {
    
    public CreditScore getCreditScore(CreditReport c) {
        double x = c.getCreditUtilisationPercentage();

        if (x > 0.9) {
            return new CreditScore(560, CreditScoreCategory.VERY_POOR);
        } else if (x > 0.7) {
            return new CreditScore(720, CreditScoreCategory.POOR);
        } else if (x > 0.5) {
            return new CreditScore(880, CreditScoreCategory.FAIR);
        } else if (x > 0.3) {
            return new CreditScore(960, CreditScoreCategory.GOOD);
        }

        return new CreditScore(999, CreditScoreCategory.EXCELLENT);
    }

    public double calculatePercentage(double value, double total) {
        return Math.round((value / total) * 100.0) / 100.0;
    }
} 