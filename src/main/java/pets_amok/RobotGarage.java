package pets_amok;

public class RobotGarage extends PetHousing{

    public RobotGarage(String housingName, String housingSize, int wasteContained, int dirtyLevel) {
        super(housingName, housingSize, wasteContained, dirtyLevel);
        this.dirtyLevel = 15;
        this.wasteContained = 15;
    }
}