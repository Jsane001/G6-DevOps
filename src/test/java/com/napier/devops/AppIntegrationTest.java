package com.napier.devops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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
        assertNotNull(countryWorld);
        //Check countryWorld is not null
        assertEquals("CHN", countryWorld.get(0).getCode());
        assertEquals("China", countryWorld.get(0).getName());
        assertEquals("Asia", countryWorld.get(0).getContinent());
        assertEquals("Eastern Asia", countryWorld.get(0).getRegion());
        assertEquals(1277558000, countryWorld.get(0).getPopulation());
        assertEquals("Peking", countryWorld.get(0).getCapital());
        app.printCountryWorld(countryWorld, "CountryWorld.md");
    }

    @Test
    void testGetCountryContinent()
    {
        ArrayList<Country> countryContinent = app.getCountryContinent();
        //Check countryContinent is not null
        if (countryContinent != null)
        {
            assertEquals("CHN", countryContinent.get(0).getCode());
            assertEquals("China", countryContinent.get(0).getName());
            assertEquals("Asia", countryContinent.get(0).getContinent());
            assertEquals("Eastern Asia", countryContinent.get(0).getRegion());
            assertEquals(1277558000, countryContinent.get(0).getPopulation());
            assertEquals("Peking", countryContinent.get(0).getCapital());
        }
        app.printCountryContinent(countryContinent, "CountryContinent.md");
    }

    @Test
    void testGetCountryRegion()
    {
        ArrayList<Country> countryRegion = app.getCountryRegion();
        //Check countryRegion is not null
        if (countryRegion != null) {
            assertEquals("IND", countryRegion.get(0).getCode());
            assertEquals("India", countryRegion.get(0).getName());
            assertEquals("Asia", countryRegion.get(0).getContinent());
            assertEquals("Southern and Central Asia", countryRegion.get(0).getRegion());
            assertEquals(1013662000, countryRegion.get(0).getPopulation());
            assertEquals("New Delhi", countryRegion.get(0).getCapital());
        }
        app.printCountryRegion(countryRegion, "CountryRegion.md");
    }

    @Test
    void testTopCountryWorld()
    {
        ArrayList<Country> topCountryWorld = app.getTopCountryWorld();
        //Check topCountryWorld is not null
        if (topCountryWorld != null)
        {
            assertEquals("CHN", topCountryWorld.get(0).getCode());
            assertEquals("China", topCountryWorld.get(0).getName());
            assertEquals("Asia", topCountryWorld.get(0).getContinent());
            assertEquals("Eastern Asia", topCountryWorld.get(0).getRegion());
            assertEquals(1277558000, topCountryWorld.get(0).getPopulation());
            assertEquals("Peking", topCountryWorld.get(0).getCapital());
        }
        app.printTopCountryWorld(topCountryWorld, "TopCountryWorld.md");
    }

    @Test
    void testTopCountryContinent()
    {
        ArrayList<Country> topCountryContinent = app.getTopCountryContinent();
        //Check topCountryContinent is not null
        if (topCountryContinent != null)
        {
            assertEquals("CHN", topCountryContinent.get(0).getCode());
            assertEquals("China", topCountryContinent.get(0).getName());
            assertEquals("Asia", topCountryContinent.get(0).getContinent());
            assertEquals("Eastern Asia", topCountryContinent.get(0).getRegion());
            assertEquals(1277558000, topCountryContinent.get(0).getPopulation());
            assertEquals("Peking", topCountryContinent.get(0).getCapital());
        }
        app.printTopCountryContinent(topCountryContinent, "TopCountryContinent.md");
    }

    @Test
    void testTopCountryRegion()
    {
        ArrayList<Country> topCountryRegion = app.getTopCountryRegion();
        //Check topCountryRegion is not null
        if (topCountryRegion != null){
            assertEquals("NGA", topCountryRegion.get(0).getCode());
            assertEquals("Nigeria", topCountryRegion.get(0).getName());
            assertEquals("Africa", topCountryRegion.get(0).getContinent());
            assertEquals("Western Africa", topCountryRegion.get(0).getRegion());
            assertEquals(111506000, topCountryRegion.get(0).getPopulation());
            assertEquals("Abuja", topCountryRegion.get(0).getCapital());
        }
        app.printTopCountryRegion(topCountryRegion, "TopCountryRegion.md");
    }

    @Test
    void testGetCityWorld()
    {
        ArrayList<City> cityWorld = app.getCityWorld();
        //Check cityWorld is not null
        if (cityWorld != null){
            assertEquals("Mumbai (Bombay)", cityWorld.get(0).getName());
            assertEquals("India", cityWorld.get(0).getCountryCode());
            assertEquals("Maharashtra", cityWorld.get(0).getDistrict());
            assertEquals(10500000, cityWorld.get(0).getPopulation());
        }
        app.printCityWorld(cityWorld, "CityWorld.md");
    }

    @Test
    void testGetCityContinent()
    {
        ArrayList<City> cityContinent = app.getCityContinent();
        //Check cityContinent is not null
        if (cityContinent != null){
            assertEquals("Mumbai (Bombay)", cityContinent.get(0).getName());
            assertEquals("India", cityContinent.get(0).getCountryCode());
            assertEquals("Maharashtra", cityContinent.get(0).getDistrict());
            assertEquals(10500000, cityContinent.get(0).getPopulation());
        }
        app.printCityContinent(cityContinent);
    }

    @Test
    void testGetCityRegion()
    {
        ArrayList<City> cityRegion = app.getCityRegion();
        //Check cityContinent is not null
        if (cityRegion != null){
            assertEquals("La Habana", cityRegion.get(0).getName());
            assertEquals("Cuba", cityRegion.get(0).getCountryCode());
            assertEquals("La Habana", cityRegion.get(0).getDistrict());
            assertEquals(2256000, cityRegion.get(0).getPopulation());
        }
        app.printCityRegion(cityRegion);
    }

    @Test
    void testGetCityCountry()
    {
        ArrayList<City> cityCountry = app.getCityCountry();
        //Check cityCountry is not null
        if (cityCountry != null){
            assertEquals("Rangoon (Yangon)", cityCountry.get(0).getName());
            assertEquals("Myanmar", cityCountry.get(0).getCountryCode());
            assertEquals("Rangoon [Yangon]", cityCountry.get(0).getDistrict());
            assertEquals(3361700, cityCountry.get(0).getPopulation());
        }
        app.printCityCountry(cityCountry);
    }

    @Test
    void testGetCityDistrict()
    {
        ArrayList<City> cityDistrict = app.getCityDistrict();
        //Check cityDistrict is not null
        if (cityDistrict != null){
            assertEquals("Salvador", cityDistrict.get(0).getName());
            assertEquals("Brazil", cityDistrict.get(0).getCountryCode());
            assertEquals("Bahia", cityDistrict.get(0).getDistrict());
            assertEquals(2302832, cityDistrict.get(0).getPopulation());
        }
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

    @Test
    void testGetWorldPopulation()
    {
        ArrayList<Population> populationList = app.getWorldPopulation();
        app.printWorldPopulation(populationList);
    }

    @Test
    void testGetAllContinentPopulation()
    {
        ArrayList<Population> populationList = app.getAllContinentPopulation();
        app.printAllContinentPopulation(populationList);
    }

    @Test
    void testGetAllRegionPopulation()
    {
        ArrayList<Population> populationList = app.getAllRegionPopulation();
        app.printAllRegionPopulation(populationList);
    }

    @Test
    void testGetCountryPopulation()
    {
        ArrayList<Population> populationList = app.getCountryPopulation();
        app.printCountryPopulation(populationList);
    }

    @Test
    void testGetCityPopulation()
    {
        ArrayList<Population> populationList = app.getCityPopulation();
        app.printCityPopulation(populationList);
    }

    @Test
    void testGetAllDistrictPopulation()
    {
        ArrayList<Population> populationList = app.getAllDistrictPopulation();
        app.printAllDistrictPopulation(populationList);
    }

    @Test
    void testGetLanguage()
    {
        app.getLanguage();
    }

}