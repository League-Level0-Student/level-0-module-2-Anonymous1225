
package _99_extra;

import javax.swing.JOptionPane;

import game_tools.Sound;

/* NASA wants to shoot a rocket into orbit.
 * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0.
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
    public static void main(String[] args) throws InterruptedException {
        // 2. Use a pop-up to ask the user where to start counting from
        String timer = JOptionPane.showInputDialog(null, "Set your timer");
        // 3. Change the countdown to use the new starting point
 int countdown = Integer.parseInt(timer);
 while (countdown>0) {
 Thread.sleep(1000);
 Sound.speak(timer);
 countdown-=1;
 timer = String.valueOf(countdown);
 }
            // 4. Use the Sound.speak method to hear the countdown.


            // 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
            
        // 5. when the counting is done, speak "blastoff!"
    }
}


