package atm.object;

public class AtmRoom {
    public ATM atm;
    public User user;

    public void initialize() {

        //create ATM
        atm = ATM.getATMObject();
        atm.setAtmBalance(3500,6,5);

        //create User
        this.user = createUser();
    }
    private User createUser(){

        User user = new User();
        user.setCard(createCard());
        return user;
    }
    private Card createCard(){

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }
    private UserBankAccount createBankAccount() {

        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.balance = 3000;

        return bankAccount;

    }


}
