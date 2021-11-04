public class Week {
    public static void main(String[] args) {

        String dayOfTheWeek = "tuesday";
        String weekend = "It is time to sleep and to drunk";
        String weekDays = "It is time go to work";

        String workout = "And Also Go to the gym lazy ass";
        String study = "And Also Learn JAVA lazy ass";
        String rest = "And Also Today we are rest";


        switch ( dayOfTheWeek ) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(weekDays);
                break;
            default:
                System.out.println(weekend);
        }

        switch ( dayOfTheWeek ) {
            case "monday":
            case "wednesday":
            case "friday":
                System.out.println(workout);
                break;
            case "tuesday":
            case "thursday":
            case "saturday":
                System.out.println(study);
                break;
            default:
                System.out.println(rest);
        }
    }
}
