package business;

import data.SecCamRepository;
import model.SecCamState;

public class SecCamService {
    private SecCamRepository secCamRepository = new SecCamRepository();

    public String turnOnCamera() {
        secCamRepository.setSecCamState(SecCamState.ON);
        return "Security camera is now ON.";
    }

    public String turnOffCamera() {
        secCamRepository.setSecCamState(SecCamState.OFF);
        return "Security camera is now OFF.";
    }

    public SecCamState getSecCamState() {
        return secCamRepository.getSecCamState();
    }
}
