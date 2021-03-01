/**
 * Room class containing a room code and capacity.
*/
public class Room{
    private String code;
    private int capacity;

    /**
     *This constructor instantiates a Room.
     * @param code_ A String that represents code of a room.
     * @param capacity_ A integter that represents capacity of a room.
     */
    public Room(String code_, int capacity_){
        //chekcing the code is not null
        if (code_ != null){

            code = code_;
            //chekcing that the capacity if greater than 0
            if (capacity_ > 0){
                capacity = capacity_;
            } else {
                //returnign erros if the code and capacity isn't valid
                System.out.println("capacity must be greater than 0");
            }
        } else {
            System.out.println("room code cannot be null");
        }
    }

    /**
     *Getter method for code.
     * @return A String representing the code of a room.
     */
    public String getCode(){
        return this.code;
    }

    /**
     *Getter method for capacity.
     * @return A integer representing the capacity of a room.
     */
    public int getCapacity(){
        return this.capacity;
    }

    /**
     *Method to override the toString method and return the transcript.
     * @return A formatted string containing all the infomation in the class for each object.
     */
    @Override
    public String toString() {
        return " | " + this.code + " | capacity: " + this.capacity + " | ";
    }


}