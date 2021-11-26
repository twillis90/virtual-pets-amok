package pets_amok;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        DogKennel dogKennel = new DogKennel("dog kennel", "large", 0, 5);
        CatArea catArea = new CatArea("cat area", "large", 0, 5);
        LizardTank lizardTank = new LizardTank("lizard tank", "medium", 10, 15);
        HorseStable horseStable = new HorseStable("stable", "medium to large", 10, 15);
        RobotGarage robotGarage = new RobotGarage("mechanical garage", "large", 5, 10);
        Dog dog1 = new Dog("dude", "dog", "chill, sleepy, hungry", dogKennel, 40,
                20, 90, 40, 75, 80, 5, true);
        Dog dog2 = new Dog("fido", "dog", "feisty, energetic", dogKennel, 20,
                20, 90, 90, 75, 90, 5, true);
        Cat cat1 = new Cat("lady", "cat", "better than you. knows it.", catArea, 40,
                20, 90, 40, 95, 75, 5, true);
        Cat cat2 = new Cat("carlos", "cat", "rouge operative, likes cheese", catArea, 50,
                30, 90, 80, 65, 80, 15, true);
        Lizard lizard1 = new Lizard("smaug", "lizard", "smol, fierce, hoarder", lizardTank, 20,
                15, 90, 50, 75, 68, 15, true);
        Lizard lizard2 = new Lizard("rango", "lizard", "nervous, charismatic", lizardTank, 30,
                20, 85, 80, 90, 80, 5, true);
        Horse horse = new Horse("horse", "horse", "its a horse. we don't know how he got here",
                horseStable, 15, 20, 100, 75, 75, 90, 15, true);
        RoboticPet roboDog1 = new RoboticPet("k-9", "mechanical dog", "programmed for loyalty",
                robotGarage, 85, 90, 10, 95, true);
        RoboticPet roboDog2 = new RoboticPet("D0g-9000", "mechanical dog", "programmed for awesomeness",
                robotGarage, 85, 95, 10, 95, true);
        RoboticPet roboCat1 = new RoboticPet("f3l1n3", "mechanical cat", "programmed for class",
                robotGarage, 95, 85, 10, 95, true);
        RoboticPet roboCat2 = new RoboticPet("meow bot", "mechanical cat", "programmed for noise",
                robotGarage, 85, 90, 10, 95, true);

        VirtualPetShelter allPetsList = new VirtualPetShelter();
        allPetsList.addPet(dog1);
        allPetsList.addPet(dog2);
        allPetsList.addPet(cat1);
        allPetsList.addPet(cat2);
        allPetsList.addPet(lizard1);
        allPetsList.addPet(lizard2);
        allPetsList.addPet(horse);
        allPetsList.addPet(roboCat1);
        allPetsList.addPet(roboCat2);
        allPetsList.addPet(roboDog1);
        allPetsList.addPet(roboDog2);

        System.out.println("Welcome to Thunder Dome Pet Shelter. We have a little bit of everything\n" +
                "and it's YOUR job to take care of these pets.\n" +
                "You will have to maintain the shelter and the pets.\n" +
                "The pets will need fed, cleaned, and generally taken care of.\n" +
                "The shelters will need to be cleaned regularly as well.\n" +
                "Here are the pets currently in the shelter:");
        System.out.println();
        System.out.println("ALL PETS LIST");
        System.out.println("--------------");
        allPetsList.showPets();

        System.out.println();
        System.out.println();
        System.out.println("Press '9' at anytime to Exit.");
        System.out.println();
        System.out.println();
        while (allPetsList.isAliveCheck(dog1)) {
            // -----------------------PROBLEM HERE
            // -----------------------NEED ALIVE CHECK TO ITERATE THROUGH ALL ORGANIC PETS
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("MENU");
            System.out.println("-----");
            System.out.println();
            System.out.println("To view all pets and their current values press '1'");
            System.out.println("To interact with only biological pets press '2'");
            System.out.println("To interact with only mechanical pets press '3'");
            System.out.println("To interact with the pet shelters press '4'");
            System.out.println("To add a new pet to the shelter press '5'");
            System.out.println("To let someone adopt a pet '6'");
            int action = inputScan.nextInt();
            if (action == 1) {
                System.out.println("ALL PET LIST");
                System.out.println("-------------");
                System.out.println("Biological Pets: ");
                System.out.println("---------------");
                allPetsList.listOrganicPets();
                System.out.println();
                System.out.println("Mechanical Pets");
                System.out.println("---------------");
                allPetsList.listRoboticPets();
                continue;
            }
            if (action == 2) {
                System.out.println();
                System.out.println("Biological Pets Menu");
                System.out.println("---------------------");
                System.out.println();
                System.out.println("To interact with all biological pets press 1");
                System.out.println("To interact with the dogs press 2");
                System.out.println("To interact with the cats press 3");
                System.out.println("To interact with the lizards press 4");
                System.out.println("To interact with the horse press 5");
                System.out.println("To return to the previous menu press 6");
                int choice = inputScan.nextInt();
                if (choice == 1) {
                    System.out.println("Bulk Action Menu");
                    System.out.println("----------------");
                    System.out.println();
                    System.out.println("To feed all Biological Pets press 1");
                    System.out.println("To water all Biological Pets press 2");
                    System.out.println("To bathe all Biological Pets press 3");
                    System.out.println("To return to the previous menu press 4");
                    int selection = inputScan.nextInt();
                    if (selection == 1) {
                        allPetsList.feedAllOrganics();
                    }
                    if (selection == 2) {
                        allPetsList.waterAllOrganics();
                    }
                    if (selection == 3) {
                        allPetsList.washAllOrganics();
                    }
                    if (selection == 4) {
                        continue;
                    }
                }
                if (choice == 2) {
                    System.out.println("All Dogs Menu");
                    System.out.println("--------------");
                    System.out.println();
                    System.out.println("To select a single dog to interact with press 1");
                    System.out.println("To list all dogs values press 2");
                    System.out.println("To feed all dogs press 3");
                    System.out.println("To water all dogs press 4");
                    System.out.println("To Bathe all dogs press 5");
                    System.out.println("To walk all dogs press 6");
                    System.out.println("To return to the previous menu press 7");
                    int selection = inputScan.nextInt();
                    if (selection == 1) {
                        System.out.println("Single Dog Menu");
                        System.out.println("----------------");
                        System.out.println();
                        System.out.println("To walk a single dog press 1");
                        System.out.println("To play fetch with a single dog press 2");
                        System.out.println("To return to the previous menu press 3");
                        System.out.println();
                        int pick = inputScan.nextInt();
                        if (pick == 1) {
                            //---------PROBLEM HERE-----------------
                            // PRINTING ALL PETS
                            //NOT ACCEPTING INPUT NAME
                            allPetsList.showDogs();
                            String petName = inputScan.nextLine();
                            allPetsList.findDog(petName);
                            System.out.println("which dog would you like to walk");
                            if(allPetsList.findDog(petName) instanceof Dog){
                                ((Dog) allPetsList.findDog(petName)).walkDog();
                                System.out.println("You went on a walk with " + petName);
                            }
                        }
                        if (pick == 2) {
                            allPetsList.listAllDogsAndValues();
                            System.out.println("which dog would you like to fetch with");
                            String petName = inputScan.nextLine();
                            if (allPetsList.findDog(petName) instanceof Dog) {
                                ((Dog) allPetsList.getAllPets(petName)).playFetch();
                            }
                        }
                        if (pick == 3) {
                            continue;
                        }
                    }
                    if (selection == 2) {
                        allPetsList.listAllDogsAndValues();
                    }
                    if (selection == 3) {
                        allPetsList.feedAllDogs();
                    }
                    if (selection == 4) {
                        allPetsList.waterAllDogs();
                    }
                    if (selection == 5) {
                        allPetsList.washAllDogs();
                    }
                    if (selection == 6) {
                        allPetsList.walkAllDogs();
                    }
                    if (selection == 7) {
                        continue;
                    }
                }
                if (choice == 3) {
                    System.out.println("All Cats Menu");
                    System.out.println("--------------");
                    System.out.println("To select a single cat to interact with press 1");
                    System.out.println("To list all cats values press 2");
                    System.out.println("To feed all cats press 3");
                    System.out.println("To water all cats press 4");
                    System.out.println("To bathe all cats press 5");
                    System.out.println("To let all the cats nap press 6");
                    System.out.println("To return to the previous menu press 7");
                    int selection = inputScan.nextInt();
                    if (selection == 1) {
                        System.out.println("Single Cat Menu");
                        System.out.println("----------------");
                        System.out.println();
                        System.out.println("To let a single cat nap press 1");
                        System.out.println("To feed a single cat press 2");
                        System.out.println("To return to the previous menu press 3");
                        System.out.println();
                        int pick = inputScan.nextInt();
                        if (pick == 1) {
                            allPetsList.listAllCatsAndValues();
                            System.out.println("which cat would you like to give a nap");
                            String petName = inputScan.nextLine();
                            if (allPetsList.getAllPets(petName) instanceof Cat) {
                                ((Cat) allPetsList.getAllPets(petName)).catNap();
                            }
                        }
                        if (pick == 2) {
                            allPetsList.listAllCatsAndValues();
                            System.out.println("which cat would you like to feed");
                            String petName = inputScan.nextLine();
                            if (allPetsList.getAllPets(petName) instanceof Cat) {
                                ((Cat) allPetsList.getAllPets(petName)).feedPet();
                            }
                        }
                        if (pick == 3) {
                            continue;
                        }
                    }
                    if (selection == 2) {
                        allPetsList.listAllCatsAndValues();
                    }
                    if (selection == 3) {
                        allPetsList.feedAllCats();
                    }
                    if (selection == 4) {
                        allPetsList.waterAllCats();
                    }
                    if (selection == 5) {
                        allPetsList.washAllCats();
                    }
                    if (selection == 6) {
                        allPetsList.allCatsNap();
                    }
                    if (selection == 7) {
                        continue;
                    }
                }
                if (choice == 4) {
                    System.out.println("All Lizards Menu");
                    System.out.println("-----------------");
                    System.out.println();
                    System.out.println("To select a single lizard to interact with press 1");
                    System.out.println("To list all lizard values press 2");
                    System.out.println("To feed all lizards press 3");
                    System.out.println("To water all lizards press 4");
                    System.out.println("To Bathe all lizards press 5");
                    System.out.println("To let all lizards sun press 6");
                    System.out.println("To let all lizards do lizard stuff press 7");
                    System.out.println("To return to the previous menu press 8");
                    int selection = inputScan.nextInt();
                    if (selection == 1) {
                        System.out.println("Single Lizard Menu");
                        System.out.println("-------------------");
                        System.out.println();
                        System.out.println("To pick a lizard to do lizard stuff press 1");
                        System.out.println("To let a lizard sun press 2");
                        System.out.println("To return to the previous menu press 3");
                        System.out.println();
                        int pick = inputScan.nextInt();
                        if (pick == 1) {
                            allPetsList.showLizards();
                            System.out.println("which lizard would you like to let do lizards stuff");
                            String petName = inputScan.nextLine();
                            if (allPetsList.getAllPets(petName) instanceof Lizard) {
                                ((Lizard) allPetsList.getAllPets(petName)).lizardStuff();
                            }
                        }
                        if (pick == 2) {
                            allPetsList.showLizards();
                            System.out.println("which lizard would you like to let sun");
                            String petName = inputScan.nextLine();
                            if (allPetsList.getAllPets(petName) instanceof Lizard) {
                                ((Lizard) allPetsList.getAllPets(petName)).lizardSun();
                            }
                        }
                        if (pick == 3) {
                            continue;
                        }
                    }
                    if (selection == 2) {
                        for (VirtualPet pet : allPetsList.allPetsList.values()) {
                            if (pet instanceof Lizard) {
                                ((Lizard) pet).getPetLevels();
                            }
                        }
                    }
                    if (selection == 3) {
                        allPetsList.feedAllLizards();
                    }
                    if (selection == 4) {
                        allPetsList.waterAllLizard();
                    }
                    if (selection == 5) {
                        allPetsList.washAllLizard();
                    }
                    if (selection == 6) {
                        allPetsList.allLizardSun();
                    }
                    if (selection == 7) {
                        allPetsList.allLizardStuff();
                    }
                    if (selection == 8) {
                        continue;
                    }
                }
                if (choice == 5) {
                    System.out.println("The Horse's Menu");
                    System.out.println("-----------------");
                    allPetsList.showHorse();
                    System.out.println("There is only one Horse.");
                    System.out.println("There will only EVER be one Horse");
                    System.out.println("To check the stats of the Horse press 1");
                    System.out.println("To feed the Horse press 2");
                    System.out.println("To water the Horse press 3");
                    System.out.println("To wash the Horse press 4");
                    System.out.println("To let the Horse graze press 5");
                    System.out.println("To let the Horse gallop press 6");
                    System.out.println("To leave the Horse as quickly as possible\n" +
                            "(Which we highly recommend. He is unstable...heh..get it?)\n" +
                            "press 7");
                    int selection = inputScan.nextInt();
                    if (selection == 1) {
                        for (VirtualPet pet : allPetsList.allPetsList.values()) {
                            if (pet instanceof Horse) {
                                ((Horse) pet).getPetLevels();
                            }
                        }
                    }
                    if (selection == 2) {
                        allPetsList.feedAllHorse();
                    }
                    if (selection == 3) {
                        allPetsList.waterAllHorse();
                    }
                    if (selection == 4) {
                        allPetsList.washAllHorse();
                    }
                    if (selection == 5) {
                        allPetsList.horseGraze();
                    }
                    if (selection == 6) {
                        allPetsList.allHorseGallop();
                    }
                    if (selection == 7) {
                        continue;
                    }
                }
                if (choice == 6) {
                    continue;
                }
            }
            if (action == 3) {
                // ADD A BUILD BOT FUNCTION
                // ADD PET FOR ROBOTIC PET CLASS
                System.out.println("Mechanical Pets Menu");
                System.out.println("---------------------");
                System.out.println();
                System.out.println("To select a specific Mechanical Pet press 1");
                System.out.println("To List all Mechanical Pets and their Values press 2");
                System.out.println("To oil all mechanical pets press 3");
                System.out.println("To have maintenance performed on all mechanical pets press 4");
                System.out.println("To charge all mechanical pets press 5");
                System.out.println("To return to the previous menu press 6");
                int selection = inputScan.nextInt();
                if (selection == 1) {
                    System.out.println("Single Mechanical Pet Menu");
                    System.out.println("----------------------------");
                    System.out.println();
                    System.out.println("To play with a Mechanical Pet press 1");
                    System.out.println("To Repair a Mechanical Pet press 2");
                    System.out.println("To return to the previous menu press 3");
                    System.out.println();
                    int pick = inputScan.nextInt();
                    if (pick == 1) {
                        allPetsList.showBotPets();
                        System.out.println("which mechanical pet would you like to play with");
                        String petName = inputScan.nextLine();
                        if (allPetsList.getAllPets(petName) instanceof RoboticPet) {
                            ((RoboticPet) allPetsList.getAllPets(petName)).playWithBot();
                        }
                    }
                    if (pick == 2) {
                        allPetsList.showBotPets();
                        System.out.println("which mechanical pet would you like to repair");
                        String petName = inputScan.nextLine();
                        if (allPetsList.getAllPets(petName) instanceof RoboticPet) {
                            ((RoboticPet) allPetsList.getAllPets(petName)).repairBot();
                        }
                    }
                    if (pick == 3) {
                        continue;
                    }
                }
                if (selection == 2) {
                    for (VirtualPet pet : allPetsList.allPetsList.values()) {
                        if (pet instanceof RoboticPet) {
                            ((RoboticPet) pet).getBotLevels();
                        }
                    }
                }
                if (selection == 3) {
                    allPetsList.oilAllBots();
                }
                if (selection == 4) {
                    allPetsList.maintainAllBots();
                }
                if (selection == 5) {
                    allPetsList.chargeAllBots();
                }
                if (selection == 6) {
                    continue;
                }

            }
            if (action == 4) {
                System.out.println("All Shelters Menu");
                System.out.println("-----------------");
                System.out.println();
                System.out.println("To go to the Cat housing area press 1");
                System.out.println("To go to the Dog kennels press 2");
                System.out.println("To to go to the Lizard tanks press 3");
                System.out.println("To go to the Horse Stable press 4");
                System.out.println("To go to the Mechanical pet garage press 5");
                System.out.println("To return press 6");
                int selection = inputScan.nextInt();
                if (selection == 1) {
                    System.out.println("To clean the Cat housing area press 1");
                    System.out.println("To change the community cat litter press 2");
                    System.out.println("To check the Cat area levels press 3");
                    System.out.println("To return press 4");
                    int choice = inputScan.nextInt();
                    if (choice == 1) {
                        allPetsList.cleanCatArea();
                    }
                    if (choice == 2) {
                        allPetsList.changeCatLitter();
                    }
                    if (choice == 3) {
                        allPetsList.getCatAreaLevels();
                    }
                    if (choice == 4) {
                        continue;
                    }
                }
                if (selection == 2) {
                    System.out.println("To clean the Dog Kennel area press 1");
                    System.out.println("To clear the waste from the Kennel press 2");
                    System.out.println("To check the Dog Kennel levels press 3");
                    System.out.println("To return press 4");
                    int choice = inputScan.nextInt();
                    if (choice == 1) {
                        allPetsList.cleanDogKennel();
                    }
                    if (choice == 2) {
                        allPetsList.clearKennelWaste();
                    }
                    if (choice == 3) {
                        allPetsList.getDogKennelLevels();
                    }
                    if (choice == 4) {
                        continue;
                    }
                }
                if (selection == 3) {
                    System.out.println("To clean the Lizard Tank area press 1");
                    System.out.println("To clear the waste from the Tank press 2");
                    System.out.println("To check the Lizard Tank levels press 3");
                    System.out.println("To return press 4");
                    int choice = inputScan.nextInt();
                    if (choice == 1) {
                        allPetsList.cleanLizardTank();
                    }
                    if (choice == 2) {
                        allPetsList.clearLizardWaste();
                    }
                    if (choice == 3) {
                        allPetsList.getTankLevels();
                    }
                    if (choice == 4) {
                        continue;
                    }
                }
                if (selection == 4) {
                    System.out.println("To clean the Horse Stable area press 1");
                    System.out.println("To clear the waste from the Horse Stable press 2");
                    System.out.println("To check the Horse Stable levels press 3");
                    System.out.println("To return press 4");
                    int choice = inputScan.nextInt();
                    if (choice == 1) {
                        allPetsList.cleanHorseStable();
                    }
                    if (choice == 2) {
                        allPetsList.clearStableWaste();
                    }
                    if (choice == 3) {
                        allPetsList.getStableLevels();
                    }
                    if (choice == 4) {
                        continue;
                    }
                }
                if (selection == 5) {
                    System.out.println("To clean the Robotics Garage press 1");
                    System.out.println("To clear the waste from the Garage press 2");
                    System.out.println("To check Robotics Garage levels press 3");
                    System.out.println("To return press 4");
                    int choice = inputScan.nextInt();
                    if (choice == 1) {
                        allPetsList.cleanGarage();
                    }
                    if (choice == 2) {
                        allPetsList.clearGarageWaste();
                    }
                    if (choice == 3) {
                        allPetsList.getGarageLevels();
                    }
                    if (choice == 4) {
                        continue;
                    }
                }
                if (selection == 6) {
                    continue;
                }
            }
            if (action == 5) {
                System.out.println("Pet Adoption Menu");
                System.out.println("-----------------");
                System.out.println("Which pet is getting adopted today?");
                String petChoice = inputScan.nextLine();
                allPetsList.removePet(allPetsList.findPet(petChoice));
                System.out.println("Say Goodbye to " + petChoice + "!");
            }
            if (action == 6) {
                System.out.println("Pet Intake Menu");
                System.out.println("------------------");
                System.out.println("What type of pet is being added to the shelter?");
                System.out.println("Press 1 for a Dog");
                System.out.println("Press 2 for a Cat");
                int choice = inputScan.nextInt();
                if (choice == 1) {
                    System.out.println("Intake a new Dog");
                    System.out.println("-----------------");
                    System.out.println();
                    System.out.println("What is the name of the dog we are adding?");
                    String freshDogName = inputScan.nextLine();
                    String freshDogType = "dog";
                    System.out.println("Describe the dog in a few words.");
                    String freshDogDescription = inputScan.nextLine();
                    PetHousing freshDogHouse = dogKennel;
                    Dog dogToAdd = new Dog(freshDogName, freshDogType, freshDogDescription, freshDogHouse);
                    allPetsList.addPet(dogToAdd);
                    System.out.println(freshDogName + " has been added to the Shelter!");
                }
                if (choice == 2) {
                    System.out.println("Intake a new Cat");
                    System.out.println("-----------------");
                    System.out.println();
                    System.out.println("What is the name of the new Cat?");
                    String freshCatName = inputScan.nextLine();
                    String freshCatType = "cat";
                    System.out.println("Describe this cat in a few words.");
                    String freshCatDescription = inputScan.nextLine();
                    PetHousing freshCatHouse = catArea;
                    Cat catToAdd = new Cat(freshCatName, freshCatType, freshCatDescription, freshCatHouse);
                    allPetsList.addPet(catToAdd);
                    System.out.println(freshCatName + " has been added to the Shelter!");
                }
            }
            if (action == 9) {
                break;
            }
            allPetsList.allPetTick();
        }


    }
}