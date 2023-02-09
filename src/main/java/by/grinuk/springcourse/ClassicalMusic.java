package by.grinuk.springcourse;

public class ClassicalMusic implements Music{

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my distraction");
    }


    @Override
    public String getSong() {
        return "Hungarial Rhapsody";
    }
}
