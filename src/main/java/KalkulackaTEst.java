import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class KalkulackaTEst {

    int prvCislo;
    int druCislo;
    int vypoctenyVysledek;

    @Given("Uzivatel ma zadane dve cisla {int} a {int}")
    public void uzivatelMaZadaneDveCislaA(int prvniCislo, int druheCislo) {
        prvCislo = prvniCislo;
        druCislo = druheCislo;
    }

    @When("Uzivatel vydeli tieto cisla")
    public void uzivatelVydeliTietoCisla() {

    }

   // @Then("Uzivatel vidi na kalkulacke vysledok {int}")
   // public void uzivatelVidiNaKalkulackeVysledok(int predpokladanyVysledek) {
     //    assertEquals(predpokladanyVysledek, vypoctenyVysledek);
    //}

    @When("Uzivatel scita tieto cisla")
    public void uzivatelScitaTietoCisla() {
        vypoctenyVysledek = prvCislo + druCislo;
    }
}
