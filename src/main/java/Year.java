public class Year {
    private int year;


    public static boolean isDividbleWith4(int year) {return year % 4 == 0;}

    public static boolean isNotDividbleWith100(int year) { return year % 100 != 0;}

    public static boolean isDividblewith400(int year) { return year % 400 == 0;}

    public static boolean isLeapYear(int year){
        if (isDividbleWith4(year) && isNotDividbleWith100(year)){
            return true;
        }else return isDividblewith400(year);
    }

    public void setYear(int i) {

    }




}

