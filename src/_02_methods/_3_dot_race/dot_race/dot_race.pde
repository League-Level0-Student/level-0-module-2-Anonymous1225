/*******

 that travels across the screen when the mouse is pressed.
*/
  /***********  SOUND ***************
   * Some computers are unable to play sounds. 
   * If you cannot play sound on this computer, set canPlaySounds to false.
   * If you are not sure, ask your teacher 
   * *****************/
  boolean canPlaySounds = true;
//int mouseX;

int x;
int y;

void setup() {
    size(1000, 1000);
    
    //1. Set the variable named x to 50.
     x =50;
     y =75;

}

void draw() {

	background(200,200,200);
 
    //2. Draw an ellipse of height and width 50. Make sure to use the x variable for its X position. 
    //   Pick a y value that places it half way down the window.
fill(128,128,128);
ellipse(x ,y,50,50);
    //3. Make the ellipse a nice color

    //4. If the mouse is pressed change the x value so that the dot moves to the right

if (mousePressed) {
     float X1 = (mouseX-x)/15.0;
     float Y1 = (mouseY-y)/15.0;
   x+=(int) X1;
   y+=(int) Y1;
//  if (x>=825) {
//    x = 50;
//  }
if (X1 <= 1) {
    playSound();
  text("haha you lost the easiest game ever", 20,20);
    text("haha you lost the easiest game ever", 20,20);
      text("haha you lost the easiest game ever", 20,20);
        text("haha you lost the easiest game ever", 20,20);
  text("    ",1,1);
    text("    ",1,1);
      text("    ",1,1);
  exit();
}
}
    //5. If your dot moves slowly, make it move faster. If it moves too quickly, slow it down
    //  (you have to figure out what part of your code to change)

    //6. Use an if statement to play a sound (ding) when your dot crosses the finish line (right side of window).
    //   A playSound() method is provided (you have to uncomment the code at the bottom of this program to get this to work)



}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  
  if (canPlaySounds) {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
  }
  fill(0);

}
