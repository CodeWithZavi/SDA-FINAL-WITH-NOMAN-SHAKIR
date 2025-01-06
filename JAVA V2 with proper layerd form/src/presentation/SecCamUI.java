package presentation;

import business.SecCamService;

import java.util.Scanner;

public class SecCamUI {
    private SecCamService secCamService = new SecCamService();

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Security Camera Controls ===");
        System.out.println("1. Turn On Camera");
        System.out.println("2. Turn Off Camera");
        System.out.println("3. Show Camera State");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(secCamService.turnOnCamera());
            case 2 -> System.out.println(secCamService.turnOffCamera());
            case 3 -> System.out.println("Camera State: " + secCamService.getSecCamState());
            default -> System.out.println("Invalid option.");
        }
    }
}
