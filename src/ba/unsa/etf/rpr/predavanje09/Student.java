package ba.unsa.etf.rpr.predavanje09;

import java.util.Date;

class Student implements Cloneable {
    public String ime, prezime;
    public Date datumRodjenja;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student novi = (Student) super.clone();
        novi.datumRodjenja = (Date) this.datumRodjenja.clone();
        return novi;
    }
}
