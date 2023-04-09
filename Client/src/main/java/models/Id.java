package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * POJO for an Id object
 */
public class Id {

    private String uid = "";
    private String name = "";
    private String github = "";

    @JsonCreator
    public Id(
            @JsonProperty("userid") String userid,
            @JsonProperty("name") String name,
            @JsonProperty("github") String github)
    {
        this.name = name;
        this.github = github;
        this.uid = userid;

    }
    public Id (String name, String githubId) {
        this.name = name;
        this.github = githubId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.github + ") ";
    }
}