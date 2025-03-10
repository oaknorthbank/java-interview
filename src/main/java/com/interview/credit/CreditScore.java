package com.interview.credit;

public class CreditScore {
    private final int value;
    private final CreditScoreCategory category;

    public CreditScore(int value, CreditScoreCategory category) {
        this.value = value;
        this.category = category;
    }

    public int getValue() {
        return value;
    }

    public CreditScoreCategory getCategory() {
        return category;
    }
} 