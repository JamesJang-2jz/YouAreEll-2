package controllers;
//import spiffyUrlManipulator

import models.Id;
import javax.json.JsonString;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
public class ServerController {
    private final String rootURL = "http://zipcode.rocks:8085";
    private ServerController svr = new ServerController();
    // was not static before ^^
    private ServerController() {}
    public ServerController shared() {
        return svr;
    }
    public JsonString idGet() throws IOException {
        // url -> /ids/
        URL url = new URL(rootURL);
        // send the server a get with url
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
//        int code = connection.getResponseCode();
        int code = connection.getResponseCode();
//        JsonString json = code;
//        JsonString json = url.getContent();
        // return json from server
        return json;
    }
    public JsonString idPost(Id input) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
        return json;
    }
    public JsonString idPut(Id input) {
        // url -> /ids/
        return json;
    }


}

// ServerController.shared.doGet()