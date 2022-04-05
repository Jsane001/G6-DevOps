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
     * Continent Name
     */
    private String continent;
    /**
     * Region Name
     */
    private String region;
    /**
     * Total Population for country
     */
    private int countryPopulation;
    /**
     * Total Population for city
     */
    private int cityPopulation;

    /**
     * getter method for name
     */
    public String getName(){
        return name;
    }

    /**
     * setter method for name
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * getter method for country population that is to calculate for world population
     */
    public long getWorldPopulation(){
        return worldPopulation;
    }

    /**
     * setter method for country population that is to calculate for world population
     */
    public void setWorldPopulation(long WorldPopulation){ this.worldPopulation=WorldPopulation;}

    /**
     * getter method for continent
     */
    public String getContinent(){
        return continent;
    }

    /**
     * setter method for continent
     */
    public void setContinent(String continent){
        this.continent=continent;
    }

    /**
     * getter method for region
     */
    public String getRegion(){
        return region;
    }

    /**
     * setter method for region
     */
    public void setRegion(String region){
        this.region=region;
    }

    /**
     * getter method for country population
     */
    public int getCountryPopulation(){
        return countryPopulation;
    }

    /**
     * setter method for country population
     */
    public void setCountryPopulation(int countryPopulation){
        this.countryPopulation=countryPopulation;
    }

    /**
     * getter method for city population
     */
    public int getCityPopulation(){ return cityPopulation; }

    /**
     * setter method for city population
     */
    public void setCityPopulation(int cityPopulation){
        this.cityPopulation=cityPopulation;
    }

}