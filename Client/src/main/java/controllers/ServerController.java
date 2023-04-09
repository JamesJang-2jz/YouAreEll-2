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
    private String rootURL = "http://zipcode.rocks:8085";
    private ServerController svr = new ServerController();
    private ServerController() {}
    public ServerController shared() {
        return svr;
    }
    public JsonString idGet() throws IOException {
        // url -> /ids/
        // send the server a get with url
//        JsonString json = code;
//        JsonString json = url.getContent();
        // return json from server
        return null;
    }
    public JsonString idPost(Id input) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
        return null;
    }
    public JsonString idPut(Id input) {
        // url -> /ids/
        return null;
    }


}

// ServerController.shared.doGet()