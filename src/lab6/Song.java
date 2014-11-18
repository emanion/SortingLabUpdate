package lab6;

import lab5.*;
import lab4.*;
import common.*;
import java.time.*;
import java.util.Objects;

public class Song implements Comparable<Song> {
    
    private String title;
    private String artist;
    private LocalDate releaseDate;
    private double runTime;

    public Song(String title, String artist, LocalDate releaseDate, 
            double runTime) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.runTime = runTime;
    }

    public Song() {
    }

    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.title);
        hash = 89 * hash + Objects.hashCode(this.artist);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + 
                ", releaseDate=" + releaseDate + ", runTime=" + runTime + '}';
    }

    @Override
    public int compareTo(Song song) {
        
        //compareTo rulse...  1. title and 2. artist
        
        
       // use STRING compareTo function
       int titleCompareTo = getTitle().compareTo(song.getTitle());
       int artistCompareTo = getArtist().compareTo(song.getArtist());
       
       if (titleCompareTo == 0){
           return artistCompareTo;
       } else {
           return titleCompareTo;
       }
       
           
        
        
    }
    
    
    
    
    
    
    
}
