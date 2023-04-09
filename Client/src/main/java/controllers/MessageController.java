package controllers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;
import models.Message;

public class MessageController {
    private ArrayList<Message> msgList = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();
    private HashSet<Message> messagesSeen;
    // why a HashSet??

    public ArrayList<Message> getMessages(String input) throws JsonProcessingException {
        this.msgList = objectMapper.readValue(input, new TypeReference<ArrayList<Message>>() {
    });
        return msgList;
    }
    public ArrayList<Message> getMessagesForId(Id Id) {
        return null;
    }
    public Message getMessageForSequence(String seq) {
        return null;
    }
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, Message msg) {
        return null;
    }
 
}