package vendingmachine;

import vendingmachine.object.Coin;
import vendingmachine.object.Inventory;
import vendingmachine.state.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private ArrayList<Coin> coinList;
    private Inventory inventory;

    public VendingMachine(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
        this.coinList = new ArrayList<>();
    }

    public void setCoinList(ArrayList<Coin> coinList) {
        this.coinList = coinList;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
