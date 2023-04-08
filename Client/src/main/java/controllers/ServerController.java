package controllers;//import spiffyUrlManipulator

import models.Id;

public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085";

    private static ServerController svr = new ServerController();
    // was not static before ^^
    private JsonString json;
    private ServerController() {}

    public static ServerController shared() {
        return svr;
    }

    public JsonString idGet() {
        return json;
        // url -> /ids/
        // send the server a get with url
        // return json from server
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