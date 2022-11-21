// class Crystal
import java.util.ArrayList;
public class Crystal {
    ArrayList<Particle> captured = new ArrayList<>(10);
    // constructor
    public Crystal(){
        captured.add(new Particle(0,0));
    }
    // to return the size of the array list captured
    public int size(){
        return captured.size();
    }
    public boolean testCapture(Particle p){
        for (Particle particle: captured){
            System.out.println("Particle distance from crystal: "+ particle.distance(p));
            if (particle.distance(p) <= 2){
                captured.add(p);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Crystal crystal = new Crystal();
        Particle particle = new Particle (2,2);
        System.out.println("Original particle position: "+particle+"\n");
        System.out.println("MOVE ONE");
        particle.move();
        System.out.println("Particle after move(): "+particle);
        boolean captured = crystal.testCapture(particle);
        System.out.println("Crystal captured: "+captured+"\n");

        System.out.println("MOVE TWO");
        particle.move();
        System.out.println("Particle after move(): "+particle);
        captured = crystal.testCapture(particle);
        System.out.println("Crystal captured: "+captured+"\n");

        System.out.println("MOVE THREE");
        particle.move();
        System.out.println("Particle after move(): "+particle);
        captured = crystal.testCapture(particle);
        System.out.println("Crystal captured: "+captured+"\n");
    }
}  
