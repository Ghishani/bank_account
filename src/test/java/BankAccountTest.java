import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Julie","Sanders", "25/02/2000", 789876);
    }

    @Test
    public void canGetFirstName(){
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Julie");

    }
    @Test
    public void canGetLastName(){
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Sanders");

    }
    @Test
    public void canGetDateOfBirth() {
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("25/02/2000");
    }
    @Test
    public void canGetAccountNumber() {
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(789876);
    }
    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("Tilly");
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Tilly");
    }
    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Pebbles");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Pebbles");
    }
    @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth("19/11/2000");
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("19/11/2000");
    }
    @Test
    public void canBalance1(){
        bankAccount.deposit(78);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(78);
    }
    @Test
    public void canBalance2(){
        bankAccount.withdrawal(70);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(0);
    }
    }
