package atm.state;

import atm.amountwithdrawprocessor.CashWithdrawProcessor;
import atm.amountwithdrawprocessor.FiveHundredProcessor;
import atm.amountwithdrawprocessor.HundredsProcessor;
import atm.object.ATM;
import atm.object.Card;

public class CashWithdrawState  extends AtmState{
    public CashWithdrawState() {
        System.out.println("Please enter the Withdrawal Amount");
    }
    @Override
    public void cashWithdraw(ATM atm, Card card, int amount){
        if (atm.getAtmBalance() < amount) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if (card.getBankBalance() < amount) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {

            card.deductBankBalance(amount);
            atm.deductATMBalance(amount);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                  new FiveHundredProcessor(new HundredsProcessor(null));

            withdrawProcessor.withdraw(atm, amount);
            exit(atm);
        }

    }
    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");

    }
    @Override
    public void returnCard(){
        System.out.println("Please collect your card");

    }

}
