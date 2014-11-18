
package lab4;

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
        
        Set<Song> songs = new TreeSet<>();
        
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
        
        
        for (Song song:songs){
            System.out.println(song);
        }
        
        
        
        
        
        
        
    }
    
    
    
}
