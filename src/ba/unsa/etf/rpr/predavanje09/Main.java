package ba.unsa.etf.rpr.predavanje09;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.datumRodjenja = new Date(118, 8, 1);
        Student s2 = (Student) s1.clone();
        s2.datumRodjenja.setYear(117);
        System.out.println(s1.datumRodjenja);
	// write your code here
    }
}
