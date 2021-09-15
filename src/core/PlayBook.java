package core;

import core.view.Features;

public class PlayBook {

    public static void main(String[] args) {

        Student aStudent = new Student("Muller","Merkel");

        Features.display(aStudent.toString());

        Student bStudent = new Student();
        bStudent.setFname("Genevieve");
        bStudent.setLname("Bröhmm");

        Features.display(bStudent.toString());
    }
}
