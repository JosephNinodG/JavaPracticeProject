package com.jetbrains;

public class Line {
    private float line_id;
    private String name;
    private String colour;
    private String stripe;

    public Line(String[] rowData){
        line_id = Float.parseFloat(rowData[0]);
        name = rowData[1];
        colour = rowData[2];
        stripe = rowData[3];
    }

    public void setLineId(float line_id) { this.line_id = line_id; }

    public float getLineId() { return line_id; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setColour(String colour) { this.colour = colour; }

    public String getColour() { return colour; }

    public void setStripe(String stripe) { this.stripe = stripe; }

    public String getStripe() { return stripe; }

}
