import java.util.InputMismatchException;
impoert java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("RPG LOAN PROVIDERS");
        System.out.println("Loan Type\tlnterest Rate");
        System.out.println("1.Home Loan\t4.2%");
        System.out.println("2.Car Loan\t3.9%");
        System.out.println("3.Gold Loan\t5.2%");
        System.out.println("4.Study Loan\t2.8%");
        System.out.println("5.Business Loan\t5.8%");
        System.out.println("6.Exit\n");
        double familyIncome = getInput("Enter your family annual income: $");
        if (familyIncome <80000) {
            System.out.println("you are not eligible to get a loan from RPG Loan Providers.");
            return;
        }
        int[] loanSelection = getLoanSelection("Enter the loan type you want (separated by commas) ");
        if (loanSelection.length <2) {
            System.out.println("you must select at least two loans.");
            return;
        }
        int numInstallments = getInput("Enter the number of monthly installmemts (6-60) ", 6, 60);
        double totalLoanAmount = calculateTotalLoanAmount(loanSelection);
        double interestRate = totalLoanAmount > 500000 ? 0.10 : 0.0;
        double totalAmountToPay = calculateTotalAmountToPay(totalLoanAmount, interestRate);
        double monthlyInstallment = calculateMonthlyInstallment(totalAmountToPay, numInstallments);
        system.out.println("\nTotal Loan Amount: $" + totalAmountToPay);
        System.out.println("Monthly Installment: $" + monthlyInstallment);
    }
    private static double getInput(string message) {
        Scanner scanner = new Scanner(System.in);
        double input = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                input = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) p"{
                scanner.nextLine();
                System.out.println("Invalid input. Please enter a valid number.");
            }
            }
            return input;
        }
        private static int getInput(String message, int min, int max) {
            int input;

            do {
                input = (int) getInput(message);
                if (input < min || input > max) {
                    System.out.println("Invalid input, please enter a value between " + min + " and " + max + ".");

                }

            } while (input < min || input > max);

            return input;
        }
        private static int[] getLoanSelection(String message) {
            Scanner scanner = new Scanner(System.in);
            int[] loanSelection = new int[0];
            boolean validInput = false;
            white (!validInput) {
                try{
                    System.out.print(message);
                    string input = scanner.nextLine();
                    String[] selections = input.split(",");
                    loanSelection = new int[selections.length];
                    for (int i = 0; i < selections.length; i++) {
                loanSelection[i] = Integer.parseInt(selections[i].trim());
            }

            validInput = true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid loan types separated by commas.");
        }
    }

    return loanSelection;
}

private static double calculateTotalLoanAmount(int[] loanSelection) {
    double totalLoanAmount = 0.0;

    for (int loanType : loanSelection) {
        double loanAmount = getLoanAmount(loanType);
        totalLoanAmount +=
                }
            }
        }
