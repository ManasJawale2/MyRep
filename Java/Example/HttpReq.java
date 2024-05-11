import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpReq {
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("https://India");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpURLConnection connection = url.op
    }
}
