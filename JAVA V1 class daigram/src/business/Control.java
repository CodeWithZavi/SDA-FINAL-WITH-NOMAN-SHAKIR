package business;

public class Control {
    private DoorLockService doorLockService;
    private SecurityCameraService securityCameraService;
    private TempService tempService;

    public Control() {
        this.doorLockService = new DoorLockService();
        this.securityCameraService = new SecurityCameraService();
        this.tempService = new TempService();
    }

    public void manageServices() {
        doorLockService.lockDoor();
        securityCameraService.turnOnCamera();
        tempService.updateTemperature(22.5);
    }
}
