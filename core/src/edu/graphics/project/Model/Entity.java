package edu.graphics.project.Model;

/**
 * Created by Pratik on 3/7/2017.
 */
public class Entity {

    int height;
    int width;

    public Entity() {
        this.height = 0;
        this.width = 0;
    }

    public Entity(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return height * width;
    }
}
