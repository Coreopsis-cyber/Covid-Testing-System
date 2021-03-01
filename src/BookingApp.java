import java.util.Scanner;
/**
 *Class containing main method, controlling functionality for the app and the hard code for the classes.
 */
public class BookingApp{
    public static void main(String[] args) {
        //initialising the UniversityResources object
        UniversityResources resources = new UniversityResources();

        //adding the starting assistants
        Assistant assistant1 = new Assistant("Ursula", "um@uok.ac.uk");
        Assistant assistant2 = new Assistant("Mathew", "ml@uok.ac.uk");
        Assistant assistant3 = new Assistant("Louis", "lc@uok.ac.uk");
        resources.addAssistant(assistant1);
        resources.addAssistant(assistant2);
        resources.addAssistant(assistant3);

        //adding the starting rooms
        Room room1 = new Room("HAR01",1);
        Room room2 = new Room("HAR02",4);
        Room room3 = new Room("HAR03",7);
        resources.addRoom(room1);
        resources.addRoom(room2);
        resources.addRoom(room3);

        //initialising the Booking system object
        BookingSystem bookingsystem = new BookingSystem();

        //initialising the bookable rooms
        BookableRoom bookroom1 = new BookableRoom(room2, "21/02/2021", "09:00");
        BookableRoom bookroom2 = new BookableRoom(room1, "01/03/2021", "08:00");
        BookableRoom bookroom3 = new BookableRoom(room1, "01/03/2021", "09:00");
        BookableRoom bookroom4 = new BookableRoom(room2, "01/03/2021", "07:00");
        BookableRoom bookroom5 = new BookableRoom(room2, "01/03/2021", "08:00");
        BookableRoom bookroom6 = new BookableRoom(room2, "01/03/2021", "09:00");
        BookableRoom bookroom7 = new BookableRoom(room3, "01/03/2021", "07:00");
        BookableRoom bookroom8 = new BookableRoom(room3, "01/03/2021", "08:00");
        BookableRoom bookroom9 = new BookableRoom(room3, "01/03/2021", "09:00");
        bookingsystem.addBookableRoom(bookroom1);
        bookingsystem.addBookableRoom(bookroom2);
        bookingsystem.addBookableRoom(bookroom3);
        bookingsystem.addBookableRoom(bookroom4);
        bookingsystem.addBookableRoom(bookroom5);
        bookingsystem.addBookableRoom(bookroom6);
        bookingsystem.addBookableRoom(bookroom7);
        bookingsystem.addBookableRoom(bookroom8);
        bookingsystem.addBookableRoom(bookroom9);

        //initialising the assistants on shift
        AssistantShift assistantshift1 = new AssistantShift(assistant2, "21/02/2021", bookingsystem);
        bookingsystem.addAssistantShift(assistantshift1);
        AssistantShift assistantshift2 = new AssistantShift(assistant1, "01/03/2021", bookingsystem);
        bookingsystem.addAssistantShift(assistantshift2);
        AssistantShift assistantshift3 = new AssistantShift(assistant3, "01/03/2021", bookingsystem);
        bookingsystem.addAssistantShift(assistantshift3);
        AssistantShift assistantshift4 = new AssistantShift(assistant2, "01/03/2021", bookingsystem);
        bookingsystem.addAssistantShift(assistantshift4);

        Booking booking1 = new Booking(assistantshift2, bookroom3, "Johnp@uok.ac.uk");
        Booking booking2 = new Booking(assistantshift1, bookroom1, "Marks@uok.ac.uk");
        bookingsystem.InitialiseAddBooking(booking1);
        bookingsystem.InitialiseAddBooking(booking2);
        booking2.conclude();

        displayMain(bookingsystem, resources);

    }

    /**
     * Module controlling screens and main functionality such as screens and reacting to user input.
     * @param bookingsystem_ A booking system class object.
     * @param resources_ University resources class object.
     */
    public static void displayMain(BookingSystem bookingsystem_, UniversityResources resources_){
        //initialising the scanner
        Scanner input = new Scanner(System.in);

        //showing all the options the user has to input and manage the system
        String displayScreen = "\nUniversity of Knowledge - COVID test\n\nManage Bookings\n" +
                "\nPlease, enter the number to select your option:\n\nTo manage Bookable Rooms:" +
                "\n\t1. List\n\t2. Add\n\t3. Remove\nTo manage Assistants on Shift:\n\t4. List\n\t5. Add\n\t6. " +
                "Remove\nTo manage Bookings:\n\t7. List\n\t8. Add\n\t9. Remove\n\t10. Conclude\nAfter selecting one the options above, " +
                "you will be presented other screens.\nIf you press 0, you will be able to return to this main menu." +
                "\nPress -1 (or ctrl+c) to quit this application.\n";

        boolean exit = true;

        while (exit == true){
            System.out.println(displayScreen);
            //waiting for the user to select an option
            String input1 = input.nextLine();
            //if they select -1 exit the application
            if (input1.equals("-1")){
                exit = false;
            } else if (input1.equals("1")){
                //if 1 selected, divert to the booking system, bookable rooms list
                exit = bookingsystem_.listBookableRooms();
            } else if (input1.equals("2")){
                //if 2 selected, divert to the booking system, bookable rooms add method
                exit = bookingsystem_.addBookableRooms(resources_);
            } else if (input1.equals("3")){
                //if 3 selected, divert to the booking system, bookable rooms remove method
                exit = bookingsystem_.removeBookableRooms();
            } else if (input1.equals("4")){
                //if 4 selected, divert to the booking system, list assistants method
                exit = bookingsystem_.listAssistantsShift();
            } else if (input1.equals("5")){
                //if 5 selected, divert to the booking systemm, add assistants on shift method
                exit = bookingsystem_.addAssistantsShift(resources_, bookingsystem_);
            } else if (input1.equals("6")){
                //if 6 selected, divert to the booking system, remove assistants on shift method
                exit = bookingsystem_.removeAssistantShift();
            } else if (input1.equals("7")){
                //if 7 selected, divert to the booking system, list bookings method
                exit = bookingsystem_.listBookings();
            } else if (input1.equals("8")){
                //if 8 selected,divert to the booking system, add bookings method
                exit = bookingsystem_.addBooking(0);
            } else if (input1.equals("9")){
                //if 9 selected, divert to the booking system, remove bookings method
                exit = bookingsystem_.removeBooking();
            } else if (input1.equals("10")){
                //if 10 selected, divert to the booking systemm, finish booking method
                exit = bookingsystem_.concludeBooking();
            }
        }
    }
}

