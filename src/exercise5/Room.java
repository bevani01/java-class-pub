package exercise5;

/**
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author bevani01
 */
public class Room {
    private String building;
    private int number;

public Room(String building, int number) {
   this.building = building;
   this.number = number;
}
public String getBuilding() {
    return building;
}
public String getNumber() {
    return String.format("%s %s", building, number);
}
}