package models;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;



public class Post {
    private String content;
    private static ArrayList<Post> instances = new ArrayList<>();
    private boolean published;
    private LocalDateTime createdAt;
    private int id;



    public Post (String content){
        this.content = content;
        this.published = false;
        this.createdAt = LocalDateTime.now();
        instances.add(this);
        this.id = instances.size();
        id = instances.size(); //I’m never null of zero. How come?
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }


    public boolean getPublished() {
        return this.published;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public static Post findById(int id){
        return instances.get(id-1); //why minus 1? See if you can figure it out.
    }

    public int getId() {
        return id;
    }


    public void update(String content) {
        this.content = content;
    }

    public void deletePost(){
        instances.remove(id-1); //same reason
    }




}
