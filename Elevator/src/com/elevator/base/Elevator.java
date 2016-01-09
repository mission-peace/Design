package com.elevator.base;

import java.util.List;

public interface Elevator {
    void toToFloor(int floor);
    void updateIntermediateStops(List<Integer> floor);
    Status getStatus();
}
