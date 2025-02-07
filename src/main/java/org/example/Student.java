package org.example;

public class Student {

    private String vorname;
    private String nachname;
    private String studentenID;

    public Student(String vorname, String nachname, String studentenID) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.studentenID = studentenID;
    }

    // Getter-Methoden
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getStudentenID() {
        return studentenID;
    }

    // Setter-Methoden
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStudentenID(String studentenID) {
        this.studentenID = studentenID;
    }

    public void zeigeStudentDaten() {
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Studenten-ID: " + studentenID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", studentenID='" + studentenID + '\'' +
                '}';
    }
}
