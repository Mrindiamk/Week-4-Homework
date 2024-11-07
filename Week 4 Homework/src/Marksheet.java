public class Marksheet {

    public static void main(String[] args) {

        String date= "Aug2018";
        String Board= "GU";
        String subject= "Maths";
        String subject1= "English";
        String subject2= "Social Science";
        String subject3= "Science";
        String subject4= "Gujarati";

        System.out.println(" ");

        System.out.println("                PROVISIONAL STATEMENT OF RESULT                                ");
        System.out.println("                   Stephanie matthews                                          ");
        System.out.println(" ");

        System.out.println("Candidate Information");
        System.out.println("Date of Birth              Centre number                 UCI");
        System.out.println("11/11/2001                  00000                        00000000000000");

        System.out.println("Registration form          Candidate number               ");
        System.out.println("11 April                         123450                        ");
        System.out.println(" ");

        System.out.println("DATE            BOARD           QUALIFICATION                                GRADE");
        System.out.println(date+"          "+Board+"               "+subject+ "                                        A");
        System.out.println(date+"          "+Board+"               "+subject1+ "                                      A+");
        System.out.println(date+"          "+Board+"               "+subject2+ "                               B");
        System.out.println(date+"          "+Board+"               "+subject3+ "                                      B");
        System.out.println(date+"          "+Board+"               "+subject4+ "                                     C");
    }
}
