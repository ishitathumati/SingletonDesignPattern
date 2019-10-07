package assignments.SingletonDesignPattern;
/**
 * This class is a singleton, and creates one jukebox
 * initializes a queue and holds the songs
 * @author ishitathumati
 */
import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {
	/**
	 * private variables can only be accessed by this class
	 */
		private Queue<String> songQueue = new LinkedList<String>();
		private static JukeBox jukeBox;
		private int i;
		  
		private JukeBox() {}
	  
		/**
		 * creates an instance of a jukebox
		 * @return
		 */
		public static JukeBox getInstance() {
			if (jukeBox == null) {
				System.out.println("Initializing the Jukebox!!! Let's get Dancing");
				jukeBox = new JukeBox();
			}
			return jukeBox;
		}

		/**
		 * This method plays each song in the queue (head) and removes it after
		 */
		public void playNextSong() {
			for (int i=0; i<songQueue.size(); i++) {
				System.out.println("Let's jam to "+songQueue.peek());
				songQueue.remove();
			}
			
		}
		
		/**
		 * this method requests a song and adds it to the queue
		 * @param song
		 * @return 
		 */
		public void requestSong(String song) {
			i++;
			System.out.println(song + " is now number "+i+ " on the list");
			songQueue.add(song);
		}
	 
		/**
		 * This method returns true or false if queue is empty
		 * @return
		 */
		public boolean hasMoreSongs() {
			if (!songQueue.isEmpty()) {
				return true;
			}
			else
				return false;
		}
	
}
