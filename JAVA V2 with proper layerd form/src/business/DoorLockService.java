package business;

import data.DoorLockRepository;
import model.DoorLockState;

public class DoorLockService {
    private DoorLockRepository doorLockRepository = new DoorLockRepository();

    public String lockDoor() {
        doorLockRepository.setDoorLockState(DoorLockState.LOCKED);
        return "Door is now locked.";
    }

    public String unlockDoor() {
        doorLockRepository.setDoorLockState(DoorLockState.UNLOCKED);
        return "Door is now unlocked.";
    }

    public DoorLockState getDoorLockState() {
        return doorLockRepository.getDoorLockState();
    }
}
