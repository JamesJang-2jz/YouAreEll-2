package youareell;

import com.fasterxml.jackson.databind.JsonNode;
import controllers.*;
import kong.unirest.InputStreamPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.Unirest;
import models.Id;
import views.IdTextView;
import views.SimpleShell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;

public class YouAreEll {
    TransactionController tt;
    private String rootURL = "http://zipcode.rocks:8085";
    List<Id> ids;

    public YouAreEll (TransactionController t) {
        this.tt = t;
    }

    public YouAreEll (MessageController m, IdController j){
        this.tt = new TransactionController(m, j);
    }

    public static void main(String[] args) throws IOException {
        // hmm: is this Dependency Injection?
        YouAreEll urlhandler = new YouAreEll(
            new TransactionController(
                new MessageController(), new IdController()
        ));
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

    private String MakeURLCall(String page, String method, String s1) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(rootURL + page);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("GET response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String input;
            while ((input = in.readLine()) != null){
                sb.append(input);
            }
            in.close();
        }
        return sb.toString();
    }

    public String get_ids() throws IOException {
        return MakeURLCall("/ids", "GET", "");
    }
    public String get_messages() throws IOException {
        return MakeURLCall("/messages", "GET", "");
    }
    public String post_id() throws IOException {
        return MakeURLCall("/messages", "POST", "");
    }
    public String post_messages() throws IOException {
        return MakeURLCall("/messages", "POST", "");
    }


}
