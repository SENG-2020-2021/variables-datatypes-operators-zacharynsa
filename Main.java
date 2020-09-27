import java.text.NumberFormat;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for

   // calculate and print total amount the debtor is to pay

   // calculate and print the days the debtor paid for
  
  // calculate and print the amount whose day was not captured because the amount was incomplete

   // calculate and print amount the debtor is left to pay

   // calculate and print days the debtor has not payed for

   //kindly remove the statement below when you are done with the assignment 
     Scanner scanner = new Scanner(System.in);

        double totalAmountPaid , daysPaidFor , unpaidAmount , daysNotPaidFor,amountPerDay, meantToPay,notCaptured, daysPaidForAmount;
        System.out.println("ACCOUNT STATEMENT \n");

        System.out.println("\n input amount per day \n" );
        double ammountPerDay = scanner.nextDouble();


        System.out.println("\n input days defaulted  \n");
        double daysDefaulted = scanner.nextDouble();


        System.out.println("\n DAYS \n");
        double days = scanner.nextDouble();

        System.out.println(" \n daysNotDefaulted \n ");
        double daysNotDefaulted = scanner.nextDouble();


        System.out.println("AMOUNT MEANT TO BE PAID: / TOTAL AMOUNT \n");
        meantToPay = ammountPerDay * days ;
        String totalFormatted = NumberFormat.getCurrencyInstance().format(meantToPay);
        System.out.println("meantToPay :"+ totalFormatted);

        System.out.println("DAYS PAID FOR  ");
        daysPaidFor = days - daysDefaulted;
        String accountFormatted = NumberFormat.getNumberInstance().format(daysPaidFor);
        System.out.println("daysPaidFor :"+ accountFormatted );

        System.out.println("DAYS PAID FOR AMOUNT \n");
        daysPaidForAmount = ammountPerDay * daysNotDefaulted ;
        String daysPaidForAmountFormatted = NumberFormat.getCurrencyInstance().format(daysPaidForAmount);
        System.out.println("daysPaidForAmount :"+ daysPaidForAmountFormatted);

        System.out.println("DAYS NOT CAPTURED ");
        notCaptured = days - daysNotDefaulted;

          String notCapturedFormatted = NumberFormat.getIntegerInstance().format(notCaptured);
        System.out.println("notCaptured:  " +   notCapturedFormatted);

        System.out.println("AMOUNT LEFT TO BE PAID");
        unpaidAmount= daysDefaulted * ammountPerDay;
        String unpaidFormatted = NumberFormat.getCurrencyInstance().format(unpaidAmount);
        System.out.println("unpaidAmount:"+ unpaidFormatted);

        System.out.println("DAYS NOT PAID FOR");
        daysNotPaidFor = days  - daysNotDefaulted ;
        String daysNotPaidForFormatted = NumberFormat.getNumberInstance().format(daysNotPaidFor);
        System.out.println("daysNotPaid:"+ daysNotPaidForFormatted);


   
  }
}
