package com.vovamisjul.controller;

import com.vovamisjul.model.entities.Apartment;
import com.vovamisjul.model.entities.House;

import java.util.Scanner;

public class HouseController extends CRUDController {
    private Scanner scanner = new Scanner(System.in);
    private House house = new House();

    public HouseController() {

    }

    public HouseController(House house) {
        this.house = house;
    }

    @Override
    public void createEntity() {
        System.out.println("Enter apartment number");
        var number = scanner.nextLine();
        try {
            var intNumber = Integer.parseInt(number);
            house.addApartments(new Apartment(intNumber));
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong apartment number");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void readEntity() {
        System.out.println(house);
    }

    @Override
    public void updateEntity() {
        System.out.println("Enter number");
        var number = scanner.nextLine();
        try {
            var index = Integer.parseInt(number);
            new ApartmentController(house.getApartment(index)).run();
        }
        catch (Exception e) {
            System.out.println("Wrong apartment number");
        }
    }

    @Override
    public void deleteEntity() {
        System.out.println("Enter number");
        var number = scanner.nextLine();
        try {
            var index = Integer.parseInt(number);
            house.deleteApartments(index);
        }
        catch (Exception e) {
            System.out.println("Wrong apartment number");
        }
    }

    @Override
    public void sortEntities() {

    }

    @Override
    public void searchEntity() {
        System.out.println("Enter number");
        var number = scanner.nextLine();
        try {
            var index = Integer.parseInt(number);
            System.out.println(house.getApartment(index));
        }
        catch (Exception e) {
            System.out.println("Wrong apartment number");
        }
    }

    @Override
    String getSubentityName() {
        return "apartment";
    }

    @Override
    String getEntityName() {
        return "house";
    }
}
