package com.vovamisjul.controller;

import com.vovamisjul.CommunalServices;
import com.vovamisjul.entities.House;
import com.vovamisjul.entities.HouseAddress;

import java.util.Scanner;

public class CommunalServicesController {
    private CommunalServices communalServices = new CommunalServices();
    private Scanner scanner = new Scanner(System.in);

    public CommunalServicesController() {

    }

    public void run() {
        while (true) {
            System.out.println("/**********************************************************/");
            System.out.println("Communal services start page");
            System.out.println("print: 1 to show all houses; 2 to add new house; 0 to exit");
            var input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println(communalServices.toString());
                    break;
                case "2":
                    addNewHouse();
                    break;
                case "0":
                    return;
            }
        }
    }

    public void addNewHouse() {
        System.out.println("Enter city");
        var city = scanner.nextLine();
        System.out.println("Enter street");
        var street = scanner.nextLine();
        System.out.println("Enter house number");
        var number = scanner.nextLine();
        try {
            var intNumber = Integer.parseInt(number);
            communalServices.addHouse(new House(new HouseAddress(city, street, intNumber)));
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong house number");
        }
    }
}
