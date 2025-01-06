package presentation;

import business.TempService;

import java.util.Scanner;

public class TempServiceUI {
    private TempService tempService = new TempService();

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Temperature Service ===");
        System.out.println(tempService.getCurrentTemperature());
    }
}
