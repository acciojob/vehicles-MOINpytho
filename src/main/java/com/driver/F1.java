package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        this.setName(name);
        this.setManual(isManual);
    }

    public void accelerate(int rate){

        int newSpeed  = rate + this.getCurrentSpeed(); //set the value of new speed by using currentSpeed and rate
        /*
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        this.setCurrentSpeed(newSpeed);
        if(newSpeed == 0 ) {
            //Stop the car, set gear as 1
            this.setCurrentGear(1);
            this.stop();

        }
        else if(newSpeed >= 1 && newSpeed <=50){
            this.setCurrentGear(1);
        }
        else if(newSpeed >= 51 && newSpeed <= 100){
            this.setCurrentGear(2);
        }
        else if(newSpeed >= 101 && newSpeed <= 150){
            this.setCurrentGear(3);
        }
        else if(newSpeed >= 151 && newSpeed <= 200){
            this.setCurrentGear(4);
        }
        else if(newSpeed >= 201 && newSpeed <= 250){
            this.setCurrentGear(5);
        }
        else if(newSpeed < 250){
            this.setCurrentGear(6);
        }
        this.changeGear(this.getCurrentGear());

        if(newSpeed > 0) {
            this.changeSpeed(newSpeed, this.getCurrentDirection());
        }
    }
}
