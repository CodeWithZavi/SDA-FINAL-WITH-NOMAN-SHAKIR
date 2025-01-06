package data;

import model.DoorLockState;

public class DoorLockRepository {
    private DoorLockState doorLockState = DoorLockState.UNLOCKED;

    public DoorLockState getDoorLockState() {
        return doorLockState;
    }

    public void setDoorLockState(DoorLockState doorLockState) {
        this.doorLockState = doorLockState;
    }
}
