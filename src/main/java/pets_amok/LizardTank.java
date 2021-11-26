package pets_amok;

public class LizardTank extends PetHousing{


    public LizardTank(String housingName, String housingSize, int wasteContained, int dirtyLevel) {
        super(housingName, housingSize, wasteContained, dirtyLevel);
        this.dirtyLevel = 10;
        this.wasteContained = 5;
    }

}