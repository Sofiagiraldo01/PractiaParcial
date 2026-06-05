package com.parkinguv.bdd;

import com.parkinguv.ParkingCalculator;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingSteps {

    private int minutes;
    private boolean vip;
    private double result;

    private final ParkingCalculator calculator =
            new ParkingCalculator();

    @Given("a vehicle stayed for {int} minutes")
    public void vehicleStayed(int minutes) {
        this.minutes = minutes;
    }

    @Given("the customer is VIP")
    public void vipCustomer() {
        this.vip = true;
    }

    @When("the parking fee is calculated")
    public void calculateFee() {
        result = calculator.calculateFee(
                minutes,
                vip
        );
    }

    @Then("the total amount should be {double}")
    public void verify(double expected) {
        assertEquals(expected, result);
    }
}
