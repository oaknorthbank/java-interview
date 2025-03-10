package com.interview.credit;

import java.util.List;

public class CreditReport {
    private final List<Invoice> paymentHistory;
    private final double creditUtilisationPercentage;

    public CreditReport(List<Invoice> paymentHistory, double creditUtilisationPercentage) {
        this.paymentHistory = paymentHistory;
        this.creditUtilisationPercentage = creditUtilisationPercentage;
    }

    public List<Invoice> getPaymentHistory() {
        return paymentHistory;
    }

    public double getCreditUtilisationPercentage() {
        return creditUtilisationPercentage;
    }
} 