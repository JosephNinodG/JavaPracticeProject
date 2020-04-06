package com.jetbrains;

public class Connection {
    private float station1;
    private float station2;
    private float line_id;
    private float time;

    public Connection(String[] rowData){
        station1 = Float.parseFloat(rowData[0]);
        station2 = Float.parseFloat(rowData[1]);
        line_id = Float.parseFloat(rowData[2]);
        time = Float.parseFloat(rowData[3]);
    }

    public void setStation1(float station1) { this.station1 = station1; }

    public float getStation1() { return station1; }

    public void setStation2(float station2) { this.station2 = station2; }

    public float getStation2() { return station2; }

    public void setLineId(float line_id) { this.line_id = line_id; }

    public float getLineId() { return line_id; }

    public void setTime(float time) { this.time = time; }

    public float getTime() { return time; }
}
