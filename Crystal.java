// class Crystal

import java.util.ArrayList;
public class Crystal {
    ArrayList<Particle> captured = new ArrayList<>();
    static double distance = 0.1;
    static boolean debugging = false;
    // constructor
    public Crystal(){
        captured.add(new Particle(0, 0));
    }
    // to return the size of the array list captured
    public int size(){
        return captured.size();
    }
    public boolean testCapture(Particle p){
        for (Particle particle: captured){
            if(debugging == true)
                System.out.println("Particle distance from crystal: "+ particle.distance(p));
            if (particle.distance(p) <= distance){
                captured.add(p);
                return true;
            }
        }
        return false;
    }
}  
