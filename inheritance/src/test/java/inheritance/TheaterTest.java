package inheritance;

import org.junit.Before;
import org.junit.Test;

import javax.annotation.concurrent.ThreadSafe;

import static org.junit.Assert.*;

public class TheaterTest {

    Theater seattleTheater;

    @Before
    public void setUp() {

    seattleTheater = new Theater("Classic Cinema",
            "Final Destination, Final Destination 2, Final Destination 3");
    }


    @Test
    public void testTheater(){

        assertEquals("Classic Cinema", seattleTheater.theaterTitle);
        assertEquals("Final Destination, Final Destination 2, Final Destination3", seattleTheater.allFilmsPlaying);

    }

    @Test
    public void testToString(){

        assertEquals("Theater name: Classic Cinema, All the films showing currently: Final Destination, Final Destination 2, Final Destination 3",
                "Theater name: " + seattleTheater.theaterTitle + ", All the films showing currently: " + seattleTheater.allFilmsPlaying);

    }

}