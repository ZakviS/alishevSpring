package by.grinuk.springcourse;

public class JazzMusic implements Music{
    String[] song = new String[]{"firstJ","secondJ","thirdJ"};
    int i;
    public void rand(){
        i = (int) (Math.random() * 3);
    }
    @Override
    public String getSong() {
        rand();
        return song[i];
    }
}
