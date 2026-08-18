package lab3;

public class Month {
    String weekName = "Week";

    static class Day{
        String getDay(int value){
            if(value==1){
                return "Sunday";
            }
            else{
                return "";
            }
        }
    }
    // Inner Class
    class Week {
        String getWeekName(){
            return weekName+" 1";
        }
    }

    public static void main(String[] args){
        Day day = new Day();
        String sunday = day.getDay(1);
        System.out.println(sunday);

        Month month = new Month();
        Month.Week week = month.new Week();

        System.out.println(week.getWeekName());
    }

}
