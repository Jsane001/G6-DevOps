package com.napier.devops;

public class Population {

    /**
     * Country Name
     */
    private String name;

    /**
     * People population of Country that is to calculate for world population
     */
    private long worldPopulation;

    /**
     * People population of Country who is living in the cities
     */
    private int countryPopulation;

    /**
     * People population of Country who is not living in the cities with percent
     */
    private float notLivingPer;

    /**
     * People population of Country who is living in the cities percent
     */
    private float livingPer;

    /**
     * Total Population for city
     */
    private int cityPopulation;

    /**
     * getter method for name
     */
    public String getName(){ return name; }

    /**
     * setter method for name
     */
    public void setName(String name){ this.name=name; }

    /**
     * getter method for country population that is to calculate for world population
     */
    public long getWorldPopulation(){ return worldPopulation; }

    /**
     * setter method for country population that is to calculate for world population
     */
    public void setWorldPopulation(long WorldPopulation){ this.worldPopulation=WorldPopulation;}

    /**
     * getter method for country population
     */
    public int getCountryPopulation(){ return countryPopulation; }

    /**
     * setter method for people population who is living in cities
     */
    public void setCountryPopulation(int CountryPopulation){ this.countryPopulation=CountryPopulation;}

    /**
     * getter method for people population who is living in cities with percent
     */
    public float getLivingPer(){ return livingPer; }

    /**
     * setter method for people population who is living in cities with percent
     */
    public void setLivingPer(float livingPer){ this.livingPer=livingPer;}

    /**
     * getter method for people population who is not in cities with percent
     */
    public float getNotLivingPer(){ return notLivingPer; }

    /**
     * setter method for people population who is not in cities with percent
     */
    public void setNotLivingPer(float notLivingPer){ this.notLivingPer=notLivingPer;}

    /**
     * getter method for city population
     */
    public int getCityPopulation(){ return cityPopulation; }

    /**
     * setter method for city population
     */
    public void setCityPopulation(int cityPopulation){ this.cityPopulation=cityPopulation; }

}
