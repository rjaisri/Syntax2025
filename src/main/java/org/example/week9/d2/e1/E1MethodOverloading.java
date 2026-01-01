package org.example.week9.d2.e1;

public class E1MethodOverloading {
    public static void main(String[] args){

        // Heads Up This is a little bit tricky
        // No Hints are left Intentionally
       /* **Test the Methods in the Main Class**
                - In the existing `E2MethodOverloading.java` class (which contains the main method), do the following:
        - Create an object of the `LoanPaymentCalculator` class.
        - Call the `calculatePayment` method with two arguments (e.g., `10000, 5`) and print the result.
        - Call the `calculatePayment` method with three arguments (e.g., `10000, 5, 24`) and print the result.
        - Call the `calculatePayment` method with four arguments (e.g., `10000, 5, 24, 2000`) and print the result.
        */
        LoanPaymentCalculator calculator = new LoanPaymentCalculator();
        double payment1 = calculator.calculatePayment(10000, 5);
        System.out.printf("%.2f",payment1);
        System.out.println();
        double payment2 = calculator.calculatePayment(10000, 5, 24);
        System.out.printf("%.2f",payment2);
        System.out.println();
        double payment3 = calculator.calculatePayment(10000, 5, 24,
                2000);
        System.out.printf("%.2f",payment3);
        System.out.println();

    }
}

