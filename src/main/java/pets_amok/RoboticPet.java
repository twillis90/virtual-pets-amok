package pets_amok;

public class RoboticPet extends VirtualPet {

    protected int oilLevel;
    protected int durability;
    protected int wasteProduced;
    protected int batteryLevel;
    protected boolean isAlive;

    public RoboticPet(String name, String type, String description, PetHousing petHouse,
                      int oilLevel, int durability, int wasteProduced, int batteryLevel, boolean isAlive) {
        super(name, type, description, petHouse);
        this.oilLevel = oilLevel;
        this.durability = durability;
        this.wasteProduced = wasteProduced;
        this.batteryLevel = batteryLevel;
        this.isAlive = isAlive;
    }

    public String getBotName(){
        return petName();
    }

    public String getBotType(){
        return getPetType();
    }

    public String getBotDescription(){
        return getPetDescrtiption();
    }

    public String getBotHouse(){
        return getPetHouse();
    }


    public boolean checkInService() {
        return isAlive;
    }

    public int checkWaste(){
        return wasteProduced;
    }

    public int checkDurability() {
        return this.durability;
    }

    public int getOilLevel() {
        return this.oilLevel;
    }

    public void inServiceCheck(){
        if(durability == 0 && oilLevel == 0){
            isAlive = false;
        }
    }

    public void oilPet() {
        oilLevel += 5;
        durability -= 2;
    }

    public void brokenBotPet(){
        if(durability == 0){
            batteryLevel = 0;
        }
    }

    public void preformMaintenance() {
        durability += 20;
        oilLevel -= 10;
    }

    public int checkBattery() {
        return batteryLevel;
    }

    public void chargeBattery() {
        batteryLevel += 20;
    }

    public void updateDurability(){
        if(oilLevel <= 20){
            durability -= 10;
        }
        if(batteryLevel <= 20){
            durability -=5;
        }
        if(wasteProduced >= 60){
            durability -= 10;
        }
    }

    public void repairBot(){
        durability = 100;
        oilLevel = 100;
        batteryLevel =100;
        wasteProduced = 0;
    }

    public void playWithBot(){
        oilLevel -= 20;
        batteryLevel -= 15;
    }

    public void cleanBotGarage(){
        petHouse.dirtyLevel = 0;
    }

    public void clearBotWaste(){
        petHouse.wasteContained = 0;
    }

    public void botGarageLevels(){
        System.out.println("The Garage level of filth is: " + petHouse.dirtyLevel);
        System.out.println("The Garage level of waste is: " + petHouse.wasteContained);
    }


    public void updateBattery(){
        if(oilLevel <= 20){
            batteryLevel -= 10;
        }
        if(durability <= 20){
            batteryLevel -= 10;
        }
    }

    public void housingCheckUp(){
        if(petHouse.dirtyLevel > 50){
            durability -= 10;
        }
        if(petHouse.wasteContained>50){
            durability -= 10;
        }
    }

    public void checkWasteForGarage() {
        if (wasteProduced >= 50) {
            petHouse.wasteContained += 10;
            petHouse.dirtyLevel += 10;
        }
    }

    public void getBotLevels(){
        System.out.println(petName());
        System.out.println("\tBattery Level is: " + checkBattery());
        System.out.println("\tDurability Level is: " + checkDurability());
        System.out.println("\tOil Level is: " + getOilLevel());
        System.out.println("\tWaste Output Level is: " + checkWaste());
    }


    public void roboticPetTick() {
        if (isAlive) {
            housingCheckUp();
            brokenBotPet();
            updateDurability();
            updateBattery();
            inServiceCheck();
            batteryLevel -= 10;
            oilLevel -= 20;
            durability -= 5;
            wasteProduced += 5;
            checkWasteForGarage();
        }
        System.out.println(petName());
        System.out.println("\tBattery Level is: " + checkBattery());
        System.out.println("\tDurability Level is: " + checkDurability());
        System.out.println("\tOil Level is: " + getOilLevel());
        System.out.println("\tWaste Output Level is: " + checkWaste());
    }

}