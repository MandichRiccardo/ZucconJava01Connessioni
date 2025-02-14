import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            URL cernHome = new URL("http://www.cern.ch/");
            HttpURLConnection cernHomeConnection = (HttpURLConnection) cernHome.openConnection();
            InputStream in = cernHomeConnection.getInputStream();
            byte[] data = new byte[1024];
            try {
                in.read(data);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            for(byte b : data){
                if(b!=0) System.out.print((char) b);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}