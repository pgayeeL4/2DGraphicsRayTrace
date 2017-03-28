package edu.graphics.project.Model;

/**
 * Created by Pratik on 3/7/2017.
 */
public class Source {

    //light source intensity
    int intensity;

    public Source() {
        this.intensity = 0;
    }

    public Source(int initialIntensity) {
        this.intensity = initialIntensity;
    }

    //decays light intensity based on inverse aquare law
    public double calcIntensity(int distance) {
        return intensity/(distance*distance);
    }
}
