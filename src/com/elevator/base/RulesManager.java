package com.elevator.base;

public interface RulesManager {
    void enqueue(Request request);
    int getNextDestination();
}
