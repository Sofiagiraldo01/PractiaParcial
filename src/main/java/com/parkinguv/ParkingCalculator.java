package com.parkinguv;

public class ParkingCalculator {

    public double calculateFee(
            int minutes,
            boolean vip) {

        if (minutes <= 30) {
            return 0;
        }

        int chargeableMinutes =
                minutes - 30;

        int hours =
                (int) Math.ceil(
                        chargeableMinutes / 60.0
                );

        return hours * 500;
    }
}