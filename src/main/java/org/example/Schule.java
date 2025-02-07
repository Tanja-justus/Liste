package org.example;

import java.util.ArrayList;

public class Schule {

    private ArrayList<Student> students;

    public Schule() {
        students = new ArrayList<>();
    }

    // Methode, um einen neuen Student hinzuzufügen
    public void addStudent(Student student) {
        students.add(student);
    }

    // Methode, um alle Studenten anzuzeigen
    public void zeigeAlleStudenten() {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.zeigeStudentDaten();
            System.out.println();
        }
    }

    // Methode, um einen Student mit ID finden
    public Student findeStudent(String studentFindId) {
        for (Student student : students) {
            if (student.getStudentenID().equals(studentFindId)) {
                return student;  // Schüler gefunden
            }
        }
        return null;  // Kein Student mit dieser ID gefunden
    }

    //Student löschen
    public boolean entferneStudent(String studentId) {
        Student student = findeStudent(studentId);
        if (student != null) {
            students.remove(student);
            return true;  // Erfolgreiches Entfernen
        }
        return false;  // Studet nicht gefunden
    }
}
