package controllers;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.HashMap;


import models.Id;
import org.json.simple.JSONObject;

// makes map of
public class IdController {
    private HashMap<String, Id> allIds;
    Id myId;

    public ArrayList<Id> getIds() {
        HttpClient client;
        return null;
    }

    public Id postId(Id id) {
        // create json from id
        JSONObject json = new JSONObject();
        // call server, get json result Or error
        // result json to Id obj

        return null;
    }

    public Id putId(Id id) {
        return null;
    }
 
}