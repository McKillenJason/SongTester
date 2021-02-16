package mp3Practical;

public class mp3 {

	public final static int LOWER_RATING=0; 

	private int ref;
	private String artist;
	private String songName;
	private int rating;
	private int songLength;
	
	public int getRef() {
		return ref;
	}
	    
	/**
	 * If less than zero then throw exception
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {
		if (ref >=0){
			this.ref = ref;
		} else { 
			throw new IllegalArgumentException("Ref less than 0");
		}
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) throws IllegalArgumentException {
		if(artist.length() > 0 && artist.length() <= 20) {
			this.artist = artist;
		} else {
			throw new IllegalArgumentException("Song name must be between 1 and 20 (inclusive).");
		}
	}
	
	public String getSongName() {
		return songName;
	}
	
	public void setSongName(String songName) throws IllegalArgumentException {
		if(songName.length() > 0 && songName.length() <= 20) {
			this.songName = songName;
		} else {
			throw new IllegalArgumentException("Song name must be between 1 and 20 (inclusive).");
		}
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) throws IllegalArgumentException {
		if((rating >= LOWER_RATING) && (rating <=5)){	
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Rating must be between 1 and 5 inclusive.");
		}
	
	}
	
	
	
	public int getSongLength() {
		return songLength;
	}

	public void setSongLength(int songLength) throws IllegalArgumentException {
		if(songLength >= 1 && songLength <=2500) {
			this.songLength = songLength;
		} else {
			throw new IllegalArgumentException("Song length must be between 1 and 2500 (inclusive).");
		}
	}
	
	public mp3() {
		
	};
	
	public mp3(int ref, String artist, String songName, int rating, int songLength) {
		this.ref = ref;
		this.artist = artist;
		this.songName = songName;
		this.rating = rating;
		this.songLength = songLength;
	}

	
	




	
	
	
	
}
