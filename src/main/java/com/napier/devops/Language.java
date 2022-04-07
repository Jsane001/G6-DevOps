package com.napier.devops;

public class Language {
    /**
     * Variable for getting Language
     */
    private String language;

    /**
     * Variable for Population
     */
    private int population;

    /**
     * Variable for world Population
     */
    private int worldpopulation;

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


    /**
     * Create set function for getting world population form database
     */
    public void setWorldPopulation(int worldpopulation){ this.worldpopulation=worldpopulation; }

    /**
     * Create get function for Country Name
     */
    public int getWorldpopulation(){return worldpopulation;}

}
