package io.swagger.petstore.model;

import java.util.ArrayList;
import java.util.HashMap;

public class PetPojoNew {
    private String id;
    private String name;
    private HashMap<String,String> category;
    private String photoUrls;
    private HashMap <String,String> tag;
    private ArrayList<HashMap <String,String>> tags;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getCategory() {
        return category;
    }

    public void setCategory(HashMap<String, String> category) {
        this.category = category;
    }

    public String getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String photoUrls) {
        this.photoUrls = photoUrls;
    }

    public HashMap<String, String> getTag() {
        return tag;
    }

    public void setTag(HashMap<String, String> tag) {
        this.tag = tag;
    }

    public ArrayList<HashMap<String, String>> getTags() {
        return tags;
    }

    public void setTags(ArrayList<HashMap<String, String>> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
