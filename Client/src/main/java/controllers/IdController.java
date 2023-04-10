package controllers;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import models.Id;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import static youareell.YouAreEll.post_id;

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

    public Id postId(Id id) throws IOException {
        // create json from id
        try {
            System.out.println("Checkpoint 1");
            String jsonString =  objectMapper.writeValueAsString(id);
            System.out.println("Checkpoint 2");
            post_id("/ids", jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        // call server, get json result Or error
        // result json to Id obj

        return null;
    }

    public Id putId(Id id) {
        return null;
    }
 
}