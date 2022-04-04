package com.napier.devops;

public class Language {
    /**
     * Variable for getting country name
     */
    String countryname;

    /**
     * Variable for getting Language
     */
    String language;

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
}
