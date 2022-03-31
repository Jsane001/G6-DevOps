package com.napier.devops;

/**
 * Represents City
 */
public class City {
    /**
     * Represent name of city
     */
    private String name;
    /**
     * Represent country code of city
     */
    private String countryCode;
    /**
     * Represent name of district
     */
    private String district;
    /**
     * Represent population of city
     */
    private int population;

    /**
     * getter method for city name
     */
    public String getName(){
        return name;
    }

    /**
     * setter method for city name
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * getter method for countryCode
     */
    public String getCountryCode(){
        return countryCode;
    }

    /**
     * setter method for countryCode
     */
    public void setCountryCode(String countryCode){
        this.countryCode=countryCode;
    }

    /**
     * getter method for district
     */
    public String getDistrict(){
        return district;
    }

    /**
     * setter method for district
     */
    public void setDistrict(String district){
        this.district=district;
    }

    /**
     * getter method for population
     */
    public int getPopulation(){
        return population;
    }

    /**
     * setter method for population
     */
    public void setPopulation(int population){
        this.population=population;
    }

}
