package com.napier.devops;

public class Language {
    /**
     * Variable for getting country name
     */
    private String countryname;

    /**
     * Variable for getting Language
     */
    private String language;

    /**
     * Variable for Population
     */
    private int population;

    /**
     * Create set function for getting Country Name form database
     */
    public void setCountryname(String countryname){ this.countryname=countryname; }

    /**
     * Create get function for Country Name
     */
    public String getCountryname(){return countryname;}

    /**
     * Create set function for getting Country Languages form database
     */
    public void setLanguage(String language){ this.language=language; }

    /**
     * Create get function for Country Name
     */
    public String getLanguage(){return language;}

    /**
     * Create set function for getting Country Name form database
     */
    public void setLanguagePopulation(int population){ this.population=population; }

    /**
     * Create get function for Country Name
     */
    public int getLanguagePopulation(){return population;}
}
