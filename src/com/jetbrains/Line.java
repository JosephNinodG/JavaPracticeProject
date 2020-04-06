package com.jetbrains;

public class Line {
    private float line_id;
    private float name;
    private float colour;
    private float stripe;

    public Line(String[] rowData){
        line_id = Float.parseFloat(rowData[0]);
        name = Float.parseFloat(rowData[1]);
        colour = Float.parseFloat(rowData[2]);
        stripe = Float.parseFloat(rowData[3]);
    }

    public void setLineId(float line_id) { this.line_id = line_id; }

    public float getLineId() { return line_id; }

    public void setName(float name) { this.name = name; }

    public float getName() { return name; }

    public void setColour(float colour) { this.colour = colour; }

    public float getColour() { return colour; }

    public void setStripe(float stripe) { this.stripe = stripe; }

    public float getStripe() { return stripe; }

}
