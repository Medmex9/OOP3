package Transport;

import Driver.Driver;

public interface Competing<D extends Driver> {

    public void PitStop();
    public void BestLapTime();
    public void MaxSpeed();

}
