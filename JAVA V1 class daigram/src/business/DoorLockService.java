package business;

import data.DoorLockRepository;
import model.DoorLockState;

public class DoorLockService {
    private DoorLockRepository repository;

    public DoorLockService() {
        this.repository = new DoorLockRepository();
    }

    public void lockDoor() {
        repository.setDoorLockState(DoorLockState.LOCKED);
        System.out.println("Door locked.");
    }

    public void unlockDoor() {
        repository.setDoorLockState(DoorLockState.UNLOCKED);
        System.out.println("Door unlocked.");
    }

    public DoorLockState getDoorLockState() {
        return repository.getDoorLockState();
    }
}
