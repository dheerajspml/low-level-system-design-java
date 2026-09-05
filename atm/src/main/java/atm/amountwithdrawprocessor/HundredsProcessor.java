package atm.amountwithdrawprocessor;

import atm.object.ATM;

public class HundredsProcessor extends CashWithdrawProcessor {
    public HundredsProcessor(CashWithdrawProcessor nextCashWithdrawProcessor){
        super(nextCashWithdrawProcessor);
    }
    @Override
    public void withdraw(ATM atm, int remainingAmount){

        int required =  remainingAmount/100;
        int balance = remainingAmount%100;

        if(required <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        }
        else if(required > atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (required-atm.getNoOfOneHundredNotes()) * 100;
        }

        if(balance != 0){
            System.out.println("Something went wrong");
        }
    }
}
