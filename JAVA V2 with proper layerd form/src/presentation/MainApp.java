package presentation;

public class MainApp {
    public static void main(String[] args) {
        DoorLockUI doorLockUI = new DoorLockUI();
        doorLockUI.display();

        SecCamUI secCamUI = new SecCamUI();
        secCamUI.display();

        TempServiceUI tempServiceUI = new TempServiceUI();
        tempServiceUI.display();
    }
}
