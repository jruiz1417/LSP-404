package org.howard.edu.lsp.finalproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
    }

    @Test
    void testAddSong() {
        db.addSong("Pop", "Shallow");
        Set<String> expected = new HashSet<>();
        expected.add("Shallow");
        assertEquals(expected, db.getSongs("Pop"));
    }

    @Test
    void testGetSongs() {
        Set<String> expected = new HashSet<>();
        expected.add("Savage");
        expected.add("Gin and Juice");
        assertEquals(expected, db.getSongs("Rap"));
    }

    @Test
    void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Smooth"));
    }
}

