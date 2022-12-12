package fr.efrei.views;

import fr.efrei.domain.Employee;
import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
import fr.efrei.domain.Gender;
import fr.efrei.factory.NameFactory;
import fr.efrei.factory.GenderFactory;
import fr.efrei.factory.RaceFactory;
import fr.efrei.repository.RaceRepository;
import fr.efrei.repository.EmployeeRepository;

import java.util.*;



public class Menu {

    //populate, load, init
    public static void loadObject(){
        //the constructor is private, so we can't access therefore we access the Factory

        Name name1 = NameFactory.createName("Sam", "Pondevie");
        Name name2 = NameFactory.createName("Emma", "Simone","Deste");
        Name error = NameFactory.createName("Kruben", "Naidoo");

        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("Asian");
        Race race3 = RaceFactory.createRace("SpaceMan");

        Gender gender = GenderFactory.createGender("Colored");

        RaceRepository raceRepository = RaceRepository.getRepository();
        EmployeeRepository employeeRepository = EmployeeRepository.getRepository();

        raceRepository.create(race1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean verif = true;
        String lastName, middleName, firstName, genderDescription, racechoice, raceDescription;

        while(verif != false){
            System.out.println("Welcome to the program. Choose one option below to start (from 0 to 5)");
            System.out.println("0. Add an employee\n1. Update an employee to the list " +
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
                        genderDescription = sc.next();
                        Gender gender = GenderFactory.createGender(genderDescription);
                        System.out.println(gender);
                    }catch(Exception e){
                        System.out.println(e);
                    }

                    System.out.println("Select one race 1-India, 2-Europe, 3-Africa\n");
                    racechoice = sc.nextLine();
                    if (racechoice.equals("1"))
                        raceDescription = "Indian";
                    else if (racechoice.equals("2"))
                        raceDescription = "Europe";
                    else if (racechoice.equals("3"))
                        raceDescription = "Africa";


                    //we get the id of the race
                    //Race race = RaceRepository.read(raceDescription);
                    //String raceId = race.getId();

                    /*
                    //getId of race
                    we go to repository w/ read ()
                    we pass in the desc
                    with description an object is returned
                    when we have the object we can just do object.getId()

                    Race race = RaceRepository.read(raceDescription);
                    String raceId = race.getId()

                    //get employee object and add to employee repo
                    Employee employee = EmployeeFactory,createEmployee(name, raceId);

                    //add employee to employee repository
                    at top we add a empoloyee repository

                     */

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



