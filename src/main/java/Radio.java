public class Radio {
    public int station;
    public int volume;

    public void nextStation() {
        this.station += 1;
        if(this.station > 9) {
            this.station = 0;
        }
    }

    public void prevStation() {
        this.station -= 1;
        if(this.station < 0) {
            this.station = 9;
        }
    }

    public void setStation(int station) {
        if(station>=0 && station<=9) {
            this.station = station;
        }
    }

    public void increaseVolume() {
        if (this.volume < 10) {
            this.volume += 1;
        }
    }

    public void decreaseVolume() {
        if (this.volume > 0) {
            this.volume -= 1;
        }
    }
}
