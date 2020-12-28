package JustTrySecond;

import java.util.*;

public class Race extends Thread {

    private static final int MIN_SPEED = 1;
    private static final int MAX_SPEED = 80;

    private final Map<Integer, Integer> wayHistory = new HashMap<>();
    private int speed;
    private int totalWay;
    private int carNumber;

    @Override
    public void run() {
        for (int i = 1; i <= JustTrySecondRace.RACE_DURATION; i++) {
            setRandomSpeed();

            totalWay += speed;
            wayHistory.put(i, speed);
        }
    }

    public int getTotalWay() {
        return totalWay;
    }

    public Map<Integer, Integer> getWayHistory() {
        return wayHistory;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    private void setRandomSpeed() {
        speed = (int) (Math.random() * MAX_SPEED + MIN_SPEED); // Method to generate a random speed value
    }

}