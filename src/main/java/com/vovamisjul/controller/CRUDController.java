package com.vovamisjul.controller;

import java.util.Scanner;

public abstract class CRUDController {
    Scanner scanner = new Scanner(System.in);

    CRUDController() {

    }

    public void run() {
        while (true) {
            System.out.println("/**********************************************************/");
            System.out.println("Page of " + getEntityName());
            System.out.println("print: 1 to show all " + getEntityName() + "s; " +
                    "2 to add new " + getEntityName() + "; 3 to edit " + getEntityName() + "; " +
                    "4 to remove " + getEntityName() + "; 0 to exit");
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
                case "0":
                    return;
            }
        }
    }

    public abstract void createEntity();
    public abstract void readEntity();
    public abstract void updateEntity();
    public abstract void deleteEntity();
    abstract String getEntityName();
}
