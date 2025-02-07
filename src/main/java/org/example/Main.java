package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentenListe = new ArrayList<>();

        Student student1 = new Student("Tanja", "Justus", "111");
        Student student2 = new Student("Elena", "Shill", "3333");
        Student student3 = new Student("Alex", "Müller", "76654443");
        Student student4 = new Student("Milana", "Neumann", "876554431");

        studentenListe.add(student1);
        studentenListe.add(student2);
        studentenListe.add(student3);
        studentenListe.add(student4);
        for (int i = 0; i < studentenListe.size(); i++) {
            Student student = studentenListe.get(i);
            System.out.println("\nStudentinformationen: ");
            student.zeigeStudentDaten();

        }


        Schule schule = new Schule();
        Student student5 = new Student("Maria", "Neumann", "876554431");
        schule.addStudent(student5);
        schule.addStudent(student3);
        schule.addStudent(student2);
        schule.addStudent(student4);
        System.out.println("\n Alle Schüler: ");
        schule.zeigeAlleStudenten();

        //Schüller mit ID finden
        Student gefundenerStudent = schule.findeStudent("3333");
        if (gefundenerStudent != null) {
            System.out.println("Gefundener Student: " + gefundenerStudent);
        } else {
            System.out.println("Student nicht gefunden!");

        }

        // Student löschen
        boolean gelöscht = schule.entferneStudent("333");
        if (gelöscht) {
            System.out.println("Schüler wurde entfernt.");
        } else {
            System.out.println("Schüler nicht gefunden.");
        }
    }

}