package com.example.student.recycleview;

public class RecyclerItem {
    private String title;
    private int imgId;
    private String description;
    private int rating;
    private boolean isLiked;
    private String wikiUrl;

    public RecyclerItem(String title, int imgId, String description, int rating, String wikiUrl) {
        this.title = title;
        this.imgId = imgId;
        this.description = description;
        this.rating = rating;
        this.isLiked = false;
        this.wikiUrl = wikiUrl;
    }


    public String getTitle() {

        return title;
    }

    public int getImgId() {

        return imgId;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }
}
