import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.nextStation();
        assertEquals(1, radio.station);

        radio.setStation(9);

        radio.nextStation();
        assertEquals(0, radio.station);
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.prevStation();
        assertEquals(9, radio.station);

        radio.prevStation();
        assertEquals(8, radio.station);
    }

    @Test
    void shouldSetStation() {
        Radio radio = new Radio();

        radio.setStation(5);
        assertEquals(5, radio.station);

        radio.setStation(10);
        assertEquals(5, radio.station);

        radio.setStation(-1);
        assertEquals(5, radio.station);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();
        assertEquals(1, radio.volume);

        radio.volume = 10;
        radio.increaseVolume();
        assertEquals(10, radio.volume);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume();
        assertEquals(0, radio.volume);

        radio.volume = 5;
        radio.decreaseVolume();
        assertEquals(4, radio.volume);
    }
}