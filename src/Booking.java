/**
 *Booking class containing assistant on shift, bookable rooms, date, time and status.
 */
import java.time.format.DateTimeFormatter;

public class Booking{
    private AssistantShift assistantShift;
    private BookableRoom bookableRoom;
    private String date;
    private String time;
    private String studentEmail;
    private String status;

    /**
     *This constructor instantiates a Booking.
     * @param assistantshift_ A object containing an assistant, date,time and status.
     * @param bookableroom_ A object containing a room, date, time, status and occupancy.
     * @param email_ A String representing a university students email.
     */
    public Booking(AssistantShift assistantshift_, BookableRoom bookableroom_, String email_){
        //allocating the assistant and bookable room objects to the assistant and bookable room attributes
        this.assistantShift = assistantshift_;
        assistantshift_.makeBusy();
        this.bookableRoom = bookableroom_;
        bookableroom_.addOccupant();
        //allocating the date and time and status to the assistant on shift object
        this.date = bookableroom_.getDate();
        this.time = bookableroom_.getTime();
        studentEmail = email_;
        this.status = "SCHEDULED";
    }

    /**
     *Method to free the assistant shift and remove one from the occupancy.
     */
    public void removeBooking(){
        this.assistantShift.makeFree();
        this.bookableRoom.removeOccupant();
    }

    /**
     *Getter method to return the date of a booking.
     * @return A String representing a date.
     */
    public String getDate(){
        return this.date;
    }

    /**
     *Getter method to return the time of a booking.
     * @return A string representing a time.
     */
    public String getTime(){
        return this.time;
    }

    /**
     *Getter method to return a students email.
     * @return A string representing an email.
     */
    public String getStudentEmail(){
        return this.studentEmail;
    }

    /**
     * Getter method to return a status of a booking.
     * @return A string representing a status.
     */
    public String getStatus(){
        return this.status;
    }

    /**
     *Method to conclude a booking.
     */
    public void conclude(){
        this.status = "COMPLETED";
    }

    /**
     Method to override the toString method and return the transcript.
     * @return A formatted string containing all the infomation relevant to the booking class.
     */
    @Override
    public String toString() {
        return " | " + this.date + " " + this.time + " | " + this.status + " | " + this.assistantShift.getAssistantEmail() + " | " + this.bookableRoom.getRoomCode() + " | " + this.studentEmail + " | ";
    }
}