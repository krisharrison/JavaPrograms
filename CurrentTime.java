import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String [] args){

        displayDateTime();

    }
    public static void displayDateTime(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat timeFormat = new SimpleDateFormat("HH:MM:SS");


        System.out.print("Date: "  + dateFormat.format(date) + "\nTime: " + timeFormat.format(date));
    }
}
