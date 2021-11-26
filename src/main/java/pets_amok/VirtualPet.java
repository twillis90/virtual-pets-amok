package pets_amok;

public abstract class VirtualPet {
    protected String name;
    protected String type;
    protected String descrtiption;
    protected PetHousing petHouse;


    public VirtualPet(String name, String type, String descrtiption, PetHousing petHouse) {
        this.name = name;
        this.type = type;
        this.descrtiption = descrtiption;
        this.petHouse = petHouse;
    }

    public String petName() {
        return name;
    }

    public String getPetType(){
        return type;
    }

    public String getPetDescrtiption(){
        return descrtiption;
    }

    public String getPetHouse(){
        return petHouse.housingName;
    }

}