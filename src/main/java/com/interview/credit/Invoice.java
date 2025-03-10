package com.interview.credit;

import java.time.LocalDate;

public class Invoice {
    private final LocalDate dueDate;
    private final InvoiceStatus status;

    public Invoice(LocalDate dueDate, InvoiceStatus status) {
        this.dueDate = dueDate;
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public InvoiceStatus getStatus() {
        return status;
    }
} 