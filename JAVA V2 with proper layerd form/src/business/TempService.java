package business;

import data.TempRepository;

public class TempService {
    private TempRepository tempRepository = new TempRepository();

    public String getCurrentTemperature() {
        return "Current temperature: " + tempRepository.getTempData().getTemperature() + "°C";
    }

    public void setTemperature(double temp) {
        tempRepository.getTempData().setTemperature(temp);
    }
}
