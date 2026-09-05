package atm.state;

import atm.object.ATM;
import atm.object.Card;
import atm.object.TransactionType;

public class SelectOperationState extends AtmState{
    public SelectOperationState(){
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType) {

            case CASH_WITHDRAWAL:
                atm.setCurrentATMState(new CashWithdrawState());
                break;
            case BALANCE_CHECK:
                atm.setCurrentATMState(new CheckBalanceState());
                break;
            default: {
                System.out.println("Invalid Option");
                exit(atm);
            }

        }


    }
    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");

    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }
}
