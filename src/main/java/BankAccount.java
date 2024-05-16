import java.time.LocalDate;

public class BankAccount {

    // attributes/properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

    // constructor
    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int inputAccountNumber, String accountType, double overdraft) {
        //String accountType,int overdraft
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;// as balance starts at 0
        this.accountType = accountType;
        this.overdraft = overdraft; //assume it is negative
    }

    // method to deposit into account
    public void deposit(double amount){
        this.balance += amount;
    }

    //methods
    public void withdrawal(double amount){
        if((this.balance - amount) >= overdraft){ // withdraw allowed only when amount does not exceed overdraft
            this.balance -= amount;
        }
    }

    public double calculateInterest (double percentage){
        double payInterest = this.balance * percentage;
        return payInterest;
    }
    public void payInterest(double savingsAccountInterest, double currentAccountInterest){
        if(accountType.equals("savings")) {
            this.balance += this.calculateInterest(savingsAccountInterest);
        } else if (accountType.equals("current")){
            this.balance += this.calculateInterest(currentAccountInterest);
        }
    }

    // getters and setters
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType(){
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getOverdraft(){
        return overdraft;
    }
    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }
    }

