package com.jetbrains;

public class Station {
    private float id;
    private float latitude;
    private float longitude;
    private float name;
    private float display_name;
    private float zone;
    private float total_lines;
    private float rail;

    public Station(String[] rowData){
        id = Float.parseFloat(rowData[0]);
        latitude = Float.parseFloat(rowData[1]);
        longitude = Float.parseFloat(rowData[2]);
        name = Float.parseFloat(rowData[3]);
        display_name = Float.parseFloat(rowData[4]);
        zone = Float.parseFloat(rowData[5]);
        total_lines = Float.parseFloat(rowData[6]);
        rail = Float.parseFloat(rowData[7]);
    }

    public void setId(float id) { this.id = id; }

    public float getId() { return id; }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLatitude(){
        return latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLongitude(){
        return longitude;
    }

    public void setName(float name) { this.name = name; }

    public float getName() { return name; }

    public void setDisplayName(float display_name) { this.display_name = display_name; }

    public float getDisplayName() { return display_name; }

    public void setZone(float zone) { this.zone = zone; }

    public float getZone() { return zone; }

    public void setTotalLines(float total_lines) { this.total_lines = total_lines; }

    public float getTotalLines() { return total_lines; }

    public void setRail(float rail) { this.rail = rail; }

    public float getRail() { return rail; }


}
