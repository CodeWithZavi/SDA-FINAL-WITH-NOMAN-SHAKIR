package data;

import model.SecCamState;

public class SecCamRepository {
    private SecCamState secCamState = SecCamState.OFF;

    public SecCamState getSecCamState() {
        return secCamState;
    }

    public void setSecCamState(SecCamState secCamState) {
        this.secCamState = secCamState;
    }
}
