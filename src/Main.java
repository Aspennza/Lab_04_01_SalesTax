public class Main
{
    public static void main(String[] args)
    {
        final double TAX_PERCENTAGE = 0.05;
        double purchasePrice = 15.00;
        double salesTaxCost = 0.00;

        salesTaxCost = purchasePrice * TAX_PERCENTAGE;

        System.out.println("The price of your purchase is $" + purchasePrice + ".");
        System.out.println("Your calculated sales tax is $" + salesTaxCost + ".");
    }
}