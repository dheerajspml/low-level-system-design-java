package atm.state;

import atm.object.ATM;
import atm.object.Card;

public class IdleState extends AtmState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }


}
