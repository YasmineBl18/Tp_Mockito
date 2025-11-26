package org.example.mq_tp_mockito.entities;

public class Additioneur implements IAddition {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
