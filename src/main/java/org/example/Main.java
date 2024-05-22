package org.example;

interface Command {
    public void execute();
}

class SellItemCommand {
    SellItemCommand(Shop shop, String itemName) {}

    public void execute() {
        this.shop.remove("hammer", 1);
        this.shop.addMoney(10);
    }
}

class Shop {


}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // loop -> example
        // What to do? "(S)ell", "(D)eposit" or "(P)rint hostory", "Q/X"
        // input
        // Which item to sell?  "hammer", "pincer", "saw"  (1, 2, 3)
        Command sell = new SellItemCommand(myShop, "hammer");
    }
}