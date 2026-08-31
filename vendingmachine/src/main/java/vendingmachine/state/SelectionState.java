package vendingmachine.state;

import vendingmachine.VendingMachine;
import vendingmachine.object.Coin;
import vendingmachine.object.Item;

public class SelectionState extends State {
    public SelectionState() {
        System.out.println("Vending machine is in SelectionState");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) {

    }

}
