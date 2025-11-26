package org.example.mq_tp_mockito;

import org.example.mq_tp_mockito.entities.Additioneur;
import org.example.mq_tp_mockito.entities.IAddition;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AdditionneurTest {

    @Test
    void testAdditionAvecMock() {

        IAddition additionMock = Mockito.mock(IAddition.class);

        when(additionMock.add(10, 20)).thenReturn(30);

        int resultat = additionMock.add(10, 20);

        assertEquals(30, resultat);

        verify(additionMock, times(1)).add(10, 20);
    }

    @Test
    void testAdditionAvecClasseReelle() {

        IAddition additionneur = new Additioneur();

        int resultat = additionneur.add(10, 20);

        assertEquals(30, resultat);
    }
}
