package com.napier.devops;

public class Population {
    /**
     * City Name
     */
    private String name;
    /**
     * Total Population
     */
    private String population;
    /**
     * People Living in City
     */
    private String living;
    /**
     * People Not Living People in City
     */
    private String nonliving;

    //getter method for city name
    public String getName(){
        return name;
    }

    //getter method for population
    public String getPopulation(){
        return population;
    }

    //getter method for living people in city
    public String getLiving(){
        return living;
    }

    //getter method for people not living in city
    public String getNonliving(){
        return nonliving;
    }

}