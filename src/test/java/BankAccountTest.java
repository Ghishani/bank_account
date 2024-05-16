import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Julie","Sanders", LocalDate.of(2000,2,25),  789876, "current", -50);
    }

    @Test
    public void canDepositFunds(){
        bankAccount.deposit(200);
        assertThat(bankAccount.getBalance()).isEqualTo(200);
    }
    @Test
    public void canWithdrawFunds_true(){
        bankAccount.deposit(200);
        bankAccount.withdrawal(150);
        assertThat(bankAccount.getBalance()).isEqualTo(50);
    }
    @Test
    public void canWithdrawFunds_false(){
        bankAccount.deposit(100);
        bankAccount.withdrawal(200);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }
    @Test
    public void canWithdrawInOverdraft_true(){
        bankAccount.deposit(200);
        bankAccount.withdrawal(225);
        assertThat(bankAccount.getBalance()).isEqualTo(-25);
    }

    @Test
    public void canPayInterest(){
        bankAccount.deposit(200);
        bankAccount.payInterest(0.2,0.1);
        assertThat(bankAccount.getBalance()).isEqualTo(220);
    }

    // Getters and setters
    @Test
    public void hasFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Julie");
    }
    @Test
    public void hasLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Sanders");
    }
    @Test
    public void hasDateOfBirth() {
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(LocalDate.of(2000, 2, 25));
    }
    @Test
    public void hasAccountNumber() {
        assertThat(bankAccount.getAccountNumber()).isEqualTo(789876);
    }

    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("Tilly");
        assertThat(bankAccount.getFirstName()).isEqualTo("Tilly");
    }
    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Pebbles");
        assertThat(bankAccount.getLastName()).isEqualTo("Pebbles");
    }
    @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth(LocalDate.of(2000,11,19));
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(LocalDate.of(2000, 11, 19));
    }
    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(928927);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(928927);
    }

    @Test
    public void canGetBalance() {
        bankAccount.deposit(70);
        assertThat(bankAccount.getBalance()).isEqualTo(70);
    }
    @Test
    public void canSetBalance() {
        bankAccount.setBalance(200);
        assertThat(bankAccount.getBalance()).isEqualTo(200);
    }

    @Test
    public void hasAccountType(){
        assertThat(bankAccount.getAccountType()).isEqualTo("current");
    }
    @Test
    public void canSetAccountType(){
        bankAccount.setAccountType("savings");
        assertThat(bankAccount.getAccountType()).isEqualTo("savings");
    }

    @Test
    public void hasOverdraft(){
        assertThat(bankAccount.getOverdraft()).isEqualTo(-50);
    }
    @Test
    public void canSetOverdraft(){
        bankAccount.setOverdraft(-100);
        assertThat(bankAccount.getOverdraft()).isEqualTo(-100);
    }


    }
