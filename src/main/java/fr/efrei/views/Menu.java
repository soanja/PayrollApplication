package fr.efrei.views;

import fr.efrei.domain.Name;
import fr.efrei.domain.Gender;
import fr.efrei.factory.NameFactory;
import fr.efrei.factory.GenderFactory;

import java.util.*;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean verif = true;
        String lastName, middleName, firstName, genderDesc, race;

        while(verif != false){
            System.out.println("Welcome to the program. Choose one option below to start (from 0 to 5)");
            System.out.println("0. Create an employee\n1. Create and add an employee to the list " +
                    "\n2. Modify an employee\n3. Delete an employee \n4. Search for an employee\n5. Exit the program");
            System.out.println("\nif you wish to leave a blank space put a '?' \n");
            System.out.println("Your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Enter last name: ");
                    lastName = sc.next();
                    System.out.println("Enter middle name: ");
                    middleName = sc.next();
                    System.out.println("Enter first name: ");
                    firstName = sc.next();
                    Name name = NameFactory.createName(firstName, middleName, lastName);
                    System.out.println(name);
                    System.out.println("gender: ");
                    try{
                        genderDesc = sc.next();
                        Gender gender = GenderFactory.createGender(genderDesc);
                        System.out.println(gender);
                    }catch(Exception e){
                        System.out.println(e);
                    }

                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    verif = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }

    }
}
