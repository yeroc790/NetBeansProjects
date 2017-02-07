/*
 * Candy bars cost 10 tickets and gum balls cost 3 tickets
 * This program calculates how many candy bars and gum balls can be purchased
 * given a number of tickets and the constraint that you must by as many candy
 * bars as you can
 */
package project2;

/**
 *
 * @author hansenc
 */
public class project2 {
    public static void main(String[] args) {
        int tickets = 47, ticketcopy;
        int cb=0, gb=0;
        ticketcopy = tickets;
        while(ticketcopy>0)
        {
            if(ticketcopy>=10)
            {
                cb++;
                ticketcopy -= 10;
            }
            if((ticketcopy<=10)&&(ticketcopy>=3))
            {
                gb++;
                ticketcopy -= 3;
            }
            if(ticketcopy<3)
            {
                break;
            }
        }
        System.out.println("You can buy " + cb + " candy bars and " + gb + " gum balls with " + tickets + " tickets");
        
    }
}
