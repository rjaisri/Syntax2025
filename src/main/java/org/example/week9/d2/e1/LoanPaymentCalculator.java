package org.example.week9.d2.e1;

public class LoanPaymentCalculator {
    /*
    **Method 1: Calculate Payment with Two Parameters**
      - Signature: `calculatePayment(double loanAmount, double interestRate)`
      - Calculation:
        ```
        payment = (loanAmount * (1 + interestRate / 100)) / 12
        ```
      - Return the calculated payment.
     */
    public double calculatePayment(double loanAmount, double interestRate) {
        return (loanAmount * (1 + interestRate / 100)) / 12;
    }
      /*  **Method 2: Calculate Payment with Three Parameters**
                - Signature: `calculatePayment(double loanAmount, double interestRate, double numberOfMonths)`
        - Calculation:
        ```
        payment = (loanAmount * (1 + interestRate / 100)) / numberOfMonths
        ```
        - Return the calculated payment.*/

    public double calculatePayment(double loanAmount, double interestRate, double numberOfMonths) {
        return (loanAmount * (1 + interestRate / 100)) / numberOfMonths;
    }
   /* **Method 3: Calculate Payment with Four Parameters**
            - Signature: `calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment)`
            - Calculation:
            ```
    payment = ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths
        ```
                - Return the calculated payment.*/

    public double calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment) {
        return ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths;
    }
}

