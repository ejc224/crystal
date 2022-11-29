// class Particle

public class Particle{
    double x, y;
    static double step = 0.1; // size of move
    static double max = 10; // size of glass
    static boolean debugging = false; // to turn comments on and off (true if on, false if off)

    public Particle(double x, double y){
        this.x = x;
        this.y = y;
    }
    // this method determines the direction the particle is moving in and if it can move that way based on the size of the glass
    public void move(){
        int direction = (int) (Math.random()*8)+1;
        /***
         * corresponding directions
         * 1: SW
         * 2: W
         * 3: NW
         * 4: N
         * 5: NE
         * 6: E
         * 7: SE
         * 8: S
         */
        double tempX = 0;
        double tempY = 0;
        boolean safe = true; // boolean to track if my logic statements are working correctly
        switch(direction){ 
            case 1: // SW - x minus 1, y minus 1
                tempX = x-step;
                tempY = y-step;
                if((tempX < max && tempX > -max) && (tempY < max && tempY > -max)){
                    x = tempX;
                    y = tempY;
                    safe = true;
                    if(debugging == true)
                        System.out.println("Moving SW");
                }
                else{
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
            case 2: // W - x minus 1, y stays the same
                tempX = x-step;
                if(tempX < max && tempX > -max){
                    x = tempX;
                    if(debugging == true)
                        System.out.println("Moving W");
                    safe = true;
                }
                else{
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
            case 3: // NW - x minus 1, y plus 1
                tempX = x-step;
                tempY = y+step;
                if((tempX < max && tempX > -max) && (tempY < max && tempY > -max)){
                    x = tempX;
                    y = tempY;
                    if(debugging == true)
                        System.out.println("Moving NW");
                    safe = true;
                }
                else{
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
            case 4: // N - x stays the same, y plus 1
                tempY = y+step;
                if(tempY < max && tempY > -max){
                    y = tempY;
                    if(debugging == true)
                        System.out.println("Moving N");
                    safe = true;
                }
                else{ 
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
            case 5: // NE - x plus 1, y plus 1
                tempX = x+step;
                tempY = y+step;
                if((tempX < max && tempX > -max) && (tempY < max && tempY > -max)){
                    x = tempX;
                    y = tempY;
                    if(debugging == true)
                        System.out.println("Moving NE");
                    safe = true;
                }
                else{
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
            case 6: // E - x plus 1, y stays the same
                tempX = x+step;
                if(tempX < max && tempX > -max){
                    x = tempX;
                    if(debugging == true)
                        System.out.println("Moving E");
                    safe = true;
                }
                else{
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
            case 7: // SE - x plus 1, y minus 1
                tempX = x+step;
                tempY = y-step;
                if((tempX < max && tempX > -max) && (tempY < max && tempY > -max)){
                    x = tempX;
                    y = tempY;
                    if(debugging == true)
                        System.out.println("Moving SE");
                    safe = true;
                }
                else{
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
            case 8: // S - x stays the same, y minus 1
                tempY = y-step;
                if(tempY < max && tempY > -max){
                    y = tempY;
                    if(debugging == true)
                        System.out.println("Moving S");
                    safe = true;
                }
                else{
                    safe = false;
                }
                if(debugging == true)
                    System.out.println("Safe or unsafe move(): "+ safe);
                break;
        }
    }
    // this method determines the distance of the particle from any of the particles in the crystal
    // to be ustilized in crystal since it returns the distance to be used in testCaptured
    // use pythagorean theorem like when estimating Pi
    public double distance(Particle other){
        double c2 = Math.pow((x-other.x), 2) + Math.pow((y-other.y), 2); // adding the x and y values of the particle point to the other point to find the distance between the two
        double hypotenuse = Math.pow(c2, 0.5); 
        return hypotenuse;
    }
    public String toString(){
        return "("+x+", "+y+")";
    }
}
