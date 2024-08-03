/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autosportdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Victory")
//Клас Navigator_Model відповідає за представлення штурмана  1
public class Pilot_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //ID штурмана
    @Column(name = "pilot_ID")
    private int pilotID;
    //Ім'я штурмана
    @Column(name = "pilot_name")
    private String pilotName;
    //Прізвише штурмана
    @Column(name = "pilot_surname")
    private String pilotSurname;
    //Дата народження штурмана
    @Column(name = "pilot_date_birth")
    private LocalDate pilotDateBirth;
    //Дата смерті штурмана
    @Column(name = "pilot_date_death")
    private LocalDate pilotDateDeath;
    //Країна штурмана
    @Column(name = "pilot_country")
    private LocalDate pilotCountry;
    
    //Ралійний болід штурмана
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rally_car_ID")
    private Rally_Car_Model rallycar;
    
    public Pilot_Model() {
    }

    //Функція отримання ID штурмана
    public int getPilotID() {
        return pilotID;
    }

    //Функція встановлення ID штурмана
    public void setPilotID(int pilotID) {
        this.pilotID = pilotID;
    }

    //Функція отримання імені штурмана
    public String getPilotName() {
        return pilotName;
    }

    //Функція встановлення імені штурмана
    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    //Функція отримання прізвища штурмана
    public String getPilotSurname() {
        return pilotSurname;
    }

    //Функція встановлення прізвища штурмана
    public void setPilotSurname(String pilotSurname) {
        this.pilotSurname = pilotSurname;
    }

    //Функція отримання дати народження штурмана
    public LocalDate getPilotDateBirth() {
        return pilotDateBirth;
    }

    //Функція встановлення дати народження штурмана
    public void setPilotDateBirth(LocalDate pilotDateBirth) {
        this.pilotDateBirth = pilotDateBirth;
    }

    //Функція отримання дати смерті штурмана
    public LocalDate getPilotDateDeath() {
        return pilotDateDeath;
    }

    //Функція встановлення дати смерті штурмана
    public void setPilotDateDeath(LocalDate pilotDateDeath) {
        this.pilotDateDeath = pilotDateDeath;
    }

    //Функція отримання країни штурмана
    public LocalDate getPilotCountry() {
        return pilotCountry;
    }

    //Функція встановлення країни штурмана
    public void setNavigatorCountry(LocalDate pilotCountry) {
        this.pilotCountry = pilotCountry;
    }

    //Функція отримання ID ралійного боліду
    public Rally_Car_Model getRallycar() {
        return rallycar;
    }

    //Функція встановлення ID ралійного боліду
    public void setRallycar(Rally_Car_Model rallycar) {
        this.rallycar = rallycar;
    }
}
