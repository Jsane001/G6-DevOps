package com.napier.devops;

public class Country {
    /**
     * Country Code
     */
    public String code;

    /**
     * Country Name
     */
    public String name;

    /**
     * Country Continent
     */
    public String continent;

    /**
     * Country Region
     */
    public String region;

    /**
     * Country Population
     */
    public int population;

    /**
     * Country Capital
     */
    public int capital;

    //getter method for code
    public String getCode(){
        return code;
    }
    //setter method for code
    public void setCode(String code){
        this.code=code;
    }

    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }

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

    //getter method for population
    public int getPopulation(){
        return population;
    }
    //setter method for population
    public void setPopulation(int population){
        this.population=population;
    }

    //getter method for capital
    public int getCapital(){
        return capital;
    }
    //setter method for capital
    public void setCapital(int capital){
        this.capital=capital;
    }

}
