package genericsJava.woldCards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args []) {

        List<Building>buildings = new ArrayList<>();
        buildings.add(new Building());

        List<House>houses = new ArrayList<>();
        houses.add(new House());

        printLists(buildings);

        printLists(houses);
    }

    static void printLists(List <? extends Building> buildingsList) {
        for (int i = 0; i < buildingsList.size(); i++) {
            System.out.println(buildingsList.get(i));
        }
    }
}
