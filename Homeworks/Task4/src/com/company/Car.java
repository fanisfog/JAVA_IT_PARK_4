package com.company;

public class Car {
    private int carNumber;
    private String color;
    private int power;
    private boolean twodoor;
    private String model;


    public Car(int carNumber, String color, int power, boolean twodoor,String model) {
        setCarNumber(carNumber);
        setColor(color);
        setPower(power);
        setTwoDoor(twodoor);
        setModel(model);
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getColor() {
        return color;
    }

   public void setColor(String color) {
        this.color = color;
    }

    public boolean getTwoDoor(boolean door){
        return door;
    }
    public  void setTwoDoor(boolean twodoor){
        this.twodoor = this.twodoor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = this.model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        } else {
            this.power = 0;
        }
    }

}
