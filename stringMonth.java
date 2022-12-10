//import JOptionPane 
import javax.swing.JOptionPane;


public class stringMonth {

    public static void main(String[] args) {
        // I am a comment inside of the main method

        // declaring string variables month and season
        String month;
        String season;

        month = JOptionPane.showInputDialog("what is your favorite month");

        // our program, when complete, will return a statement of the users favorite month and favorite season simply based off the users input of their favorite month.

        // We will need to use an if else statement that checks the user input and determines what to set their favorite season to


        // if the month input is equal to December - February, the users favorite season is winter
        // || = or
        //equalsIgnoreCase I believe removes case sensitivity. Need to double check
        if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Dec") || 
        month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Jan") || 
        month.equalsIgnoreCase("February") || month.equalsIgnoreCase("Feb")){

            // season is equal to the string "Winter" I dont know why we dont use ' == ' here
            season = "Winter";
        }
        else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("Mar")) ||
        month.equalsIgnoreCase("April") || month.equalsIgnoreCase("Apr") || 
        month.equalsIgnoreCase("May")) {
            season = "Spring";
        }
        else if(month.equalsIgnoreCase("June") || 
        month.equalsIgnoreCase("July") ||
        month.equalsIgnoreCase("August")) {
            season = "Summer";

        }
        else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Sep") ||
        month.equalsIgnoreCase("October") || month.equalsIgnoreCase("Oct") ||
        month.equalsIgnoreCase("November") || month.equalsIgnoreCase("Nov")) {
            season = "Fall";
        }
        



    }
}