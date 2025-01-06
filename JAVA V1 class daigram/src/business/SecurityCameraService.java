package business;

import data.SecurityCameraRepository;
import model.SecCamState;

public class SecurityCameraService {
    private SecurityCameraRepository repository;

    public SecurityCameraService() {
        this.repository = new SecurityCameraRepository();
    }

    public void turnOnCamera() {
        repository.setCameraState(SecCamState.ON);
        System.out.println("Security camera turned ON.");
    }

    public void turnOffCamera() {
        repository.setCameraState(SecCamState.OFF);
        System.out.println("Security camera turned OFF.");
    }

    public SecCamState getCameraState() {
        return repository.getCameraState();
    }
}
