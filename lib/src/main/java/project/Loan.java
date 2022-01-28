package project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@AllArgsConstructor
@FieldNameConstants
@Builder
public class Loan {
    private double amount;
    private double interestRate;
    private double monthlyPayment;
    private int loanLength;
    private int loanId;
}
