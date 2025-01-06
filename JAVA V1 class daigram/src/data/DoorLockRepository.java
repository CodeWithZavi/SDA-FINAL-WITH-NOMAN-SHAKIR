package data;

import model.DoorLockState;

public class DoorLockRepository {
    private DoorLockState doorLockState;

    public DoorLockRepository() {
        this.doorLockState = DoorLockState.UNLOCKED; // Default state
    }

    public DoorLockState getDoorLockState() {
        return doorLockState;
    }

    public void setDoorLockState(DoorLockState state) {
        this.doorLockState = state;
    }
}
