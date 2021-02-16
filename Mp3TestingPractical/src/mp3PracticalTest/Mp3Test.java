package mp3PracticalTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mp3Practical.mp3;

class Mp3Test {

	//Test data
	int refNumberValidLower, refNumberValidUpper, refNumberInvalid, ratingValid, ratingInvalid, songLengthValid, songLengthInvalid;
	String songNameValid, songNameInvalid, artistValid, artistInvalid;
		
		
	@BeforeEach
	void setUp() throws Exception {
		refNumberValidLower = 1;
		refNumberValidUpper = 5;
		refNumberInvalid = -1;
		ratingValid = 2;
		ratingInvalid = -1;
		songLengthValid = 5;
		songLengthInvalid = -1;
		songNameValid = "Song Name Valid";
		songNameInvalid = "";
		artistValid = "Artist Valid";
		artistInvalid = "";
	}

	@Test
	void testGetRef() {
		mp3 mp3 = new mp3();
		mp3.setRef(5);
		assertEquals(5, mp3.getRef());
	}

	@Test
	void testSetRefValidValues() {
		mp3 mp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
				mp3.setRef(-1); 
		});
	}
	void testSetRefInvalidValues() {
		mp3 mp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
				mp3.setRef(refNumberInvalid); 
		});
	}

	@Test
	void testGetArtist() {
		mp3 mp3 = new mp3();
		mp3.setArtist("John");
		assertEquals("John", mp3.getArtist());
	}

	@Test
	void testSetArtist() {
		mp3 mp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
				mp3.setArtist(""); 
		});
	}

	@Test
	void testGetSongName() {
		mp3 mp3 = new mp3();
		mp3.setSongName(songNameValid);
		assertEquals(songNameValid, mp3.getSongName());
	}

	@Test
	void testSetSongName() {
		mp3 mp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
				mp3.setSongName(songNameInvalid); 
		});
	}

	@Test
	void testGetRating() {
		mp3 mp3 = new mp3();
		mp3.setRating(5);
		assertEquals(5, mp3.getRating());
	}

	@Test
	void testSetRating() {
			mp3 mp3 = new mp3();
			assertThrows(IllegalArgumentException.class, () -> {
					mp3.setRating(-1); 
			});
	}

	@Test
	void testGetSongLength() {
		mp3 mp3 = new mp3();
		mp3.setSongLength(5);
		assertEquals(5, mp3.getSongLength());
	}

	@Test
	void testSetSongLength() {
		mp3 mp3 = new mp3();
		assertThrows(IllegalArgumentException.class, () -> {
				mp3.setSongLength(-1); 
		});
	}

	@Test
	void testMp3DefaultConstructor() {
		mp3 mp3 = new mp3();
		assertNotNull(mp3);
	}
	
	@Test
	void testMp3FullConstructor() {
		mp3 mp3 = new mp3(refNumberValidLower, artistValid, songNameValid, ratingValid, songLengthValid);
		assertNotNull(mp3);
		assertEquals(refNumberValidLower, mp3.getRef());
		
	}
}
