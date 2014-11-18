
package lab6;

import lab5.*;
import java.util.Comparator;

/**
 *
 * @author emanion
 */
public class SongByReleaseDate implements Comparator<Song> {

    
    public int compare(Song song1, Song song2){
        
        if (song1 == null)
                return -1;
        if (song2 == null)
                return +1;
                
        return song1.getReleaseDate().compareTo(song2.getReleaseDate());
      
            
     }
    
                
        
    
    
    
}
