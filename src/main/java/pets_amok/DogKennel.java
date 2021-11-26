package pets_amok;

public class DogKennel extends PetHousing{


    public DogKennel(String housingName, String housingSize, int wasteContained, int dirtyLevel) {
        super(housingName, housingSize, wasteContained, dirtyLevel);
        this.dirtyLevel = 20;
        this.wasteContained = 15;
    }

}
