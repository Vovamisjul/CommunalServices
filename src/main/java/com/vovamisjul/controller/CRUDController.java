package com.vovamisjul.controller;

import java.util.Scanner;

public abstract class CRUDController {
    Scanner scanner = new Scanner(System.in);

    CRUDController() {

    }

    public void run() {
        start();
        while (true) {
            System.out.println("/**********************************************************/");
            System.out.println("Page of " + getEntityName());
            System.out.println("print: 1 to show " + getEntityName() + "; " +
                    "2 to add new " + getSubentityName() + "; 3 to edit " + getSubentityName() + "; " +
                    "4 to remove " + getSubentityName() + "; 5 to sort " + getSubentityName() + "; " +
                    "6 to search " + getSubentityName() + "; 0 to exit");
            switch (scanner.nextLine()) {
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
                    sortEntities();
                    break;
                case "6":
                    searchEntity();
                    break;
                case "0":
                    exit();
                    return;
            }
        }
    }

    public abstract void createEntity();
    public abstract void readEntity();
    public abstract void updateEntity();
    public abstract void deleteEntity();
    public abstract void sortEntities();
    public abstract void searchEntity();
    abstract String getSubentityName();
    abstract String getEntityName();
    public void exit() {

    }
    public void start() {

    }
}
