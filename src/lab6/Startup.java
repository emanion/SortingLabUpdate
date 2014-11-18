
package lab6;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import static java.util.Calendar.MONTH;

/**
 *
 * @author emanion
 */
public class Startup {
    
    public static void main(String[] args) {
        
        List<Song> songs = new ArrayList<>();
        
        LocalDate releaseDate1 = LocalDate.of(1955,Month.MAY,10);
        Song song1 = new Song("Splish Spash","johnny rocket",releaseDate1,2.2);
        LocalDate releaseDate2 = LocalDate.of(1964,Month.JUNE,22);
        Song song2 = new Song("Folsom Prison","johnny cash",releaseDate2,3.5);
        LocalDate releaseDate3 = LocalDate.of(1997,Month.APRIL,12);
        Song song3 = new Song("Striped Sweater","SpongeBob",releaseDate3,1.0);
        LocalDate releaseDate4 = LocalDate.of(1939,Month.SEPTEMBER,03);
        Song song4 = new Song("Over the rainbow","Judy Garland",releaseDate4,4.6);
        
        
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        
        System.out.println("Songs in unsorted order");
        for (Song song:songs){
            System.out.println(song);
        }
        
        
        
        System.out.println("\nNow here are the values sorted by alternate "
                + "(ReleaseDate), but NO dupes removed...");
        //Collections.sort(songs, new SongByReleaseDate());
        //Collections.sort(songs, new SongByLength());
        for(Song song : songs) {
            System.out.println(song);
        }
        
        
        
        
    }
    
    
    
}
