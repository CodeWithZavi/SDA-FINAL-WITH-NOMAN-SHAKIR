package business;

import data.TempRepository;
import model.TempData;

public class TempService {
    private TempRepository repository;

    public TempService() {
        this.repository = new TempRepository();
    }

    public void updateTemperature(double temperature) {
        repository.setTempData(new TempData(temperature));
        System.out.println("Temperature updated to: " + temperature);
    }

    public double getTemperature() {
        return repository.getTempData().getTemperature();
    }
}
