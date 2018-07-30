package com.example.student.recycleview;

public class RecyclerItem {
    private int imgId;
    private String description;

    RecyclerItem(int imgId, String description) {
        this.imgId = imgId;
        this.description = description;
    }

    public int getImgId() {

        return imgId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
