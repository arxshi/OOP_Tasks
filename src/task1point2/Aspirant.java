package task1point2;

public class Aspirant extends Student {

    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double avgMark) {
        super(firstName, lastName, group, avgMark);
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if(avgMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
