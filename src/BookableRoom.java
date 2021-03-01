/**
 * BookableRoom class containing a room, date, time, status and occupancy.
 */
public class BookableRoom{
    private Room room;
    private String date;
    private String time;
    private String status;
    private int occupancy;

    /**
     * This constructor instantiates a bookable room.
     * @param room A room object representing the room.
     * @param date A string representing the date the bookable room is available.
     * @param time A string representing the time the bookable room is available.
     */
    public BookableRoom(Room room_, String date_, String time_){
        //allocating the room code and cpacity to the bookable room object from the room object
        this.room = room_;
        this.occupancy = 0;
        //allocating the date and time and status to the bookable room
        this.date = date_;
        this.time = time_;
        this.status = "EMPTY";
    }

    /**
     *Getter method to return a room.
     * @return A room from the room class containing a code and an occupancy.
     */
    public Room getRoom(){
        return this.room;
    }

    /**
     *Getter method to return the code from a room.
     * @return A string, code from the room object.
     */
    public String getRoomCode(){
        return this.room.getCode();
    }

    /**
     *Getter method to return the date.
     * @return A string representing the date the bookable room is available.
     */
    public String getDate(){
        return this.date;
    }

    /**
     *Getter method to return the time.
     * @return A string representing the time the bookable room is available.
     */
    public String getTime(){
        return this.time;
    }

    /**
     *Getter method to return the status.
     * @return A string representing the status of a bookable room.
     */
    public String getStatus(){
        return this.status;
    }

    /**
     *Method to add an occupant to the room if the status is available and to change the status
     * if it reaches maximum capacity.
     */
    public void addOccupant(){
        if (this.occupancy == 0){
            this.status = "AVAILABLE";
        }
        this.occupancy = this.occupancy + 1;
        if (this.occupancy == this.room.getCapacity()){
            this.status = "FULL";
        }
    }

    /**
     *Method to remove an occupant from the room if the status is empty.
     */
    public void removeOccupant(){
        this.occupancy = this.occupancy - 1;
        if (this.occupancy == 0){
            this.status = "EMPTY";
        } else  {
            this.status = "AVAILABLE";
        }
    }


    /**
     *Method to override the toString method and return the transcript.
     * @return A formatted string containing all the infomation relevant to the bookable room class.
     */
    @Override
    public String toString() {
        return " | " + this.date + " " + this.time + " | " + this.status + " | " + this.room.getCode() + " | occupancy: " + this.occupancy + " | ";
    }


}