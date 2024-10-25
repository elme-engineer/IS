package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Media {
    
    private String id;
    private String title;
    private String date;        // TODO: melhor tipo para data
    private double rating;
    private boolean type;       //0: movie      1: tv show


    public void setId(String id) {
        this.id = id;
    }    

    public String getId(){
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }    

    public String getTitle(){
        return this.title;
    }

    public void setDate(String date) {
        this.date = date;
    }    

    public String getdate(){
        return this.date;
    }

    public void setTitle(double rating) {
        this.rating = rating;
    }    

    public double getRating(){
        return this.rating;
    }

    public void setType(boolean type) {
        this.type = type;
    }    

    public boolean getType(){
        return this.type;
    }
}
