
package _99_extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Mood1", "Mood2", "Mood3" }, null);
		System.out.println(userMood);
		// 2. Their answer is stored in the userMood variable. Print it out.

		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		String youTubeLink = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		String babyShark = "https://www.youtube.com/watch?v=XqZsoesa55w&vl=en";
		String nyancat = "https://www.youtube.com/watch?v=2yJgwwDcgV8";
		int oh = 0;
 if (userMood==0) {
		while (oh==0) {
		playVideo(youTubeLink);
		}

 }
 if (userMood==1) {
		while (oh==0) {
		playVideo(babyShark);
		}
 }
 if (userMood==2) {
		while (oh==0) {
		playVideo(nyancat);
		}
} 
 
		// 4. Play different songs for other moods.

/**
* If you can't think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

static void playVideo(String youTubeLink) {

		try {
			JOptionPane.showMessageDialog(null, "Get rickrolled LOLOLOLOLOLOLOLOL");
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}




