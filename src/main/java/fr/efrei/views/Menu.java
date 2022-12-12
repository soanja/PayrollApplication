package fr.efrei.views;

import fr.efrei.domain.*;
import fr.efrei.factory.*;
import fr.efrei.repository.GenderRepository;
import fr.efrei.repository.NameRepository;
import fr.efrei.repository.RaceRepository;
import fr.efrei.repository.EmployeeRepository;

import java.util.*;



public class Menu {

    static List<Employee> employeeList = new ArrayList<>();

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
        String lastName, middleName, firstName, genderDescription, racechoice, raceDescription,
                streetaddress, postaladdress, state, country, zipcode, homename, statusJob,
                cellPhoneNumber, homeNumber, email, jobEmployee;
        int streetnumber, positionCode;

        while(verif){
            System.out.println("Welcome to the program. Choose one option below to start (from 0 to 5)");
            System.out.println("0. Add an employee\n1. Update an employee to the list " +
                    "\n2.  Delete an employee \n3.Search for an employee\n4. Show all employee \n5. Exit the program");
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

                        genderDescription = sc.next();
                        Gender gender = GenderFactory.createGender(genderDescription);
                        System.out.println(gender);


                    System.out.println("Select one race 1-India, 2-Europe, 3-Africa");

                        raceDescription = "";
                        racechoice = sc.next();
                        if (racechoice.equals("1"))
                            raceDescription = "Indian";
                        else if (racechoice.equals("2"))
                            raceDescription = "Europe";
                        else if (racechoice.equals("3"))
                            raceDescription = "Africa";

                        Race race = RaceFactory.createRace(raceDescription);
                        System.out.println(race);



                    System.out.println("Enter address: ");
                    streetaddress = sc.next();
                    System.out.println("Enter your postal Address");
                    postaladdress = sc.next();
                    System.out.println("Enter your state");
                    state = sc.next();
                    System.out.println("Enter your country");
                    country = sc.next();
                    System.out.println("Enter your Zip Code");
                    zipcode = sc.next();
                    System.out.println("Enter your street number");
                    streetnumber = sc.nextInt();
                    System.out.println("Enter your home's name");
                    homename = sc.next();


                        Address address = AddressFactory.createAdress(streetaddress, postaladdress, state, country, zipcode, streetnumber, homename);
                        System.out.println(address);



                    System.out.println("Enter your postion (must be filled or opened)");
                    statusJob = sc.next();


                        Position position = PositionFactory.createPosition(statusJob);
                        System.out.println(position);



                    System.out.println("Enter your cellphone Number:");
                    cellPhoneNumber= sc.next();
                    System.out.println("Enter your home Number:");
                    homeNumber= sc.next();
                    System.out.println("Enter your email:");
                    email= sc.next();


                        Contact contact = ContactFactory.createContact(cellPhoneNumber, email, homeNumber);
                        System.out.println(contact);

                    System.out.println("Enter the employee job:");
                    jobEmployee = sc.next();


                        Employee employee = EmployeeFactory.createEmployee(name, gender,race, jobEmployee, address,  contact,position);
                        Menu.employeeList.add(employee);

                    System.out.println(employee);

                    break;
                case 1:
                    System.out.println("Give me an ID:");
                    String newID = sc.next();
                    Employee employeeTemp = null;
                    for (Employee e : Menu.employeeList){
                        if (e.getEmployeeNumber().equals(newID)){
                            employeeTemp = e;
                        }
                    }
                    String numbertemp = employeeTemp.getEmployeeNumber();
                    Name nametemp = employeeTemp.getEmployeeName();
                    Gender gendertemp = employeeTemp.getGenderEmployee();
                    Race racetemp = employeeTemp.getRaceEmployee();
                    String jobtemp = employeeTemp.getJobEmployee();
                    Address addresstemp = employeeTemp.getAddress();
                    Contact contacttemp = employeeTemp.getContact();
                    Position positiontemp = employeeTemp.getPosition();

                    System.out.println("Which part do you want to change ? ");
                    System.out.println("1 for Name, 2 for Gender, 3 for Race, 4 for Job, 5 for Address, 6 for Contact, 7 for Position");
                    int sw = sc.nextInt();

                    switch (sw){
                        case 1 :
                            System.out.println("Give me a new First Name : ");
                            String fname = sc.next();
                            System.out.println("Give me a new Middle Name : ");
                            String mname = sc.next();
                            System.out.println("Give me a new Last Name : ");
                            String lname = sc.next();

                            Name name1 = NameFactory.createName(fname, mname, lname);
                            Employee employee1 = EmployeeFactory.createEmployee(name1, gendertemp, racetemp, jobtemp, addresstemp, contacttemp, positiontemp);
                            EmployeeRepository.getRepository().update(employeeTemp, employee1);
                            System.out.println(employee1);
                            Menu.employeeList.add(employee1);
                            for (Employee e: Menu.employeeList){
                                if (e.getEmployeeNumber().equals(numbertemp)){
                                    Menu.employeeList.remove(e);
                                }
                            }
                            break;

                        case 2 :
                            System.out.println("Give me your new gender");
                            String newgend = sc.next();

                            Gender gender1 = GenderFactory.createGender(newgend);
                            Employee employee2 = EmployeeFactory.createEmployee(nametemp, gender1, racetemp, jobtemp, addresstemp, contacttemp, positiontemp);
                            EmployeeRepository.getRepository().update(employeeTemp, employee2);
                            System.out.println(employee2);
                            Menu.employeeList.add(employee2);
                            for (Employee e: Menu.employeeList){
                                if (e.getEmployeeNumber().equals(numbertemp)){
                                    Menu.employeeList.remove(e);
                                }
                            }
                            break;

                        case 3 :
                            System.out.println("Give me your new race : 1 for India, 2 for Europe, 3 for Africa");
                            int numb = sc.nextInt();
                            String newrace = null;
                            if (numb == 1){
                                newrace = "India";
                            }
                            else if (numb == 2){
                                newrace = "Europe";
                            }
                            else if (numb == 3){
                                newrace = "Africa";
                            }

                            Race race1 = RaceFactory.createRace(newrace);
                            Employee employee3 = EmployeeFactory.createEmployee(nametemp, gendertemp, race1, jobtemp, addresstemp, contacttemp, positiontemp);
                            EmployeeRepository.getRepository().update(employeeTemp, employee3);
                            System.out.println(employee3);
                            Menu.employeeList.add(employee3);
                            for (Employee e: Menu.employeeList){
                                if (e.getEmployeeNumber().equals(numbertemp)){
                                    Menu.employeeList.remove(e);
                                }
                            }

                            break;
                        case 4 :
                            System.out.println("Give me a new Job : ");
                            String newjob = sc.next();

                            Employee employee4 = EmployeeFactory.createEmployee(nametemp, gendertemp, racetemp, newjob, addresstemp, contacttemp, positiontemp);
                            EmployeeRepository.getRepository().update(employeeTemp, employee4);
                            System.out.println(employee4);
                            Menu.employeeList.add(employee4);
                            for (Employee e: Menu.employeeList){
                                if (e.getEmployeeNumber().equals(numbertemp)){
                                    Menu.employeeList.remove(e);
                                }
                            }
                            break;

                        case 5 :
                            System.out.println("Enter address: ");
                            String newstreetaddress = sc.next();
                            System.out.println("Enter your postal Address");
                            String newpostaladdress = sc.next();
                            System.out.println("Enter your state");
                            String newstate = sc.next();
                            System.out.println("Enter your country");
                            String newcountry = sc.next();
                            System.out.println("Enter your Zip Code");
                            String newzipcode = sc.next();
                            System.out.println("Enter your street number");
                            int newstreetnumber = sc.nextInt();
                            System.out.println("Enter your home's name");
                            String newhomename = sc.next();

                            Address address1 = AddressFactory.createAdress(newstreetaddress, newpostaladdress, newstate, newcountry, newzipcode, newstreetnumber, newhomename);
                            Employee employee5 = EmployeeFactory.createEmployee(nametemp, gendertemp, racetemp, jobtemp, address1, contacttemp, positiontemp);
                            EmployeeRepository.getRepository().update(employeeTemp, employee5);
                            System.out.println(employee5);
                            Menu.employeeList.add(employee5);
                            for (Employee e: Menu.employeeList){
                                if (e.getEmployeeNumber().equals(numbertemp)){
                                    Menu.employeeList.remove(e);
                                }
                            }
                            break;

                        case 6 :
                            System.out.println("Enter your cellphone Number:");
                            String newcellPhoneNumber= sc.next();
                            System.out.println("Enter your home Number:");
                            String newhomeNumber= sc.next();
                            System.out.println("Enter your email:");
                            String newemail= sc.next();

                            Contact contact1 = ContactFactory.createContact(newcellPhoneNumber, newhomeNumber, newemail);
                            Employee employee6 = EmployeeFactory.createEmployee(nametemp, gendertemp, racetemp, jobtemp, addresstemp, contact1, positiontemp);
                            EmployeeRepository.getRepository().update(employeeTemp, employee6);
                            System.out.println(employee6);
                            Menu.employeeList.add(employee6);
                            for (Employee e: Menu.employeeList){
                                if (e.getEmployeeNumber().equals(numbertemp)){
                                    Menu.employeeList.remove(e);
                                }
                            }
                            break;

                        case 7 :
                            System.out.println("Give me your new position (must choose between filled and opened)");
                            String newposition = sc.next();

                            Position position1 = PositionFactory.createPosition(newposition);
                            Employee employee7 = EmployeeFactory.createEmployee(nametemp, gendertemp, racetemp, jobtemp, addresstemp, contacttemp, position1);
                            EmployeeRepository.getRepository().update(employeeTemp, employee7);
                            System.out.println(employee7);
                            Menu.employeeList.add(employee7);
                            for (Employee e: Menu.employeeList){
                                if (e.getEmployeeNumber().equals(numbertemp)){
                                    Menu.employeeList.remove(e);
                                }
                            }
                            break;

                        default:
                            System.out.println("You choose a wrong number, nothing will be updated");
                            break;
                    }

                    //EmployeeRepository.getRepository().update(employee);
                    break;
                case 2:
                    System.out.println("Give me an employee ID:");
                    String newName = sc.next();
                    EmployeeRepository.getRepository().delete(newName);

                    String[] temp = new String[Menu.employeeList.size()];

                    for(int i = 0; i<temp.length; i++){
                        temp[i] = Menu.employeeList.get(i).getEmployeeNumber();
                    }
                    int cpt = 0;
                    for (int i = 0; i<temp.length; i++){
                        if(temp[i] == newName){
                            cpt = i;
                        }
                    }

                    Employee employee1 = Menu.employeeList.get(cpt);

                    Menu.employeeList.remove(employee1);
                    break;
                case 3:
                    //List<Employee> employeeList = EmployeeRepository.getRepository().getAll();
                    System.out.println("Give me an ID");
                    String idEmployee = sc.next();
                    for (Employee e : Menu.employeeList){
                        if(e.getEmployeeNumber().equals(idEmployee)){
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    //List<Employee> employeeList2 = EmployeeRepository.getRepository().getAll();
                    for (Employee e: Menu.employeeList){
                        System.out.println(e + "\n ");
                    }
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



