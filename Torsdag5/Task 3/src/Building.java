import java.util.ArrayList;

public class Building {
    private ArrayList<Room> room;
    private int bathRooms;
    private int floors;
    private boolean isOfficeBuilding;

    Building(ArrayList<Room> room, int bathRooms, int floors, boolean isOfficeBuilding){
        this.room = room;
        this.bathRooms = bathRooms;
        this.floors = floors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRoom() {
        return room;
    }

    public int getBathRooms() {
        return bathRooms;
    }

    public int getFloors() {
        return floors;
    }

    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }
}


