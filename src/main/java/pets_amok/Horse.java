package pets_amok;

public class Horse extends OrganicPet{

    public Horse(String name, String type, String description, PetHousing petHouse,
                 int hunger, int thirst, int health, int energy, int clean, int happy, int waste, boolean isAlive) {
        super(name, type, description, petHouse , hunger , thirst , health, energy, clean, happy, waste, isAlive);
    }

    public String getHorseName(){
        return petName();
    }

    public String getHorseType(){
        return getPetType();
    }

    public String getHorseDescription(){
        return getPetType();
    }

    public String getHorseHouse(){
        return getPetHouse();
    }

    public int getHorseHunger(){
        return hunger;
    }

    public int getHorseThirst(){
        return thirst;
    }

    public int getHorseHealth(){
        return health;
    }

    public int getHorseEnergy(){
        return energy;
    }

    public int getHorseClean(){
        return clean;
    }

    public int getHorseHappy(){
        return happy;
    }

    public int getHorseWaste(){
        return waste;
    }

    public boolean getHorseIsAlive(){
        return isAlive;
    }

    public void listHorse(){
        System.out.println(getHorseName());
        System.out.println("\tEnergy Level is: " + getHorseEnergy());
        System.out.println("\tHealth Level is: " + getHorseHealth());
        System.out.println("\tHunger Level is: " + getHorseHunger());
        System.out.println("\tThirst Level is: " + getHorseThirst());
        System.out.println("\tClean Level is: " + getHorseClean());
        System.out.println("\tWaste Level is: " + getHorseWaste());
        System.out.println("\tHappiness Level is: " + getHorseHappy());
    }

    public void horseGraze(){
        energy += 5;
        hunger -= 2;
        thirst -= 2;
        health += 1;
        clean -= 5;
        waste += 5;
        happy += 5;
    }

    public void horseGallop(){
        energy -= 15;
        hunger += 5;
        thirst += 3;
        clean -= 10;
        waste -= 10;
        happy += 10;
    }

    public void checkCleanForStable(){
        if(clean <= 20){
            petHouse.dirtyLevel += 15;
        }
    }


    public void checkWasteForStable(){
        if(waste >= 40){
            petHouse.dirtyLevel += 5;
            petHouse.wasteContained += 10;
        }
    }

    public void cleanStable(){
        petHouse.dirtyLevel = 0;
    }

    public void clearWaste(){
        petHouse.wasteContained = 0;
    }

    public void stableLevels(){
        System.out.println("The Stable level of filth is: " + petHouse.dirtyLevel);
        System.out.println("The Stable level of waste is: " + petHouse.wasteContained);
    }

    public void horseTick(){
        if(isAlive){
            starvingPet();
            healthUpdate();
            sickPet();
            happyUpdate();
            hunger += 5;
            thirst += 5;
            clean -= 5;
            waste += 5;
            energy += 5;
            checkCleanForStable();
            checkWasteForStable();
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