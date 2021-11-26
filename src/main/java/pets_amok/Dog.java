package pets_amok;

public class Dog extends OrganicPet {


    public Dog(String name, String type, String description, PetHousing petHouse,
               int hunger, int thirst, int health, int energy, int clean, int happy, int waste, boolean isAlive) {
        super(name, type, description, petHouse, hunger, thirst, health, energy, clean, happy, waste, isAlive);
        this.name = name;
        this.type = type;
        this.descrtiption = description;
        this.petHouse = petHouse;
        this.hunger = hunger;
        this.thirst = thirst;
        this.health = health;
        this.energy = energy;
        this.clean = clean;
        this.happy = happy;
        this.waste = waste;
        this.isAlive = isAlive;
    }


    public Dog(String name, String type, String description, PetHousing petHouse) {
        super(name, type, description, petHouse);
        this.name = name;
        this.type = type;
        this.descrtiption = description;
        this.petHouse = petHouse;
        this.hunger = 30;
        this.thirst = 20;
        this.health = 70;
        this.energy = 40;
        this.clean = 30;
        this.happy = 40;
        this.waste = 10;
        this.isAlive = true;
    }

    public String getDogName(){
        return petName();
    }

    public String getDogType(){
        return getPetType();
    }

    public String getDogDescription(){
        return getPetDescrtiption();
    }

    public String getDogHouse(){
        return getPetHouse();
    }

    public int getDogHunger(){
        return hunger;
    }

    public int getDogThirst(){
        return thirst;
    }

    public int getDogHealth(){
        return health;
    }

    public int getDogEnergy(){
        return energy;
    }

    public int getDogClean(){
        return clean;
    }

    public int getDogHappy(){
        return happy;
    }

    public int getDogWaste(){
        return waste;
    }

    public boolean getDogIsAlive(){
        return isAlive;
    }


    public void walkDog() {
        energy -= 5;
        hunger += 3;
        thirst += 2;
        waste = 0;
        happy += 10;
        health = 0;
    }

    public void playFetch(){
        energy -= 4;
        hunger += 5;
        thirst += 5;
        happy += 10;
    }


    public void checkCleanForKennel(){
        if(clean <= 15){
            petHouse.dirtyLevel += 10;
        }
    }

    public void checkWasteForKennel(){
        if(waste >= 30){
            petHouse.dirtyLevel += 5;
            petHouse.wasteContained += 10;
        }
    }

    public void cleanKennel(){
        petHouse.dirtyLevel = 0;
    }

    public void clearKennelWaste(){
        petHouse.wasteContained = 0;
        petHouse.dirtyLevel -= 5;
    }

    public void dogKennelLevels(){
        System.out.println("The Dog Kennel level of filth is: " + petHouse.dirtyLevel);
        System.out.println("The Dog Kennel level of waste is: " + petHouse.wasteContained);
    }

    public void listDog(){
        System.out.println(getDogName());
        System.out.println("\tEnergy Level is: " + getDogEnergy());
        System.out.println("\tHealth Level is: " + getDogHealth());
        System.out.println("\tHunger Level is: " + getDogHunger());
        System.out.println("\tThirst Level is: " + getDogThirst());
        System.out.println("\tClean Level is: " + getDogClean());
        System.out.println("\tWaste Level is: " + getDogWaste());
        System.out.println("\tHappiness Level is: " + getDogHappy());
    }


    public void dogTick(){
        if(isAlive) {
            healthUpdate();
            starvingPet();
            sickPet();
            happyUpdate();
            energy += 3;
            hunger += 5;
            thirst += 2;
            waste += 5;
            clean -= 3;
            checkCleanForKennel();
            checkWasteForKennel();
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