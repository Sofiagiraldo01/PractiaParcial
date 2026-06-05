package com.parkinguv;

public class ParkingCalculator {

    private static final int FREE_MINUTES = 30;
    private static final int HOURLY_RATE = 500;
    private static final int DAILY_CAP = 12000;

    public double calculateFee(
            int minutes,
            boolean vip) {

        if (minutes <= FREE_MINUTES) {
            return 0;
        }

        int chargeableMinutes =
                minutes - FREE_MINUTES;

        int hours =
                (int) Math.ceil(
                        chargeableMinutes / 60.0
                );

        double total =
                hours * HOURLY_RATE;

        if (vip) {
            total *= 0.8;
        }

        return Math.min(
                total,
                DAILY_CAP
        );
    }
}