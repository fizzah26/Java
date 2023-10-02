public class Music {
    private String title;
    private String artist;
    private String duration;
    private String albumName;
    private Date releaseDate;
    private String genre;

    Music(String title, String artist, String duration, String albumName, Date releaseDate, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public String getAlbumName() {
        return albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String toString(){
        String musicDetails=String.format("%10s |%8s |%5s |%6s |%12s |%-14s",title,artist,duration,albumName,releaseDate,genre);
        return musicDetails;
    }
}
