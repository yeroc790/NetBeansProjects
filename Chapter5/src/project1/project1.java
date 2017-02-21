/**
 * Hotdog Stand
 */
package project1;

/**
 * This class uses HotDogStand
 * @author hansenc
 */
public class project1 {
    public static void main(String[] args) {
        HotDogStand stand1, stand2, stand3;
        stand1 = new HotDogStand();
        stand2 = new HotDogStand();
        stand3 = new HotDogStand();
        
        for (int i = 0; i < 10; i++) {
            stand1.justSold();
        }
        stand1.displayInfo();
        
        for (int i = 0; i < 32; i++) {
            stand2.justSold();
        }
        stand2.displayInfo();
        
        for (int i = 0; i < 16; i++) {
            stand3.justSold();
        }
        stand3.displayInfo();
        
        int total = stand1.getNum() + stand2.getNum() + stand3.getNum();
        System.out.println("Total hotdogs sold: " + total);
    }
}
