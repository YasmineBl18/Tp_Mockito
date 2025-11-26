package org.example.mq_tp_mockito;

import org.example.mq_tp_mockito.entities.Cercle;
import org.example.mq_tp_mockito.entities.Rectangle;
import org.example.mq_tp_mockito.entities.IForme;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MqTpMockitoApplicationTests {

    @Test
    void testAireAvecMockCarre() {

        // ➤ Création d’un mock (forme inexistante = carré)
        IForme carre = Mockito.mock(IForme.class);

        // ➤ Quand on appelle carre.aire(), Mockito renvoie 4
        when(carre.aire()).thenReturn(4.0);

        List<IForme> formes = Arrays.asList(
                new Cercle(2.0),
                new Rectangle(2, 4),
                carre
        );

        double resultat = MqTpMockitoApplication.aire(formes);

        assertEquals(24.56, resultat, 0.01);

        // ➤ Vérifier que la méthode aire() du mock a été appelée 1 fois
        verify(carre, times(1)).aire();
    }
}
