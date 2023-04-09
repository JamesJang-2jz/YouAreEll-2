package controllers;

import models.Id;

import java.util.ArrayList;
import java.util.List;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;
    private List<Id> list;

    public TransactionController(MessageController m, IdController j) {}

    public List<Id> getIds() {
        list = new ArrayList<>();
//        list.add(idCtrl.getIds())
        return list;
    }
    public String postId(String idtoRegister, String githubName) {
        Id tid = new Id(idtoRegister, githubName);
        tid = idCtrl.postId(tid);
        return ("Id registered.");
    }

    public String makecall(String s, String get, String s1) {

        return null;
    }
}
