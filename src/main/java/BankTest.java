import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {

    BankAccount firstBankAccount;
    BankAccount secondBankAccount;

    @Given("bank account with {int} kc")
    public void bankAccountWithKc(int initialBalance) {
        firstBankAccount = new BankAccount(initialBalance);
    }

    @Then("a user account balance is {int} kc")
    public void aUserAccountBalanceIsKc(int expectedBalance) {
        assertEquals(expectedBalance, firstBankAccount.getAccountBalance());
    }

    @When("a user withdraw {int} kc")
    public void aUserWithdrawKc(int withdrawAmount) {
        firstBankAccount.withdraw(withdrawAmount);
    }

    @And("a user transfer {int} kc to this account")
    public void aUserTransferKcToThisAccount(int transferAmount) {
        firstBankAccount.transfer(transferAmount);
    }

    @And("another bank account with {int} kc")
    public void anotherBankAccountWithKc(int inicialBalance) {
        secondBankAccount = new BankAccount(inicialBalance);
    }

    @When("a user transfer from first bank account to second account {int} kc")
    public void aUserTransferFromFirstBankAccountToSecondAccountKc(int transferAmount) {
        firstBankAccount.withdraw(transferAmount);
        secondBankAccount.transfer(transferAmount);
    }

    @And("a user second account balance is {int} kc")
    public void aUserSecondAccountBalanceIsKc(int expectedBalance) {
        assertEquals(expectedBalance, firstBankAccount.getAccountBalance());
    }
}
