package com.parkinguv.unit;

import com.parkinguv.ParkingCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingCalculatorTest {

    @Test
    void shouldReturnZeroForThirtyMinutes() {

        ParkingCalculator calculator =
                new ParkingCalculator();

        assertEquals(
                0,
                calculator.calculateFee(30, false)
        );
    }

    @Test
    void shouldChargeFirstHourAfterThirtyMinutes() {

        ParkingCalculator calculator =
                new ParkingCalculator();

        assertEquals(
                500,
                calculator.calculateFee(31, false)
        );
    }

    @Test
    void shouldChargeTwoHours() {

        ParkingCalculator calculator =
                new ParkingCalculator();

        assertEquals(
                1000,
                calculator.calculateFee(91, false)
        );
    }

    @Test
    void shouldApplyVipDiscount() {

        ParkingCalculator calculator =
                new ParkingCalculator();

        assertEquals(
                800,
                calculator.calculateFee(91, true)
        );
    }
}