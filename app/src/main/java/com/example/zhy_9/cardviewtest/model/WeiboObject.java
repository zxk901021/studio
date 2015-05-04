package com.example.zhy_9.cardviewtest.model;

/**
 * Created by ZHY_9 on 2015/5/4.
 */
public class WeiboObject {
    private long id;
    private String name;
    private String title;
    private String text;
    private boolean isTerminated;

    public WeiboObject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isTerminated() {
        return isTerminated;
    }

    public void setIsTerminated(boolean isTerminated) {
        this.isTerminated = isTerminated;
    }
}
