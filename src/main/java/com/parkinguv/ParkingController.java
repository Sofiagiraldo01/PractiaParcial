package com.parkinguv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

    private final ParkingCalculator calculator =
            new ParkingCalculator();

    @GetMapping("/fee")
    public double calculate(
            @RequestParam int minutes,
            @RequestParam boolean vip) {

        return calculator.calculateFee(
                minutes,
                vip
        );
    }
}