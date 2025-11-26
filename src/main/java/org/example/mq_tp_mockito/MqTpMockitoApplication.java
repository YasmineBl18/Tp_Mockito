package org.example.mq_tp_mockito;

import org.example.mq_tp_mockito.entities.IForme;

import java.util.List;

public class MqTpMockitoApplication {

    public static double aire(List<IForme> formes) {
        double aire = 0;

        for (IForme f : formes) {
            aire += f.aire();
        }
        return aire;
    }

    public static void main(String[] args) {
        System.out.println("Aire");
    }
}
