public class Switch {
    public static void main(String[] args) {
        int calorie = 1200;
        String dayName = "";

        for (int i = 1; i <= 7; i++){
            switch (i) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;  
            case 5:
                dayName = "Monday";
                break;
            case 6:
                dayName = "Monday";
                break;
            case 7:
                dayName = "Monday";
                break;
            default:
                System.out.println("Day is not valid");
            }  

            if (i > 2){
                calorie = calorie + 100;
            }
            System.out.println(dayName + " is " + calorie);
        }
    }
}
