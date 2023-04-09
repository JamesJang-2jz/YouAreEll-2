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
import java.util.Objects;

public class YouAreEll {
    TransactionController tt;
    private String rootURL = "http://zipcode.rocks:8085";

    private String uid = "";
    private String name = "";
    private String github = "";

    public YouAreEll (TransactionController t) {
        this.tt = t;
    }

    public YouAreEll (MessageController m, IdController j){
        this.tt = new TransactionController(m, j);
    }

    public static void main(String[] args) {
        // hmm: is this Dependency Injection?
        YouAreEll urlhandler = new YouAreEll(
            new TransactionController(
                new MessageController(), new IdController()
        ));
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

    private String MakeURLCall(String page, String get, String s1) {
        StringBuilder sb = new StringBuilder();
        if (Objects.equals(page, "ids")){
            tt.getIds();
        }
        return null;
    }

    public String get_ids() throws IOException {
            StringBuilder sb = new StringBuilder();
            ObjectMapper objectMapper = new ObjectMapper();
//        IdTextView idText = new IdTextView()
        URL url = new URL("http://zipcode.rocks:8085/ids");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("userid", uid);
        connection.setRequestProperty("name", name);
        connection.setRequestProperty("github", github);
        int responseCode = connection.getResponseCode();
        System.out.println("GET response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String input;
            while ((input = in.readLine()) != null){
                sb.append(input);
            }
            in.close();
            System.out.println(sb);
        }
//        connection.connect();


//        HttpResponse<JsonNode> response = (HttpResponse<JsonNode>) Unirest.get(rootURL + "ids").asJson();
//        YouAreEll url = mapper.readValue(("http://zipcode.rocks:8085/ids"), YouAreEll.class);
//        SimpleShell.prettyPrint(String.valueOf(url));

//        InputStream is = new URL("http://zipcode.rocks:8085").openStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
//        System.out.println(sb.toString());
//        return MakeURLCall("/ids", "GET", "");
        return sb.toString();
    }

    public String get_messages() throws MalformedURLException {
//        URL url = new URL("http://zipcode.rocks:8085");
        return MakeURLCall("/messages", "GET", "");
    }


}
