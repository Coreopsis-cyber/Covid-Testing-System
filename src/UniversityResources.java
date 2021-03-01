import java.util.ArrayList;
/**
 *University Resources class containing the rooms and assistants in lists.
 */
public class UniversityResources {
    //initialising the array lists to store the rooms and assistants
    ArrayList<Room> rooms = new ArrayList<Room>();
    ArrayList<Assistant> assistants = new ArrayList<Assistant>();

    /**
     * Method to add assistants to the assistants array list.
     */
    public void addAssistant(Assistant assistant_) { assistants.add(assistant_); }

    /**
     * Method to add rooms to the rooms array list.
     */
    public void addRoom(Room room_) {
        rooms.add(room_);
    }

    /**
     * Getter method to return rooms.
     * @return A list of rooms.
     */
    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    /**
     * Getter method to return assistants.
     * @return A list of Assistants.
     */
    public ArrayList<Assistant> getAssistants() {
        return this.assistants;
    }

    /**
     * Getter method to return an assistant from assistants array list.
     * @return An assistant object from an array list.
     */
    public Assistant getAssistant(String name_) {
        Assistant assistant1 = null;
        //looping through the array list to find the assistant
        for (Assistant assistant : assistants) {
            //checking if the input name is the assistant name
            if (assistant.getName().equals(name_)) {
                assistant1 = assistant;
                break;
            }
        }
        return assistant1;
    }

    /**
     * Getter method to return a room from room array list.
     * @return A room object from an array list.
     */
    public Room getRoom(String code_) {
        Room room1 = null;
        //looping through the array list to find the room
        for (Room room_ : rooms) {
            //checking if the input is the code in the room object
            if (room_.getCode().equals(code_)) {
                room1 = room_;
                break;
            }
        }
        return room1;
    }
}