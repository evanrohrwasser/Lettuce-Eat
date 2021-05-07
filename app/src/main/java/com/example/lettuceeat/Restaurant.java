package com.example.lettuceeat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Double> ratings; // could make a hashmap to better delete based on user id, or certain criteria
    private Double average;
    private Double sum;



    public void Rating() {
        average = 0.0;
        sum = 0.0;
        ratings = new ArrayList<Double>();
    }

    public Double getRating() {
        return average;
    }

    // adds a rating to the list, if a full recalc is desired recalc == true;
    // otherwise a fast calculation will be done.
    public void addRating(Double rating, boolean recalc) {
        ratings.add(rating);
        if (recalc) {
            recalcRating();
        } else {
            sum = +rating;
            average = sum / ratings.size();
        }
    }

    // recalculates the rating buy iterating through the ratings list
    public void recalcRating() {
        sum = 0.0;
        average = 0.0;
        for (int i = 0; i < ratings.size(); i++) {
            sum += ratings.get(i);
        }
        average = sum / ratings.size();
    }
}
