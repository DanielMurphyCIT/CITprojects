package application;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ModuleArray extends ArrayList {
    private ArrayList<Student> ModuleArray;

    public ModuleArray() {
        this.ModuleArray = new ArrayList();
    }

    public ArrayList<Student> getStudents() {
        return ModuleArray;
    }

    public int size() {
        return ModuleArray.size();
    }

    public void addStudent(Student element) {
        ModuleArray.add(element);
    }

    public void removeStudent(String reg) {
        Student StudentToRemove = null;
        for (Student c : ModuleArray) {
            if (c.getDateOfBirth() == reg) {
                StudentToRemove = c;
            }
        }
        if (StudentToRemove != null) {
            ModuleArray.remove(StudentToRemove);
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean isEmpty() {
        return ModuleArray.isEmpty();
    }

}