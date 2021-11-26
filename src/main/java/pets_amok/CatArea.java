package pets_amok;

public class CatArea extends PetHousing{

    public CatArea(String housingName, String housingSize, int wasteContained, int dirtyLevel) {
        super(housingName, housingSize, wasteContained, dirtyLevel);
        this.wasteContained = 15;
        this.dirtyLevel = 25;
    }

    public String getHousingName(){
        return housingName;
    }


    public void changeLitter(){
        wasteContained = 0;
        dirtyLevel -= 10;
    }

    public void cleanArea() {
        dirtyLevel = 0;
    }

}