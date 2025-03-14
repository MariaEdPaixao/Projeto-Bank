package br.com.fiap.proj_bank_lm.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Account {
    private Long accountNumber;
    private String agency;
    private String holderName; 
    private String cpf;
    private LocalDate openDate;
    private BigDecimal balance;
    private boolean activate;
    private AccountType typeAccount;
}
