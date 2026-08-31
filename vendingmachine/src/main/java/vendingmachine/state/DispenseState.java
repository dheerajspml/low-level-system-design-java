package vendingmachine.state;

import vendingmachine.VendingMachine;
import vendingmachine.object.Item;

public class DispenseState extends State {
    DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("currently vending machine is in deispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws  Exception{
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }
}
