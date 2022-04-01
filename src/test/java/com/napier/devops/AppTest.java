package com.napier.devops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printCountryWorldTestNull()
    {
        app.printCountryWorld(null);
    }

    @Test
    void printCountryWorldTestEmpty()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        app.printCountryWorld(countryWorld);
    }

    @Test
    void printCountryWorldContainsNull()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        countryWorld.add(null);
        app.printCountryWorld(countryWorld);
    }

    @Test
    void printCountryWorld()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        Country country = new Country();
        country.setCode("MM");
        country.setName("Myanmar");
        country.setContinent("Asia");
        country.setRegion("Southeast Asia");
        country.setPopulation(1000);
        country.setCapital("Yangon");
        countryWorld.add(country);
        app.printCountryWorld(countryWorld);
    }

    //PopulationContinent
    @Test
    void printTopCapitalWorldNull()
    {
        app.printTopCapitalWorld(null);
    }

    @Test
    void printTopCapitalWorldTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printTopCapitalWorld(capitalList);
    }

    @Test
    void printTopCapitalWorldContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printTopCapitalWorld(capitalList);
    }

    @Test
    void printTopCapitalWorld()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        Capital_City capital = new Capital_City();
        capital.setName("Lima");
        capital.setCountry("Peru");
        capital.setPopulation(6464693);
        capitalList.add(capital);
        app.printTopCapitalWorld(capitalList);
    }

    //PopulationContinent
    @Test
    void printTopCapitalContinentNull()
    {
        app.printTopCapitalContinent(null);
    }

    @Test
    void printTopCapitalContinentTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printTopCapitalContinent(capitalList);
    }

    @Test
    void printTopCapitalContinentContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printTopCapitalContinent(capitalList);
    }

    @Test
    void printTopCapitalContinent()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        Capital_City capital = new Capital_City();
        capital.setName("Lima");
        capital.setCountry("Peru");
        capital.setPopulation(6464693);
        capitalList.add(capital);
        app.printTopCapitalContinent(capitalList);
    }

    //PopulationCapital
    @Test
    void printTopCapitalRegionNull()
    {
        app.printTopCapitalRegion(null);
    }

    @Test
    void printTopCapitalRegionTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printTopCapitalRegion(capitalList);
    }

    @Test
    void printTopCapitalRegionContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printTopCapitalRegion(capitalList);
    }

    @Test
    void printTopCapitalRegion()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        Capital_City capital = new Capital_City();
        capital.setName("Saint John´s ");
        capital.setCountry("Antigua and Barbuda ");
        capital.setPopulation(24000 );
        capitalList.add(capital);
        app.printTopCapitalRegion(capitalList);
    }

    //PopulationRegion
    @Test
    void printPopulationRegionNull()
    {
        app.printPopulationRegion(null);
    }

    @Test
    void printPopulationRegionTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printPopulationRegion(populationList);
    }

    @Test
    void printPopulationRegionContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printPopulationRegion(populationList);
    }

    @Test
    void printPopulationRegion()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population population = new Population();
        population.setRegion("Western Europe ");
        population.setCountryPopulation(183247600);
        population.setCityPopulation(45683298);
        populationList.add(population);
        app.printPopulationRegion(populationList);
    }

    //Population Country
    @Test
    void printPopulationCountryNull()
    {
        app.printPopulationCountry(null);
    }

    @Test
    void printPopulationCountryTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printPopulationCountry(populationList);
    }

    @Test
    void printPopulationCountryContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printPopulationCountry(populationList);
    }

    @Test
    void printPopulationCountry()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setName("Pitcairn");
        populations.setPopulation(50);
        populations.setCountryPopulation(42);
        populations.setLivingPer(84);
        populations.setCityPopulation(8);
        populations.setNotLivingPer(16);
        populationList.add(populations);
        app.printPopulationCountry(populationList);
    }

}