package com.napier.devops;

public class Population {
    /**
     * Continent Name
     */
    private String continent;
    /**
     * Region Name
     */
    private String region;
    /**
     * City Name
     */
    private String city;
    /**
     * Total Population for country
     */
    private int countrypopulation;
    /**
     * Total Population for city
     */
    private int citypopulation;

    //getter method for continent
    public String getContinent(){
        return continent;
    }
    //setter method for continent
    public void setContinent(String continent){
        this.continent=continent;
    }

    //getter method for region
    public String getRegion(){
        return region;
    }
    //setter method for region
    public void setRegion(String region){
        this.region=region;
    }

    //getter method for city
    public String getCity(){
        return city;
    }
    //setter method for city
    public void setCity(String city){
        this.city=city;
    }

    //getter method for country population
    public int getCountryPopulation(){
        return countrypopulation;
    }
    //setter method for country population
    public void setCountryPopulation(int countrypopulation){
        this.countrypopulation=countrypopulation;
    }

    //getter method for city population
    public int getCityPopulation(){ return citypopulation; }
    //setter method for city population
    public void setCityPopulation(int citypopulation){
        this.citypopulation=citypopulation;
    }

}