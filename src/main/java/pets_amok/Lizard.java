package pets_amok;


public class Lizard extends OrganicPet{

    public Lizard(String name, String type, String description, PetHousing petHouse,
                  int hunger, int thirst, int health, int energy, int clean, int happy, int waste, boolean isAlive) {
        super(name, type, description, petHouse, hunger, thirst, health, energy, clean, happy, waste, isAlive);
    }

    public String getLizardName(){
        return petName();
    }

    public String getLizardType(){
        return getPetType();
    }

    public String getLizardDescription(){
        return getPetDescrtiption();
    }

    public String getLizardHouse(){
        return getPetHouse();
    }

    public int getLizardHunger(){
        return hunger;
    }

    public int getLizardThirst(){
        return thirst;
    }

    public int getLizardHealth(){
        return health;
    }

    public int getLizardEnergy(){
        return energy;
    }

    public int getLizardClean(){
        return clean;
    }

    public int getLizardHappy(){
        return happy;
    }

    public int getLizardWaste(){
        return waste;
    }

    public boolean getLizardIsAlive(){
        return isAlive;
    }

    public void listLizard(){
        System.out.println(getLizardName());
        System.out.println("\tEnergy Level is: " + getLizardEnergy());
        System.out.println("\tHealth Level is: " + getLizardHealth());
        System.out.println("\tHunger Level is: " + getLizardHunger());
        System.out.println("\tThirst Level is: " + getLizardThirst());
        System.out.println("\tClean Level is: " + getLizardClean());
        System.out.println("\tWaste Level is: " + getLizardWaste());
        System.out.println("\tHappiness Level is: " + getLizardHappy());
    }

    public void lizardStuff(){
        energy -= 2;
        thirst += 2;
        clean += 2;
        waste += 2;
        hunger += 2;
        happy += 5;
    }

    public void lizardSun(){
        energy += 5;
        thirst += 3;
        hunger += 2;
        happy += 5;
    }

    public void checkCleanForTank(){
        if(clean <= 15){
            petHouse.dirtyLevel += 10;
        }
    }

    public void checkWasteForTank(){
        if(waste >= 30){
            petHouse.dirtyLevel += 5;
            petHouse.wasteContained += 10;
        }
    }

    public void cleanTank(){
        petHouse.dirtyLevel = 0;
    }

    public void clearWaste(){
        petHouse.wasteContained = 0;
    }

    public void lizardTankLevels(){
        System.out.println("The Lizard Tank level of filth is: " + petHouse.dirtyLevel);
        System.out.println("The Lizard Tank level of waste is: " + petHouse.wasteContained);
    }


    public void lizardTick() {
        if (isAlive) {
            healthUpdate();
            starvingPet();
            sickPet();
            happyUpdate();
            hunger += 4;
            energy -= 2;
            waste += 2;
            clean -= 2;
            checkCleanForTank();
            checkWasteForTank();
            aliveCheck();
        }
        System.out.println(petName());
        System.out.println("\tEnergy Level is: " + getPetEnergy());
        System.out.println("\tHealth Level is: " + getPetHealth());
        System.out.println("\tHunger Level is: " + getPetHunger());
        System.out.println("\tThirst Level is: " + getPetThirst());
        System.out.println("\tClean Level is: " + getPetCleanliness());
        System.out.println("\tWaste Level is: " + getPetWaste());
        System.out.println("\tHappiness Level is: " + getPetHappy());
    }
}