package com.vovamisjul.controller;

import com.vovamisjul.model.entities.Apartment;
import com.vovamisjul.model.entities.people.Gender;
import com.vovamisjul.model.entities.people.Resident;

public class ApartmentController extends CRUDController {

    private Apartment apartment = new Apartment();

    public ApartmentController() {

    }

    public ApartmentController(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("/**********************************************************/");
            System.out.println("Page of " + getEntityName());
            System.out.println("print: 1 to show " + getEntityName() + "; " +
                    "2 to add new " + getSubentityName() + "; 3 to remove " + getSubentityName() + "; " +
                    "4 to reset consumptions; 5 to add consumptions; 0 to exit");
            var input = scanner.nextLine();
            switch (input) {
                case "1":
                    readEntity();
                    break;
                case "2":
                    createEntity();
                    break;
                case "3":
                    deleteEntity();
                    break;
                case "4":
                    apartment.resetConsumptions();
                    break;
                case "5":
                    addConsumptions();
                    break;
                case "0":
                    return;
            }
        }
    }

    @Override
    public void createEntity() {
        System.out.println("Enter name");
        var name = scanner.nextLine();
        System.out.println("Enter gender");
        var gender = scanner.nextLine();
        try {
            Gender g = Gender.fromString(gender);
            apartment.addResident(new Resident(name, g));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void readEntity() {
        System.out.println(apartment);
    }

    @Override
    public void updateEntity() {

    }

    @Override
    public void deleteEntity() {

    }

    @Override
    String getSubentityName() {
        return "resident";
    }

    @Override
    String getEntityName() {
        return "apartment";
    }

    private void addConsumptions() {
        System.out.println("print 1 to add hot water consumptions; 2 to add cold water consumptions; 3 to add power consumption");
        try {
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("print amount");
                    apartment.incHotWaterCons(scanner.nextDouble());
                    break;
                case "2":
                    System.out.println("print amount");
                    apartment.incColdWaterCons(scanner.nextDouble());
                    break;
                case "3":
                    System.out.println("print amount");
                    apartment.incPowerCons(scanner.nextDouble());
                    break;
            }
        } catch (Exception e) {
            System.out.println("Wrong number");
        }
    }
}
