/**
 * AssistantShift class containing an assistant, date,time and status.
 */
public class AssistantShift {
    private Assistant assistant;
    private String date;
    private String time;
    private String status;

    /**
     *This constructor instantiates a Assistant on Shift.
     * @param assistant_ A Assistant object representing an assistant.
     * @param date_ A string representing the date of an Assistant on Shift.
     * @param bookingsystem_ A booking system object representing a booking system
     */
    public AssistantShift(Assistant assistant_, String date_, BookingSystem bookingsystem_){
        //allocating the assistant object to the assistant attribute
        this.assistant = assistant_;
        //allocating the date and time and status to the assistant on shift object if it isn't a duplicate
        this.date = date_;
        this.time = "09:00";
        this.status = "FREE";
        AssistantShift assistantshift = new AssistantShift(assistant_, date_, "07:00");
        bookingsystem_.addAssistantShift(assistantshift);
        AssistantShift assistantshift1 = new AssistantShift(assistant_, date_, "08:00");
        bookingsystem_.addAssistantShift(assistantshift1);
    }

    /**
     *This constructor instantiates a Assistant on Shift.
     * @param assistant_ A Assistant object representing an assistant.
     * @param date_ A string representing the date of an Assistant on Shift.
     * @param time_ A string representing the time slot of an Assistant on Shift.
     */
    public AssistantShift(Assistant assistant_, String date_, String time_){
        //allocating the assistant object to the assistant attribute
        this.assistant = assistant_;
        //allocating the date and time and status to the assistant on shift object
        this.date = date_;
        this.time = time_;
        this.status = "FREE";
    }


    /**
     *Getter method to return a status.
     * @return A string representing the status.
     */
    public String getStatus(){
        return this.status;
    }

    /**
     *Getter method to return an email of an assistant.
     * @return A string representing the email of an assistant from the assistant class.
     */
    public String getAssistantEmail(){
        return this.assistant.getEmail();
    }

    /**
     *Getter method to return a date.
     * @return A string representing the date of an assistant on shift.
     */
    public String getAssistantShiftDate(){
        return this.date;
    }

    /**
     *Getter method to return a time.
     * @return A string representing the time of an assistant on shift.
     */
    public String getAssistantShiftTime(){
        return this.time;
    }

    /**
     *Getter method to return an assistant.
     * @return A object representing an assistant.
     */
    public Assistant getAssistant(){
        return this.assistant;
    }

    /**
     *Method to change the status of a assistant on shift to busy.
     */
    public void makeBusy(){
        this.status = "BUSY";
    }

    /**
     *Method to change the status of an assistant to free.
     */
    public void makeFree(){
        this.status = "FREE";
    }

    /**
     *Method to override the toString method and return the transcript.
     *@return A formatted string containing all the infomation relevant to the Assistant on Shift class.
     */
    @Override
    public String toString() {
        return " | " + this.date + " " + this.time + " | " + this.status + " | " + this.assistant.getEmail() + " | ";
    }
}
