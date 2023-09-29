package exercises.nestedclasses;

import exercises.linkedlist.Song;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Represents an album containing songs.
 */
public class Album {
    private String name, artist;
    private SongList songs;

    /**
     * Inner class representing a list of songs in the album.
     */
    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        /**
         * Adds a song to the list of songs in the album.
         *
         * @param song The song to be added.
         * @return True if the song was added successfully, false if the song already exists.
         */
        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        /**
         * Finds a song in the list by its title.
         *
         * @param title The title of the song to search for.
         * @return The found song or null if not found.
         */
        private Song findSong(String title) {
            for (Song _song : songs) {
                if (_song.getTitle().equalsIgnoreCase(title)) {
                    return _song;
                }
            }
            return null;
        }

        /**
         * Finds a song in the list by its track number.
         *
         * @param trackNumber The track number of the song to search for (starting from 1).
         * @return The found song or null if not found.
         */
        private Song findSong(int trackNumber) {
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }

    /**
     * Constructs an Album with the given name and artist.
     *
     * @param name   The name of the album.
     * @param artist The artist of the album.
     */
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    /**
     * Adds a song to the album.
     *
     * @param title    The title of the song.
     * @param duration The duration of the song in seconds.
     * @return True if the song was added successfully, false if the song already exists.
     */
    public boolean addSong(String title, double duration) {
        Song song = songs.findSong(title);
        if (song == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    /**
     * Adds a song from the album to a playlist by track number.
     *
     * @param trackNumber The track number of the song to add to the playlist (starting from 1).
     * @param playList    The playlist to add the song to.
     * @return True if the song was added to the playlist, false if the track number is invalid.
     */
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song song = songs.findSong(trackNumber);
        if (song != null) {
            playList.addLast(song);
            return true;
        }
        return false;
    }

    /**
     * Adds a song from the album to a playlist by song title.
     *
     * @param songTitle The title of the song to add to the playlist.
     * @param playList  The playlist to add the song to.
     * @return True if the song was added to the playlist, false if the song title is not found.
     */
    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = songs.findSong(songTitle);
        if (song != null) {
            playList.addLast(song);
            return true;
        }
        return false;
    }
}
