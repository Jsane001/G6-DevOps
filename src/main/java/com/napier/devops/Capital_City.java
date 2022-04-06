package com.napier.devops;

public class Capital_City {
    /**
     * Represent name of city
     */
    private String name;
    /**
     * Represent country name
     */
    private String country;
    /**
     * Represent population of city
     */
    private int population;

    //getter method for city name
    public String getName(){
        return name;
    }

    //setter method for city name
    public void setName(String name){
        this.name=name;
    }

    //getter method for country
    public String getCountry(){
        return country;
    }

    //setter method for country
    public void setCountry(String country){
        this.country=country;
    }

    //getter method for population
    public int getPopulation(){
        return population;
    }

    //setter method for population
    public void setPopulation(int population){
        this.population=population;
    }
}
