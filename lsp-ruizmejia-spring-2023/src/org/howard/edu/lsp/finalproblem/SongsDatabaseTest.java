package org.howard.edu.lsp.finalproblem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SongsDatabaseTest {

    private SongsDatabase db;

    @BeforeEach
    //This adds the songs into database for testing.
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
    }

    @Test
    // adds a new song and tests if the song is added to the database.
    public void testAddSong() {
        db.addSong("Salsa", "Azuca");
        Set<String> songs = db.getSongs("Salsa");
        assertEquals(1, songs.size());
        assertTrue(songs.contains("Azuca"));
    }

    @Test
    //gets songs from database based on genre.
    // Tests song title.
    public void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> jazzSongs = db.getSongs("Jazz");
        assertEquals(2, rapSongs.size());
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));
        assertEquals(1, jazzSongs.size());
        assertTrue(jazzSongs.contains("Always There"));
    }

    @Test
    // Gets songs from databse based on Title.
    //Test if genre matches.
    public void testGetGenreOfSong() {
        String genre1 = db.getGenreOfSong("Savage");
        String genre2 = db.getGenreOfSong("Always There");
        String genre3 = db.getGenreOfSong("Azuca");
        assertEquals("Rap", genre1);
        assertEquals("Jazz", genre2);
        assertNull(genre3);
    }
}

