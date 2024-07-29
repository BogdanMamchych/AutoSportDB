/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autosportdb.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RallyCar")
public class Rally_Car_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rally_car_ID")
    private int rallyCarID;
    private String make;
    private String model;
    private String type;
    @Column(name = "years_start")
    private int yearsStart;
    @Column(name = "years_end")
    private int yearsEnd;

    public int getRallyCarID() {
        return rallyCarID;
    }

    public void setRallyCarID(int rallyCarID) {
        this.rallyCarID = rallyCarID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearsStart() {
        return yearsStart;
    }

    public void setYearsStart(int yearsStart) {
        this.yearsStart = yearsStart;
    }

    public int getYearsEnd() {
        return yearsEnd;
    }

    public void setYearsEnd(int yearsEnd) {
        this.yearsEnd = yearsEnd;
    }
    
    
}
