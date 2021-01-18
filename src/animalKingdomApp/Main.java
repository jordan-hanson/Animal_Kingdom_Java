package animalKingdomApp;

import java.util.*;

public class Main {

    public static void main(String[] args){
//        System.out.println("It is Working!");
//        Mammals myMammal = new Mammals("Zebra", 1904, "walk", "live births", "Lungs");
//        System.out.println(myMammal);
        List<Mammals> mammalsList = new ArrayList<Mammals>();
        mammalsList.add(new Mammals("Panda", 1869, "crawl", "live births", "lungs"));
        mammalsList.add(new Mammals("Zebra", 1778, "walk", "live births", "lungs"));
        mammalsList.add(new Mammals("Koala", 1816, "crawl", "live births", "lungs"));
        mammalsList.add(new Mammals("Sloth", 1804, "crawl", "live births", "lungs"));
        mammalsList.add(new Mammals("Armadillo", 1758, "crawl", "live births", "lungs"));
        mammalsList.add(new Mammals("Raccoon", 1758, "walk", "live births", "lungs"));
        mammalsList.add(new Mammals("BigFoot", 2021, "walk", "live births", "lungs"));
        System.out.println(mammalsList.size());
        System.out.println(mammalsList);

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

        printFilteredAnimals(mammalsList, (m) -> m.getDiscoveredYear() > 1800);

    }

    public static void printFilteredAnimals(List<Mammals> mammalsList, MammalTester mammalTester){
        for (Mammals m : mammalsList){
            if(mammalTester.test(m)){
                System.out.println(m);
            }
        }
    }
}