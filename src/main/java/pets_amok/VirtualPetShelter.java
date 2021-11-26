package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

    HashMap<String, VirtualPet> allPetsList;

    public VirtualPetShelter() {
        this.allPetsList = new HashMap<>();
    }

    public void addPet(VirtualPet petToAdd) {
        allPetsList.put(petToAdd.petName(), petToAdd);
    }

    public VirtualPet findPet(String petName) {
        return allPetsList.get(petName);
    }

//    public String findDog(String petName){
//        for(VirtualPet dog: allPetsList.values()){
//            if(dog instanceof Dog){
//                return ((Dog) dog).petName();
//            }
//        }
//        return petName;
//    }

    public Collection<VirtualPet> getAllPets(String petName) {
        return allPetsList.values();
    }

    public Collection<VirtualPet> findDog(String dogName){
        for(VirtualPet dog: allPetsList.values()){
            if (dog instanceof Dog){
                ((Dog) dog).getDogName();
            }
        }
        return allPetsList.values();
    }

    public void removePet(VirtualPet petToRemove) {
        if (petToRemove instanceof Horse) {
            System.out.println("The.Horse.Stays");
        } else allPetsList.remove(petToRemove.petName(), petToRemove);
    }

    public Collection<VirtualPet> getOrganicPets() {
        Collection<VirtualPet> organicPets = new ArrayList<>();
        for (VirtualPet virtualPet : allPetsList.values()) {
            if (virtualPet instanceof OrganicPet) {
                organicPets.add(virtualPet);
            }
        }
        return organicPets;
    }

    public void listAllDogsAndValues() {
        for (VirtualPet dogs: allPetsList.values()) {
            if (dogs instanceof Dog) {
                ((Dog)dogs).listDog();
            }
        }
    }

    public void listAllCatsAndValues(){
        for(VirtualPet cats: allPetsList.values()){
            if(cats instanceof Cat){
                ((Cat)cats).listCat();
            }
        }
    }

    public void listHorseAndValues(){
        for(VirtualPet horse: allPetsList.values()){
            if(horse instanceof Horse){
                ((Horse)horse).listHorse();
            }
        }
    }

    public void listAllLizardsAndValues(){
        for(VirtualPet lizard: allPetsList.values()){
            if(lizard instanceof Lizard){
                ((Lizard)lizard).listLizard();
            }
        }
    }

    public void showPets(){
        for(VirtualPet pets: allPetsList.values()){
            System.out.println("Name\t\t| Type\t\t\t| Description\t\t\t| Housing");
            System.out.println(pets.petName() + " \t\t| " + pets.getPetType() + " \t\t|"
                    + pets.getPetDescrtiption() +  "\t| " + pets.getPetHouse());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void showDogs(){
        for(VirtualPet dogs: allPetsList.values()){
            if(dogs instanceof Dog) {
                System.out.println("Name\t| Type\t| Description\t| Housing");
                System.out.println(((Dog) dogs).getDogName() + " \t\t| " + ((Dog) dogs).getDogType() + " \t\t|"
                        + ((Dog) dogs).getDogDescription() + "\t\t| " + ((Dog) dogs).getDogHouse());
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    public void showCats(){
        for(VirtualPet cats: allPetsList.values()){
            if(cats instanceof Cat) {
                System.out.println("Name\t\t| Type\t\t| Description\t| Housing");
                System.out.println(((Cat) cats).getCatName() + " \t\t| " + ((Cat) cats).getCatType() + " \t\t|"
                        + ((Cat) cats).getCatDescription() + "\t\t| " + ((Cat) cats).getCatHouse());
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    public void showHorse(){
        for(VirtualPet pet: allPetsList.values()){
            if(pet instanceof Horse) {
                System.out.println("Name\t| Type\t| Housed\t| Description");
                System.out.println(((Horse) pet).getHorseName() + " \t\t| " + ((Horse) pet).getHorseType() + " \t\t|"
                        + ((Horse) pet).getHorseDescription() + "\t\t| " + ((Horse) pet).getHorseHouse());
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    public void showLizards(){
        for(VirtualPet pets: allPetsList.values()){
            if(pets instanceof Lizard) {
                System.out.println("Name\t| Type\t| Housed\t| Description");
                System.out.println(((Lizard) pets).getLizardName() + " \t\t| " + ((Lizard) pets).getLizardType() + " \t\t|"
                        + ((Lizard) pets).getLizardDescription() + "\t\t| " + ((Lizard) pets).getLizardHouse());
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    public void showBotPets(){
        for(VirtualPet bots: allPetsList.values()){
            if(bots instanceof RoboticPet) {
                System.out.println("Name\t| Type\t| Housed\t| Description");
                System.out.println(((RoboticPet) bots).getBotName() + " \t\t| " + ((RoboticPet) bots).getBotType() + " \t\t|"
                        + ((RoboticPet) bots).getBotDescription() + "\t\t| " + ((RoboticPet) bots).getBotHouse());
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    public void aliveCheckMethod() {
        for (VirtualPet pet: allPetsList.values()) {
            if(pet instanceof OrganicPet) {
                ((OrganicPet) pet).aliveCheck();
            }
        }
    }

    public boolean isAliveCheck(VirtualPet pet) {
        for (VirtualPet pets : allPetsList.values()) {
            if (pets instanceof OrganicPet) {
                ((OrganicPet) pets).aliveCheck();
            }
        }
        return ((OrganicPet) pet).petAlive();
    }


    public void feedAllOrganics(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof OrganicPet){
                ((OrganicPet) virtualPet).feedPet();
            }
        }
    }

    public void feedAllDogs(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Dog){
                ((Dog) virtualPet).feedPet();
            }
        }
    }

    public void feedAllCats(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Cat){
                ((Cat) virtualPet).feedPet();
            }
        }
    }

    public void feedAllLizards(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Lizard){
                ((Lizard) virtualPet).feedPet();
            }
        }
    }

    public void feedAllHorse(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Horse){
                ((Horse) virtualPet).feedPet();
            }
        }
    }

    public void waterAllOrganics(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof OrganicPet){
                ((OrganicPet) virtualPet).waterPet();
            }
        }
    }

    public void waterAllDogs(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Dog){
                ((Dog) virtualPet).waterPet();
            }
        }
    }

    public void waterAllCats(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Cat){
                ((Cat) virtualPet).waterPet();
            }
        }
    }

    public void waterAllLizard(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Lizard){
                ((Lizard) virtualPet).waterPet();
            }
        }
    }

    public void waterAllHorse(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Horse){
                ((Horse) virtualPet).waterPet();
            }
        }
    }

    public void washAllOrganics(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof OrganicPet){
                ((OrganicPet) virtualPet).washPet();
            }
        }
    }

    public void washAllDogs(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Dog){
                ((Dog) virtualPet).washPet();
            }
        }
    }

    public void washAllCats(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Cat){
                ((Cat) virtualPet).washPet();
            }
        }
    }

    public void washAllLizard(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Lizard){
                ((Lizard) virtualPet).washPet();
            }
        }
    }

    public void washAllHorse(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Horse){
                ((Horse) virtualPet).washPet();
            }
        }
    }

    public void walkAllDogs(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Dog){
                ((Dog) virtualPet).walkDog();
            }
        }
    }

    public void allHorseGallop(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Horse){
                ((Horse) virtualPet).horseGallop();
            }
        }
    }

    public void horseGraze(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Horse){
                ((Horse) virtualPet).horseGraze();
            }
        }
    }

    public void allCatsNap(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Cat){
                ((Cat) virtualPet).catNap();
            }
        }
    }

    public void allLizardStuff(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Lizard){
                ((Lizard) virtualPet).lizardStuff();
            }
        }
    }

    public void allLizardSun(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof Lizard){
                ((Lizard) virtualPet).lizardSun();
            }
        }
    }

    public void chargeAllBots(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof RoboticPet){
                ((RoboticPet) virtualPet).chargeBattery();
            }
        }
    }

    public void oilAllBots(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof RoboticPet){
                ((RoboticPet) virtualPet).oilPet();
            }
        }
    }

    public void maintainAllBots(){
        for(VirtualPet virtualPet: allPetsList.values()){
            if(virtualPet instanceof RoboticPet){
                ((RoboticPet) virtualPet).preformMaintenance();
            }
        }
    }

    public void listOrganicPets(){
        for(VirtualPet virtualPet : allPetsList.values()){
            if(virtualPet instanceof OrganicPet){
                ((OrganicPet) virtualPet).getPetLevels();
            }
        }
    }

    public void listRoboticPets(){
        for(VirtualPet virtualPet : allPetsList.values()){
            if(virtualPet instanceof RoboticPet){
                ((RoboticPet) virtualPet).getBotLevels();
            }
        }
    }

    public void cleanCatArea(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Cat){
                ((Cat) petHouse).cleanCatArea();
            }
        }
    }

    public void changeCatLitter(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Cat){
                ((Cat) petHouse).changeLitter();
            }
        }
    }

    public void getCatAreaLevels(){
        for (VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Cat){
                ((Cat) petHouse).catAreaLevels();
            }
        }
    }

    public void cleanDogKennel(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Dog){
                ((Dog) petHouse).cleanKennel();
            }
        }
    }

    public void clearKennelWaste(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Dog){
                ((Dog) petHouse).clearKennelWaste();
            }
        }
    }

    public void getDogKennelLevels(){
        for (VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Dog){
                ((Dog) petHouse).dogKennelLevels();
            }
        }
    }

    public void cleanHorseStable(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Horse){
                ((Horse) petHouse).cleanStable();
            }
        }
    }

    public void clearStableWaste(){
        for (VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Horse){
                ((Horse) petHouse).clearWaste();
            }
        }
    }

    public void getStableLevels(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Horse){
                ((Horse) petHouse).stableLevels();
            }
        }
    }

    public void cleanLizardTank(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Lizard){
                ((Lizard) petHouse).cleanTank();
            }
        }
    }

    public void clearLizardWaste(){
        for (VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof Lizard){
                ((Lizard) petHouse).clearWaste();
            }
        }
    }

    public void getTankLevels(){
        for (VirtualPet petHouse: allPetsList.values()){
            if (petHouse instanceof Lizard){
                ((Lizard) petHouse).lizardTankLevels();
            }
        }
    }

    public void cleanGarage(){
        for(VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof RoboticPet){
                ((RoboticPet) petHouse).cleanBotGarage();
            }
        }
    }

    public void clearGarageWaste(){
        for (VirtualPet petHouse: allPetsList.values()){
            if(petHouse instanceof RoboticPet){
                ((RoboticPet) petHouse).clearBotWaste();
            }
        }
    }

    public void getGarageLevels(){
        for (VirtualPet petHouse: allPetsList.values()){
            if (petHouse instanceof RoboticPet){
                ((RoboticPet) petHouse).botGarageLevels();
            }
        }
    }

    public void allPetTick() {
        for (VirtualPet virtualPet : allPetsList.values()) {
            if (virtualPet instanceof Dog) {
                ((Dog) virtualPet).dogTick();
            }
            if (virtualPet instanceof Cat) {
                ((Cat) virtualPet).catTick();
            }
            if(virtualPet instanceof Lizard){
                ((Lizard) virtualPet).lizardTick();
            }
            if(virtualPet instanceof Horse){
                ((Horse) virtualPet).horseTick();
            }
            if(virtualPet instanceof RoboticPet){
                ((RoboticPet) virtualPet).roboticPetTick();
            }
        }
    }
}