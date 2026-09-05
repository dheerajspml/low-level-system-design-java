package atm.object;

import atm.state.AtmState;
import atm.state.IdleState;

public class ATM {
    private static ATM atmObject = new ATM();
    AtmState currentATMState;
    private int atmBalance;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;
    private ATM() {
    }
    public void setCurrentATMState(AtmState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public AtmState getCurrentATMState() {
        return currentATMState;
    }
    public static ATM getATMObject() {
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }
    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }
    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }
    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }
    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }
    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }
    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }




}
