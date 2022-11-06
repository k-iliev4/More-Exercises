public class orders {
    //Write a method that calculates the total price of an order and prints it on the console.
    // The method should receive one of the following products: coffee, water, coke, snacks, and a quantity of the product.
    // The prices for a single piece of each product are:
    //• coffee – 1.50
    //• water – 1.00
    //• coke – 1.40
    //• snacks – 2.00
    //Print the result rounded to the second decimal place.

    public static void calculate(String product, int quantity){
        double price = 0;
        double singleProductPrice = 0;

        switch (product){
            case "coffee":
                singleProductPrice = 1.5;
                price = singleProductPrice * quantity;
                break;
            case "water":
                singleProductPrice = 1.0;
                price = singleProductPrice * quantity;
                break;
            case "coke":
                singleProductPrice = 1.4;
                price = singleProductPrice * quantity;
                break;
            case "snacks":
                singleProductPrice = 2.0;
                price = singleProductPrice * quantity;
                break;
        }
        System.out.printf("%.2f",price);

    }
}
