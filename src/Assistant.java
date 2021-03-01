/**
 * Assistant class containing a name and an email for the assistants.
*/
public class Assistant {
    private String name;
    private String email;

    /**
     * This constructor instantiates an assistant.
     * @param name_ A non null string of the name of an assistant.
     * @param email_ A string of correct form of the email of an assistant.
     */
    public Assistant(String name_, String email_) {
        //checking the name is not null
        if (name_ != null) {
            name = name_;
            //chekcing that the email is valid
            if ((email_.length() > 10) && ((email_.substring(email_.length() - 10)).equals("@uok.ac.uk"))) {
                email = email_;
            } else {
                //returning errors if the name and email isn't valid
                System.out.println("email must be registered with the university");
            }
        } else {
            System.out.println("assistant name cannot be null");
        }
    }

    /**
     * Getter method for name.
     * @return The string representing the name of an assistant.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method for an email.
     * @return The string representing the email of an assistant.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Method to override the toString method and return the transcript.
     * @return A formatted string containing all the infomation in the class for each object.
     */
    @Override
    public String toString() {
        return " | " + this.name + " | " + this.email + " | ";
    }
}
