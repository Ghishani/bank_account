public class BankAccount {

    // attributes/properties
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

    // constructor
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;// as balance starts at 0
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

        // method to deposit into account
        public void deposit(int amount){
            if (amount > 0) {
                balance += amount;
            }
        }

        // method to withdraw from account
        public void withdrawal(int amount){
        if (amount > 0 && amount <= balance) {
                balance -= amount;
            }

        }

        // method for paying interest
        public void payInterest ( double rate){
            double interest = balance * rate / 100;
            balance += interest;
        }

    }

