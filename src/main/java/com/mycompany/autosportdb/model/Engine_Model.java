/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autosportdb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Engine")
//Клас Engine_Model відповідає за представлення двигуна ралійного боліду
public class Engine_Model {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "engine_ID")
    //Ідентифікаційний код двигуна
    private int engineID;
    @Column(name = "engine_value")
    //Об'єм двигуна
    private float engineValue;
    @Column(name = "engine_cylinders")
    //Кількість циліндрів двигуна
    private int engineCylinders;
    @Column(name = "engine_type")
    //Тип двигуна
    private String engineType;
    @Column(name = "engine_horsepowers")
    //Тип двигуна
    private String engineHorsePowers;
    @Column(name = "engine_torque")
    //Тип двигуна
    private String engineTorque;

    public int getEngineID() {
        return engineID;
    }

    public void setEngineID(int engineID) {
        this.engineID = engineID;
    }

    public float getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(float engineValue) {
        this.engineValue = engineValue;
    }

    public int getEngineCylinders() {
        return engineCylinders;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineHorsePowers() {
        return engineHorsePowers;
    }

    public void setEngineHorsePowers(String engineHorsePowers) {
        this.engineHorsePowers = engineHorsePowers;
    }

    public String getEngineTorque() {
        return engineTorque;
    }

    public void setEngineTorque(String engineTorque) {
        this.engineTorque = engineTorque;
    }
    
    
}
