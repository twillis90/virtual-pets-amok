package pets_amok;

public class Cat extends OrganicPet{



    public Cat(String name, String type, String description, CatArea petHouse,
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

    public Cat(String name, String type, String description, PetHousing petHouse) {
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

    public String getCatName(){
        return petName();
    }

    public String getCatType(){
        return getPetType();
    }

    public String getCatDescription(){
        return getPetDescrtiption();
    }

    public String getCatHouse(){
        return getPetHouse();
    }

    public int getCatHunger(){
        return hunger;
    }

    public int getCatThirst(){
        return thirst;
    }

    public int getCatHealth(){
        return health;
    }

    public int getCatEnergy(){
        return energy;
    }

    public int getCatClean(){
        return clean;
    }

    public int getCatHappy(){
        return happy;
    }

    public int getCatWaste(){
        return waste;
    }

    public boolean getCatIsAlive(){
        return isAlive;
    }

    public void listCat(){
        System.out.println(getCatName());
        System.out.println("\tEnergy Level is: " + getCatEnergy());
        System.out.println("\tHealth Level is: " + getCatHealth());
        System.out.println("\tHunger Level is: " + getCatHunger());
        System.out.println("\tThirst Level is: " + getCatThirst());
        System.out.println("\tClean Level is: " + getCatClean());
        System.out.println("\tWaste Level is: " + getCatWaste());
        System.out.println("\tHappiness Level is: " + getCatHappy());
    }

    public void checkCleanForHouse(){
        if(clean < 15){
            petHouse.dirtyLevel += 10;
        }
    }


    public void checkWasteForHouse(){
        if(waste > 30){
            petHouse.wasteContained += 15;
            petHouse.dirtyLevel += 5;
        }
    }

    public void cleanCatArea(){
        petHouse.dirtyLevel = 0;
    }

    public void changeLitter(){
        petHouse.wasteContained = 0;
        petHouse.dirtyLevel -= 10;
    }

    public void litterCheck(){
        petHouse.wasteContained += 10;
    }

    public void catAreaLevels(){
        System.out.println("The cat Areas level of Filth is: " + petHouse.dirtyLevel);
        System.out.println("The Cat Area level of Litter use is: " + petHouse.wasteContained);

    }

    public void catNap(){
        energy += 10;
        hunger += 5;
        thirst += 3;
        happy += 5;
    }

    public void catTick() {
        if (isAlive) {
            healthUpdate();
            starvingPet();
            sickPet();
            happyUpdate();
            hunger += 10;
            thirst += 5;
            energy -= 5;
            clean -= 2;
            waste += 2;
            litterCheck();
            checkCleanForHouse();
            checkWasteForHouse();
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