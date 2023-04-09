package controllers;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import models.Id;
import org.json.simple.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

// makes map of
public class IdController {
    private HashMap<String, Id> allIds;
    Id myId;
    ObjectMapper objectMapper = new ObjectMapper();
    private ArrayList<Id> idList = new ArrayList<>()   ;

    public ArrayList<Id> getIds(String input) throws JsonProcessingException {
        this.idList = objectMapper.readValue(input, new TypeReference<ArrayList<Id>>() {
        });
        return idList;
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