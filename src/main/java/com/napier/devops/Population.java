package com.napier.devops;

public class Population {

    /**
     * Country Name
     */
    private String name;

    /**
     * Country Population
     */
    private int population;

    /**
     * People population of Country who is living in the cities
     */
    private int countryPopulation;

    /**
     * Continent Name
     */
    private String continent;
    /**
     * Region Name
     */
    private String region;
    /**
     * Total Population for city
     */
    private int cityPopulation;

    /**
     * People population of Country who is not living in the cities with percent
     */
    private float notLivingPer;

    /**
     * People population of Country who is living in the cities percent
     */
    private float livingPer;

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
     * setter method for people population who is living in cities
     */
    public void setCountryPopulation(int CountryPopulation){ this.countryPopulation=CountryPopulation;}

    /**
     * getter method for people population who is living in cities with percent
     */
    public float getLivingPer(){
        return livingPer;
    }

    /**
     * setter method for people population who is living in cities with percent
     */
    public void setLivingPer(float livingPer){
        this.livingPer=livingPer;}

    /**
     * getter method for people population who is not in cities
     */
    public int getCityPopulation(){
        return cityPopulation;
    }

    /**
     * setter method for people population who is not living in cities
     */
    public void setCityPopulation(int cityPopulation){ this.cityPopulation=cityPopulation;}

    /**
     * getter method for people population who is not in cities with percent
     */
    public float getNotLivingPer(){
        return notLivingPer;
    }

    /**
     * setter method for people population who is not in cities with percent
     */
    public void setNotLivingPer(float notLivingPer){
        this.notLivingPer=notLivingPer;}
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
