/***
 * Class to model the entity Pair
 * @author Emma Closter
 * @version 0.1
 * Date of creation: September 26, 2022
 * Last Date Modified: September 26, 2022
 */

/**
* Pair class, copied from CSE017 Lecture 5: Generics
*/
public class Pair<E1, E2> {
    private E1 first;
    private E2 second;
    
    public Pair(E1 first, E2 second) {
        this.first = first;
        this.second = second;
    }
    public void setFirst(E1 first) {
        this.first = first;
    }
    public void setSecond(E2 second) {
        this.second = second;
    }
    public E1 getFirst() {
        return first;
    }
    public E2 getSecond() {
        return second;
    }
       
    public String toString() {
        return "(" + first.toString() + ", " +second.toString() + ")";
    }
    
    public boolean equals(Object obj) {
        if(obj instanceof Pair){
            Pair<E1, E2> p = (Pair<E1, E2>) obj;
            boolean eq1 = p.getFirst().equals(first);
            boolean eq2 = p.getSecond().equals(second);
            return eq1 && eq2;
        }
        return false;
    } 
}