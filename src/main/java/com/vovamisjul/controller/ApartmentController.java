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
            System.out.println("print: 1 to show all " + getEntityName() + "s; " +
                    "2 to add new " + getEntityName() + "; 3 to edit " + getEntityName() + "; " +
                    "4 to remove " + getEntityName() + "; 5 to reset consumptions; 6 to add consumptions; 0 to exit");
            var input = scanner.nextLine();
            switch (input) {
                case "1":
                    readEntity();
                    break;
                case "2":
                    createEntity();
                    break;
                case "3":
                    updateEntity();
                    break;
                case "4":
                    deleteEntity();
                    break;
                case "5":
                    apartment.resetConsumptions();
                    break;
                case "6":
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
    String getEntityName() {
        return "resident";
    }

    void addConsumptions() {
        System.out.println("print 1 to add hot water consumptions; 2 to add cold water consumptions; 3 to add power consumption");
        try {
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("print amount");
                    apartment.incHotWaterCons(Double.parseDouble(scanner.nextLine()));
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
