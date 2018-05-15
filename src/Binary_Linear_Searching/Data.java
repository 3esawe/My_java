package Binary_Linear_Searching;

public class Data {
    private String name ;
    private String album;
    private int dur;

    public Data(String name, String album, int dur) {
        this.name = name;
        this.album = album;
        this.dur = dur;
    }

    public String getName() {
        return name;
    }

    public String getAlbum() {
        return album;
    }

    public int getDur() {
        return dur;
    }
}
