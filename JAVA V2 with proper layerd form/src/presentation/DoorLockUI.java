package presentation;

import business.DoorLockService;

import java.util.Scanner;

public class DoorLockUI {
    private DoorLockService doorLockService = new DoorLockService();

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Door Lock Controls ===");
        System.out.println("1. Lock Door");
        System.out.println("2. Unlock Door");
        System.out.println("3. Show Door State");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(doorLockService.lockDoor());
            case 2 -> System.out.println(doorLockService.unlockDoor());
            case 3 -> System.out.println("Door State: " + doorLockService.getDoorLockState());
            default -> System.out.println("Invalid option.");
        }
    }
}
