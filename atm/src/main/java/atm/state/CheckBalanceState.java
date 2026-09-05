package atm.state;

import atm.object.ATM;
import atm.object.Card;

public class CheckBalanceState extends AtmState{
    public CheckBalanceState() {
    }
    @Override
    public  void displayAmount(ATM atm, Card card){
        System.out.println("Your Balance is: " + card.getBankBalance());
        exit(atm);
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }
}
