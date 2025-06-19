import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.Checkout;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {

    Checkout myCheckout;

    @Given("the price of {string} {int}c")
    public void thePriceOfC(String name, int price) {
        myCheckout = new Checkout();
        myCheckout.addItem(name, price);
    }

    @When("user checkout {string} {int}")
    public void userCheckout(String name, int count) {
        myCheckout.scanItems(name, count);
    }

    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBeC(int expectedTotalPrice) {
        assertEquals(expectedTotalPrice, myCheckout.totalCart(), "Toto sa zobrazi ked nastane chyba");
    }
}
