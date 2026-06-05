package com.parkinguv;

public class ParkingCalculator {

    public double calculateFee(
            int minutes,
            boolean vip) {

        if (minutes <= 30) {
            return 0;
        }

        return 500;
    }
}