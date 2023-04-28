package org.howard.edu.lsp.finalproblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    // Key is the genre, HashSet contains associated songs 
    private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
    
    // Add a song title to a genre 
    public void addSong(String genre, String songTitle) {
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<String>());
        }
        map.get(genre).add(songTitle);
    }
    
    // Return the Set that contains all songs for a genre 
    public Set<String> getSongs(String genre) {
        if (map.containsKey(genre)) {
            return map.get(genre);
        } else {
            return new HashSet<String>();
        }
    }
    
    // Return genre, i.e., jazz, given a song title 
    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            String genre = entry.getKey();
            HashSet<String> songs = entry.getValue();
            if (songs.contains(songTitle)) {
                return genre;
            }
        }
        return null;
    }
}

