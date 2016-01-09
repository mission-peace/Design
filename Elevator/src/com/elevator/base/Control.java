package com.elevator.base;

public interface Control {
    /**
     * When a new request from user comes in.
     */
    void handleRequest(Request request);

    /**
     * When elevator reaches its destination it calls control to inform it
     */
    void destinationReached(Status status);
}
