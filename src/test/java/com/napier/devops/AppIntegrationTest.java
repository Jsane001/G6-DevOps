package com.napier.devops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

    }

    @Test
    void testGetCountryWorld()
    {
        ArrayList<Country> countryWorld = app.getCountryWorld();
        app.printCountryWorld(countryWorld);
    }

    @Test
    void testGetCountryContinent()
    {
        ArrayList<Country> countryContinent = app.getCountryContinent();
        app.printCountryContinent(countryContinent);
    }

    @Test
    void testGetCountryRegion()
    {
        ArrayList<Country> countryRegion = app.getCountryRegion();
        app.printCountryRegion(countryRegion);
    }

    @Test
    void testTopCountryWorld()
    {
        ArrayList<Country> topCountryWorld = app.getTopCountryWorld();
        app.printTopCountryWorld(topCountryWorld);
    }

    @Test
    void testTopCountryContinent()
    {
        ArrayList<Country> topCountryContinent = app.getTopCountryContinent();
        app.printTopCountryContinent(topCountryContinent);
    }

    @Test
    void testTopCountryRegion()
    {
        ArrayList<Country> topCountryRegion = app.getTopCountryRegion();
        app.printTopCountryRegion(topCountryRegion);
    }

    @Test
    void testGetCityWorld()
    {
        ArrayList<City> cityWorld = app.getCityWorld();
        app.printCityWorld(cityWorld);
    }

    @Test
    void testGetCityContinent()
    {
        ArrayList<City> cityContinent = app.getCityContinent();
        app.printCityContinent(cityContinent);
    }

    @Test
    void testGetCityRegion()
    {
        ArrayList<City> cityRegion = app.getCityRegion();
        app.printCityRegion(cityRegion);
    }

    @Test
    void testGetCityCountry()
    {
        ArrayList<City> cityCountry = app.getCityCountry();
        app.printCityCountry(cityCountry);
    }

    @Test
    void testGetCityDistrict()
    {
        ArrayList<City> cityDistrict = app.getCityDistrict();
        app.printCityDistrict(cityDistrict);
    }

    @Test
    void testGetTopCityWorld()
    {
        ArrayList<City> cityTopWorld = app.getTopCityWorld();
        app.printTopCityWorld(cityTopWorld);
    }

    @Test
    void testGetTopCityContinent()
    {
        ArrayList<City> cityTopContinent = app.getTopCityContinent();
        app.printTopCityContinent(cityTopContinent);
    }

    @Test
    void testGetTopCityRegion()
    {
        ArrayList<City> cityTopRegion = app.getTopCityRegion();
        app.printTopCityRegion(cityTopRegion);
    }

    @Test
    void testGetTopCityCountry()
    {
        ArrayList<City> cityTopCountry = app.getTopCityCountry();
        app.printTopCityCountry(cityTopCountry);
    }

    @Test
    void testGetTopCityDistrict()
    {
        ArrayList<City> cityTopDistrict = app.getTopCityDistrict();
        app.printTopCityDistrict(cityTopDistrict);
    }

    @Test
    void testGetCapitalWorld()
    {
        ArrayList<Capital_City> capitalWorld = app.getCapitalWorld();
        app.printCapitalWorld(capitalWorld);
    }

    @Test
    void testGetCapitalContinent()
    {
        ArrayList<Capital_City> capitalContinent = app.getCapitalContinent();
        app.printCapitalContinent(capitalContinent);
    }

    @Test
    void testGetCapitalRegion()
    {
        ArrayList<Capital_City> capitalRegion = app.getCapitalRegion();
        app.printCapitalRegion(capitalRegion);
    }

    @Test
    void testGetTopCapitalWorld()
    {
        ArrayList<Capital_City> capitalTopWorld = app.getTopCapitalWorld();
        app.printTopCapitalWorld(capitalTopWorld);
    }

    @Test
    void testGetTopCapitalContinent()
    {
        ArrayList<Capital_City> capitalTopContinent = app.getTopCapitalContinent();
        app.printTopCapitalContinent(capitalTopContinent);
    }

    @Test
    void testGetTopCapitalRegion()
    {
        ArrayList<Capital_City> capitalTopRegion = app.getTopCapitalRegion();
        app.printTopCapitalRegion(capitalTopRegion);
    }

    @Test
    void testGetPopulationRegion()
    {
        ArrayList<Population> populationRegion = app.getPopulationRegion();
        app.printPopulationRegion(populationRegion);
    }

    @Test
    void testGetPopulationCountry()
    {
        ArrayList<Population> populationCountry = app.getPopulationCountry();
        app.printPopulationCountry(populationCountry);
    }

}