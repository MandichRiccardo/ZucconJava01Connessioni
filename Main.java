import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            URL cernHome = new URL("http://www.cern.ch/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}