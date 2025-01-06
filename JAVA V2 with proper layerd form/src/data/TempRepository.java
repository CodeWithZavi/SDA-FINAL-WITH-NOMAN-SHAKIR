package data;

import model.TempData;

public class TempRepository {
    private TempData tempData = new TempData(25.0);

    public TempData getTempData() {
        return tempData;
    }

    public void setTempData(TempData tempData) {
        this.tempData = tempData;
    }
}
