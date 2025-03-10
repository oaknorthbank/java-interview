package com.interview.credit;

import org.junit.jupiter.api.Test;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

class CreditScoreCalculatorTest {

    private final CreditScoreCalculator calculator = new CreditScoreCalculator();

    @Test
    void shouldReturn560ForCreditUtilisationMoreThan90Percent() {
        CreditReport creditReport = new CreditReport(
            Collections.emptyList(),
            0.95
        );

        CreditScore creditScore = calculator.getCreditScore(creditReport);

        assertEquals(560, creditScore.getValue());
        assertEquals(CreditScoreCategory.VERY_POOR, creditScore.getCategory());
    }

    @Test
    void shouldReturn720ForCreditUtilisationBetween70And90Percent() {
        CreditReport creditReport = new CreditReport(
            Collections.emptyList(),
            0.8
        );

        CreditScore creditScore = calculator.getCreditScore(creditReport);

        assertEquals(720, creditScore.getValue());
        assertEquals(CreditScoreCategory.POOR, creditScore.getCategory());
    }

    @Test
    void shouldReturn880ForCreditUtilisationBetween50And70Percent() {
        CreditReport creditReport = new CreditReport(
            Collections.emptyList(),
            0.6
        );

        CreditScore creditScore = calculator.getCreditScore(creditReport);

        assertEquals(880, creditScore.getValue());
        assertEquals(CreditScoreCategory.FAIR, creditScore.getCategory());
    }

    @Test
    void shouldReturn960ForCreditUtilisationBetween30And50Percent() {
        CreditReport creditReport = new CreditReport(
            Collections.emptyList(),
            0.4
        );

        CreditScore creditScore = calculator.getCreditScore(creditReport);

        assertEquals(960, creditScore.getValue());
        assertEquals(CreditScoreCategory.GOOD, creditScore.getCategory());
    }

    @Test
    void shouldReturn999ForCreditUtilisationLessThan30Percent() {
        CreditReport creditReport = new CreditReport(
            Collections.emptyList(),
            0.2
        );

        CreditScore creditScore = calculator.getCreditScore(creditReport);

        assertEquals(999, creditScore.getValue());
        assertEquals(CreditScoreCategory.EXCELLENT, creditScore.getCategory());
    }
} 