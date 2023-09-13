package exercises.linkedlist;

public class Song {
    private double duration;
    private String title;

    public Song(String title, double duration) {
        this.duration = duration;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
