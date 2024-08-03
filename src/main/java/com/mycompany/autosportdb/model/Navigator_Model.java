/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autosportdb.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Navigator")
//Клас Navigator_Model відповідає за представлення штурмана
public class Navigator_Model {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //ID штурмана
    @Column(name = "navigator_ID")
    private int navigatorID;
    //Ім'я штурмана
    @Column(name = "navigator_name")
    private String navigatorName;
    //Прізвише штурмана
    @Column(name = "navigator_surname")
    private String navigatorSurname;
    //Дата народження штурмана
    @Column(name = "navigator_date_birth")
    private LocalDate navigatorDateBirth;
    //Дата смерті штурмана
    @Column(name = "navigator_date_death")
    private LocalDate navigatorDateDeath;
    //Країна штурмана
    @Column(name = "navigator_country")
    private LocalDate navigatorCountry;
    
    //Ралійний болід штурмана
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rally_car_ID")
    private Rally_Car_Model rallycar;

    public Navigator_Model() {
    }

    //Функція отримання ID штурмана
    public int getNavigatorID() {
        return navigatorID;
    }

    //Функція встановлення ID штурмана
    public void setNavigatorID(int navigatorID) {
        this.navigatorID = navigatorID;
    }

    //Функція отримання імені штурмана
    public String getNavigatorName() {
        return navigatorName;
    }

    //Функція встановлення імені штурмана
    public void setNavigatorName(String navigatorName) {
        this.navigatorName = navigatorName;
    }

    //Функція отримання прізвища штурмана
    public String getNavigatorSurname() {
        return navigatorSurname;
    }

    //Функція встановлення прізвища штурмана
    public void setNavigatorSurname(String navigatorSurname) {
        this.navigatorSurname = navigatorSurname;
    }

    //Функція отримання дати народження штурмана
    public LocalDate getNavigatorDateBirth() {
        return navigatorDateBirth;
    }

    //Функція встановлення дати народження штурмана
    public void setNavigatorDateBirth(LocalDate navigatorDateBirth) {
        this.navigatorDateBirth = navigatorDateBirth;
    }

    //Функція отримання дати смерті штурмана
    public LocalDate getNavigatorDateDeath() {
        return navigatorDateDeath;
    }

    //Функція встановлення дати смерті штурмана
    public void setNavigatorDateDeath(LocalDate navigatorDateDeath) {
        this.navigatorDateDeath = navigatorDateDeath;
    }

    //Функція отримання країни штурмана
    public LocalDate getNavigatorCountry() {
        return navigatorCountry;
    }

    //Функція встановлення країни штурмана
    public void setNavigatorCountry(LocalDate navigatorCountry) {
        this.navigatorCountry = navigatorCountry;
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
