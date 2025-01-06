package data;

import model.SecCamState;

public class SecurityCameraRepository {
    private SecCamState cameraState;

    public SecurityCameraRepository() {
        this.cameraState = SecCamState.OFF; // Default state
    }

    public SecCamState getCameraState() {
        return cameraState;
    }

    public void setCameraState(SecCamState state) {
        this.cameraState = state;
    }
}
