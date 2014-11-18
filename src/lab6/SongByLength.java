package lab6;

import java.util.Comparator;
import lab1.Song;
//import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * This Comparator implementation offers an alternate way to sort
 * Employee entities -- by LastName
 * 
 * @author jlombardo
 */
public class SongByLength implements Comparator<Song> {

    public int compare(Song s1, Song s2) {
        
        if (s1.getRunTime()< s2.getRunTime()){
            return -1;
        } else if (s1.getRunTime() == s2.getRunTime()){
            return 0;
        } else {
            return 1;
        }
        
        
        
//        return new CompareToBuilder()
//            .append(s1.getLengthSeconds(), s2.getLengthSeconds())
//            .toComparison();
    }
}
