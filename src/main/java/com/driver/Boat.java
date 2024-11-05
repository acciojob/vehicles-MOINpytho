package com.driver;

public class Boat implements WaterVehicle{
    @Override
    public String getVehicleName() {
        return "Canoe";
    }

    @Override
    public int getVehicleCapacity() {
        return 20;
    }
}
