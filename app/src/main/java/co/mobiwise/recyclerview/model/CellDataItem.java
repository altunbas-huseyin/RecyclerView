package co.mobiwise.recyclerview.model;

import android.graphics.Color;

import java.io.Serializable;

/**
 * Created by mac on 09/04/15.
 */
public class CellDataItem implements Serializable {

    private String name;
    private int color;

    public CellDataItem(String name, String color) {
        this.name = name;
        this.color = Color.parseColor(color);
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }
}
