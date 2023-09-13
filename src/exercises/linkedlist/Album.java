package exercises.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int numberOfSongInAlbum, LinkedList<Song> playList){
        if (numberOfSongInAlbum < songs.size()){
            playList.addLast(songs.get(numberOfSongInAlbum));
            return false;
        }
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList){
        Song song = findSong(songTitle);
        if (song != null){
            playList.addLast(song);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
}
