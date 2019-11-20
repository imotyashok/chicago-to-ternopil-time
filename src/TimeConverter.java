import java.util.*;

public class TimeConverter
{
    public static String UkrainianToChicago(int hrs, String mins)
    {
        // subtract 8 hours
        int newHrs = hrs - 8;

        if (newHrs >= 0)
        {
            String hours = Integer.toString(newHrs); // convert newHrs into
            // string type
            String localTime = hours+":"+mins;
            return localTime;
        }
        else if (newHrs < 0)
        {
            int hours = 24 + newHrs;
            String hour = Integer.toString(hours);// convert hours into
            // string type
            String localTime = hour+":"+mins;
            return localTime;
        }
        else
        {
            String localTime = "ERROR";
            return localTime;
        }
        //  return localTime;
    }

    public static String ChicagoToUkrainian(int hrs, String mins)
    {
        // add 8 hours
        int newHrs = hrs + 8;

        if (newHrs < 24)
        {
            String hours = Integer.toString(newHrs);// convert newHrs to str
            String localTime = hours+":"+mins;
            return localTime;
        }
        else if (newHrs >= 24)
        {
            int hours = newHrs - 24;
            String hour = Integer.toString(hours);// convert hours to str type
            String localTime = hour+":"+mins;
            return localTime;
        }
        else
        {
            String localTime = "ERROR";
            return localTime;
        }
        //return localTime;
    }

    public static String timeFormat(String time)
    {
        // converts time to am/pm format
        int hrs = Integer.parseInt(time.substring(0,2)); // strip first 2 chars and
        // convert string to int
        int newHrs = hrs - 12;
        if (hrs < 12)
        {
            String amerTime = time+" AM";
            return amerTime;
        }
        else if (hrs == 12)
        {
            String amerTime = "12:"+time.substring(3,5)+" PM";
            return amerTime;
        }
        else if (hrs > 12)
        {
            String amerTime = newHrs+time.substring(2,5)+" PM";
            return amerTime;
        }
        else
        {
            String amerTime = "ERROR";
            return amerTime;
        }
        //return amerTime;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the city you're in (Chicago or Ternopil): ");
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        System.out.println("Enter the time in "+city+" in 24 hour format:");
        String time = sc.nextLine();

        // Since we're only interested in the hours
        int hrs = Integer.parseInt(time.substring(0,2));
        String mins = time.substring(3,5);// strip time string into mins

//
        if (city.toLowerCase().equals("ternopil"))
        {
            System.out.println(city); // test statement
//            String newTime = UkrainianToChicago(hrs, mins);
//
//            String amPmTime = timeFormat(newTime);
//
//            System.out.println("The time in Chicago is "+newTime+", or "+amPmTime);
        }
        else if (city.toLowerCase().equals("chicago"))
        {
            System.out.println(city); // test statement
//            String newTime = ChicagoToUkrainian(hrs, mins);
//
//            String amPmTime = timeFormat(newTime);
//
//            System.out.println("The time in Ternopil is "+newTime+", or "+amPmTime);
        }
        else
            System.out.println("Error: city not recognized");
    }
}