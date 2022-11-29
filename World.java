// class World

public class World {
    static boolean debugging = false;
    public static void main(String[] args){ 
        // make crystal
        // in a loop
            // move, test, move, test
            // when it returns true, make another particle
            // move, test, move, test
            // when it returns true, make another particle
        Crystal crystal = new Crystal();
        for (int i=0; i<100; i++){
            double x = randomCoordinate();
            double y = randomCoordinate();
            if (debugging == true)
                System.out.println("Particle "+i+" with starting coordinates ("+x+", "+y+") has been made");
            Particle particle = new Particle(x, y);
            boolean captured = false;
            int iterations = 0;
            while(captured == false){ // when true, start at the beginning of the for loop
                particle.move();
                captured = crystal.testCapture(particle);
                iterations++;
            }
            if (debugging == true){
                System.out.println("Iterations = "+ iterations);
                System.out.println("Size of crystal = "+ crystal.size());
            }
        }
        System.out.println("Size of the crystal = "+ crystal.size());
    }
    // method to generate random x and y values
    public static double randomCoordinate(){
        double coord = Math.random()*10;
        return coord;
    }
}
