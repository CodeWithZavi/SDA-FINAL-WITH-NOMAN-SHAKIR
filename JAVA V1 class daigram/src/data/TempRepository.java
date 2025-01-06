package data;

import model.TempData;

public class TempRepository {
    private TempData tempData;

    public TempRepository() {
        this.tempData = new TempData(25.0); // Default temperature
    }

    public TempData getTempData() {
        return tempData;
    }

    public void setTempData(TempData tempData) {
        this.tempData = tempData;
    }
}
