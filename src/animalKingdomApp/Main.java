package animalKingdomApp;

import java.util.*;

public class Main {

    public static void main(String[] args){
//        System.out.println("It is Working!");
//        Mammals myMammal = new Mammals("Zebra", 1904, "walk", "live births", "Lungs");
//        System.out.println(myMammal);

//        List<Mammals> mammalsList = new ArrayList<Mammals>();
//        mammalsList.add(new Mammals("Panda", 1869, "crawl", "live births", "lungs"));
//        mammalsList.add(new Mammals("Zebra", 1778, "walk", "live births", "lungs"));
//        mammalsList.add(new Mammals("Koala", 1816, "crawl", "live births", "lungs"));
//        mammalsList.add(new Mammals("Sloth", 1804, "crawl", "live births", "lungs"));
//        mammalsList.add(new Mammals("Armadillo", 1758, "crawl", "live births", "lungs"));
//        mammalsList.add(new Mammals("Raccoon", 1758, "walk", "live births", "lungs"));
//        mammalsList.add(new Mammals("BigFoot", 2021, "walk", "live births", "lungs"));
//        System.out.println(mammalsList.size());
//        System.out.println(mammalsList);

        List<Animals> animalsList = new ArrayList<Animals>();

        animalsList.add(new Mammals("Panda", 1869, "crawl", "live births", "lungs"));
        animalsList.add(new Birds("Pigeon", 1837, "fly", "eggs", "lungs"));
        animalsList.add(new Fish("Salmon", 1758, "swim", "eggs", "gills"));

        animalsList.add(new Mammals("Zebra", 1778, "walk", "live births", "lungs"));
        animalsList.add(new Mammals("Koala", 1816, "crawl", "live births", "lungs"));
        animalsList.add(new Mammals("Sloth", 1804, "crawl", "live births", "lungs"));
        animalsList.add(new Mammals("Armadillo", 1758, "crawl", "live births", "lungs"));
        animalsList.add(new Mammals("Raccoon", 1758, "walk", "live births", "lungs"));

        animalsList.add(new Birds("Peacock", 1821, "fly", "eggs", "lungs"));
        animalsList.add(new Birds("Toucan", 1758, "fly", "eggs", "lungs"));
        animalsList.add(new Birds("Parrot", 1824, "fly", "eggs", "lungs"));
        animalsList.add(new Birds("Swan", 1758, "fly", "eggs", "lungs"));

        animalsList.add(new Fish("Catfish", 1817, "swim", "eggs", "gills"));
        animalsList.add(new Fish("Perch", 1758, "swim", "eggs", "gills"));



        System.out.println(animalsList.size());
        System.out.println("\n");

//        for(int i = 0; i < mammalsList.size(); i++){
////            mammalsList.get(i).getBreath();
//            System.out.println(mammalsList.get(i).getBreath());
//        };
//
//        for (Mammals index : mammalsList){
//            System.out.println(index.getName());
//            System.out.println(index.getMove());
//        }

//        mammalsList.forEach( (Mammals m) -> {System.out.println(m.getName());} );
//
//        mammalsList.sort( (m1, m2) -> (m1.getDiscoveredYear() < m2.getDiscoveredYear()) ? -1 : 1 );
//
//        mammalsList.forEach( (Mammals m) -> {System.out.println(m.getDiscoveredYear());} );

//        printFilteredAnimals(mammalsList, (m) -> m.getDiscoveredYear() > 1800);

//        printFilteredAnimals(animalsList, (a) -> a.getType() == "Mammal");
//        System.out.println("\n");
//
//        printFilteredAnimals(animalsList, (a) -> a.getType() == "Birds");
//        System.out.println("\n");
//
//        printFilteredAnimals(animalsList, (a) -> a.getType() == "Fish");
//        System.out.println("\n");

        System.out.println("MVP Requirements");

        animalsList.sort( (a1, a2) -> (a1.getDiscoveredYear() < a2.getDiscoveredYear()) ? -1 : 1);

//        animalsList.forEach( (Animals a) -> {System.out.println(a.getDiscoveredYear());} );
        System.out.println("\n");


        printFilteredAnimals(animalsList, (a) -> a.getType() == "Mammal");
        System.out.println("\n");

        printFilteredAnimals(animalsList, (a) -> a.getType() == "Birds");
        System.out.println("\n");

        printFilteredAnimals(animalsList, (a) -> a.getType() == "Fish");
        System.out.println("\n");

    }

    public static void printFilteredAnimals(List<Animals> animalsList, AnimalsTester animalsTester){
        for (Animals a : animalsList){
            if(animalsTester.test(a)){
                System.out.println(a);
            }
        }
    }
}