package atm.state;

import atm.object.ATM;
import atm.object.Card;
import atm.object.TransactionType;

public abstract class AtmState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("Opps something went wrong");
    }
    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("Opps something went wrong");
    }
    public  void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("Opps something went wrong");
    }
    public  void cashWithdraw(ATM atm, Card card, int withdrawalAmount) {
        System.out.println("Opps something went wrong");
    }
    public void  displayAmount(ATM atm, Card card) {
        System.out.println("Opps something went wrong");
    }
    public  void returnCard() {
        System.out.println("Opps something went wrong");
    }
    public  void exit(ATM atm) {
        System.out.println("Opps something went wrong");
    }
}
