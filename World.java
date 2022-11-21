public class World {
    static double length, width; // the size of the "glass"
    public World(double l, double w){
        length = l;
        width = w;
    }
    public static void main(String[] args){ // testing if my World is working to be able to check if my particle moves are safe - currently not working
        World world = new World(5, 5);
        Particle particle = new Particle(2, 3);
        Particle compare = new Particle(5,4);
        System.out.println("Particle starting at: "+particle);
        particle.move();
        System.out.println(particle.distance(compare));
        System.out.println("Particle after move(): "+particle);
        particle.move();
        System.out.println(particle.distance(compare));
        System.out.println("Particle after move(): "+particle);
        particle.move();
        System.out.println(particle.distance(compare));
        System.out.println("Particle after move(): "+particle);
    }
}
