package structural.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterPatternTest {

    @Test
    @DisplayName("Should adapt EuropeSocket to UkrainianSocket")
    public void shouldAdaptEuropeSocketToUkrainianSocket() {
        EuropeSocket europeSocket = new EuropeSocket();
        EuropeToUkraineSocketAdapter europeToUkraineSocketAdapter = new EuropeToUkraineSocketAdapter(europeSocket);
        assertEquals("Device is connected to a 230V, 50Hz European socket.", europeSocket.plugIn());
        assertEquals(europeSocket.plugIn(), europeToUkraineSocketAdapter.connect());
    }
}
