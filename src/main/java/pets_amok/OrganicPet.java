package pets_amok;

public abstract class OrganicPet extends VirtualPet {
    protected int hunger;
    protected int thirst;
    protected int health;
    protected int energy;
    protected int clean;
    protected int happy;
    protected int waste;
    protected boolean isAlive;

    public void aliveCheck() {
        if (health <= 0) {
            isAlive = false;
        }
    }

    //------------METHODS DONT AFFECT HEALTH. LOWER PRIORITY BUT MUST FIX

    public OrganicPet(String name, String type, String description, PetHousing petHouse) {
        super(name, type, description, petHouse);
    }

    public OrganicPet(String name, String type, String description, PetHousing petHouse,
                      int hunger, int thirst, int health, int energy, int clean, int happy, int waste, boolean isAlive) {
        super(name, type, description, petHouse);
        this.hunger = hunger;
        this.thirst = thirst;
        this.health = health;
        this.energy = energy;
        this.clean = clean;
        this.happy = happy;
        this.waste = waste;
        this.isAlive = isAlive;

    }


    public int getPetHunger() {
        return hunger;
    }

    public int getPetThirst() {
        return thirst;
    }

    public int getPetHealth() {
        return health;
    }

    public int getPetHappy() {
        return happy;
    }

    public int getPetEnergy() {
        return energy;
    }

    public int getPetCleanliness() {
        return clean;
    }

    public int getPetWaste() {
        return waste;
    }

    public boolean petAlive(){
        return isAlive;
    }

    public void feedPet() {
        hunger -= 5;
        thirst += 2;
        energy += 2;
        health += 5;
        waste += 10;
    }

    public void waterPet() {
        thirst -= 5;
        waste += 5;
    }

    public void washPet() {
        clean += 5;
        waste -= 3;
        energy += 5;
    }

    public void starvingPet() {
        if (hunger >= 100) {
            health = 0;
        }
    }

    public void sickPet() {
        if (clean <= 15) {
            health -= 5;
            happy -= 10;
        }
        if (waste >= 25) {
            health -= 10;
            happy -= 10;
        }
        if (petHouse.wasteContained > 50) {
            health -= 10;
            happy -= 10;
        }
        if (petHouse.dirtyLevel > 50) {
            health -= 10;
            happy -= 10;
        }
    }

    public void happyUpdate() {
        if (hunger >= 70) {
            happy -= 5;
        }
        if (clean <= 20) {
            happy -= 5;
        }
        if (thirst >= 70) {
            happy -= 5;
        }
        if (energy <= 25) {
            happy -= 10;
        }
        if (health <= 30) {
            happy -= 20;
        }
    }

    public void healthUpdate() {
        if (hunger >= 80) {
            health -= 5;
        }
        if (waste >= 50) {
            health -= 10;
            clean -= 15;
        }
        if (clean <= 10) {
            health -= 5;
        }
        if (thirst >= 80) {
            health -= 5;
        }
        if (energy <= 15) {
            health -= 10;
        }
    }

    public void getPetLevels() {
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

