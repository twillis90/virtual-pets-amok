package pets_amok;


public abstract class PetHousing {

    protected final String housingName;
    protected final String housingSize;
    protected int wasteContained;
    protected int dirtyLevel;


    public PetHousing(String housingName, String housingSize, int wasteContained ,int dirtyLevel) {
        this.housingName = housingName;
        this.housingSize = housingSize;
        this.wasteContained = wasteContained;
        this.dirtyLevel = dirtyLevel;
    }

    public String getHousingName(){
        return housingName;
    }

    public int getWasteContained(){
        return wasteContained;
    }

    public void dirtyHousing(){
        if(wasteContained > 20){
            dirtyLevel += 10;
        }
    }

    public int getCleanLevel() {
        return this.dirtyLevel;

    }

    public void cleanHousing() {
        wasteContained -= 10;
        dirtyLevel = 0;
    }

    public void removeWaste(){
        wasteContained = 0;
        dirtyLevel -= 10;
    }

    public void dogKennelTick(){
        dirtyLevel += 10;
        wasteContained += 5;
    }

    public void botGarageTick(){
        wasteContained += 5;
        dirtyLevel += 5;
    }

    public void catAreaTick(){
        dirtyLevel += 10;
        wasteContained += 5;
    }

    public void stableTick(){
        dirtyLevel += 5;
        wasteContained += 5;
    }

    public void lizardTankTick(){
        dirtyLevel += 10;
        wasteContained += 5;
    }

    public void allShelterTick(){
        dogKennelTick();
        catAreaTick();
        stableTick();
        lizardTankTick();
        botGarageTick();
    }
}
