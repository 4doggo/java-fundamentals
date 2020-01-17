package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void randomizerTest() {

        for (int i = 0; i < 1000; i++){
            int random = App.randomizer(3);
            assertTrue(random< 3);
            assertTrue(random> -1);
        }
    }

    @Test
    public void stringCreated(){

        URL url = null;
        try{
            url = new URL("http://ron-swanson-quotes.herokuapp.com/v2/quotes");
        } catch(MalformedURLException e){
            System.out.println("the URL format not formatted correctly");
            return;
        }

        try{
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            String currentLine = in.readLine();
            while(currentLine != null){
                System.out.println(currentLine);
                currentLine = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("The Internet no work");
            e.printStackTrace();
        }



    }

}
