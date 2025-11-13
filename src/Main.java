public class Main {


    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        try{
        account.withDraw(1500);}

        catch (InsufficientFundsException e){

            System.out.println("Fejl " + (e.getMessage()));
        }
    }
}
