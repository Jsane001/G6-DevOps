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

    @Test
    void printCountryContinentNull()
    {
        app.printCountryContinent(null);
    }

    @Test
    void printCountryContinentTestEmpty()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        app.printCountryContinent(countryWorld);
    }

    @Test
    void printCountryContinentContainsNull()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        countryWorld.add(null);
        app.printCountryContinent(countryWorld);
    }

    @Test
    void printCountryContinent()
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

    @Test
    void printCountryRegionNull()
    {
        app.printCountryRegion(null);
    }

    @Test
    void printCountryRegionTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printCountryRegion(countryList);
    }

    @Test
    void printCountryRegionContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printCountryRegion(countryList);
    }

    @Test
    void printCountryRegion()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        Country country = new Country();
        country.setCode("MM");
        country.setName("Myanmar");
        country.setContinent("Asia");
        country.setRegion("Southeast Asia");
        country.setPopulation(1000);
        country.setCapital("Yangon");
        countryList.add(country);
        app.printCountryRegion(countryList);
    }

    @Test
    void printTopCountryWorldNull()
    {
        app.printTopCountryWorld(null);
    }

    @Test
    void printTopCountryWorldTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printTopCountryWorld(countryList);
    }

    @Test
    void printTopCountryWorldContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printTopCountryWorld(countryList);
    }

    @Test
    void printTopCountryWorld()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        Country country = new Country();
        country.setCode("MM");
        country.setName("Myanmar");
        country.setContinent("Asia");
        country.setRegion("Southeast Asia");
        country.setPopulation(1000);
        country.setCapital("Yangon");
        countryList.add(country);
        app.printTopCountryWorld(countryList);
    }

    @Test
    void printTopCountryContinentNull()
    {
        app.printTopCountryContinent(null);
    }

    @Test
    void printTopCountryContinentTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printTopCountryContinent(countryList);
    }

    @Test
    void printTopCountryContinentContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printTopCountryContinent(countryList);
    }

    @Test
    void printTopCountryContinentWorld()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        Country country = new Country();
        country.setCode("MM");
        country.setName("Myanmar");
        country.setContinent("Asia");
        country.setRegion("Southeast Asia");
        country.setPopulation(1000);
        country.setCapital("Yangon");
        countryList.add(country);
        app.printTopCountryContinent(countryList);
    }

    @Test
    void printTopCountryRegionNull()
    {
        app.printTopCountryRegion(null);
    }

    @Test
    void printTopCountryRegionTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printTopCountryRegion(countryList);
    }

    @Test
    void printTopCountryRegionContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printTopCountryRegion(countryList);
    }

    @Test
    void printTopCountryRegionWorld()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        Country country = new Country();
        country.setCode("MM");
        country.setName("Myanmar");
        country.setContinent("Asia");
        country.setRegion("Southeast Asia");
        country.setPopulation(1000);
        country.setCapital("Yangon");
        countryList.add(country);
        app.printTopCountryRegion(countryList);
    }

    @Test
    void printCityWorldNull()
    {
        app.printCityWorld(null);
    }

    @Test
    void printCityWorldTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityWorld(cityList);
    }

    @Test
    void printCityWorldContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityWorld(cityList);
    }

    @Test
    void printCityWorldWorld()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Myanmar");
        city.setCountryCode("Asia");
        city.setDistrict("Southeast Asia");
        city.setPopulation(1000);
        cityList.add(city);
        app.printCityWorld(cityList);
    }

    @Test
    void printCityRegionNull()
    {
        app.printCityRegion(null);
    }

    @Test
    void printCityRegionTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityRegion(cityList);
    }

    @Test
    void printCityRegionContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityRegion(cityList);
    }

    @Test
    void printCityRegionWorld()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Myanmar");
        city.setCountryCode("Asia");
        city.setDistrict("Southeast Asia");
        city.setPopulation(1000);
        cityList.add(city);
        app.printCityRegion(cityList);
    }

    @Test
    void printCityContinentNull()
    {
        app.printCityContinent(null);
    }

    @Test
    void printCityContinentTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityContinent(cityList);
    }

    @Test
    void printCityContinentContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityContinent(cityList);
    }

    @Test
    void printCityContinentWorld()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Myanmar");
        city.setCountryCode("Asia");
        city.setDistrict("Southeast Asia");
        city.setPopulation(1000);
        cityList.add(city);
        app.printCityContinent(cityList);
    }

    @Test
    void printCityCountryNull()
    {
        app.printCityCountry(null);
    }

    @Test
    void printCityCountryTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityCountry(cityList);
    }

    @Test
    void printCityCountryContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityCountry(cityList);
    }

    @Test
    void printCityCountryWorld()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Myanmar");
        city.setCountryCode("Asia");
        city.setDistrict("Southeast Asia");
        city.setPopulation(1000);
        cityList.add(city);
        app.printCityCountry(cityList);
    }

    @Test
    void printCityDistrictNull()
    {
        app.printCityDistrict(null);
    }

    @Test
    void printCityDistrictTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityDistrict(cityList);
    }

    @Test
    void printCityDistrictContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityDistrict(cityList);
    }

    @Test
    void printCityDistrictWorld()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Myanmar");
        city.setCountryCode("Asia");
        city.setDistrict("Southeast Asia");
        city.setPopulation(1000);
        cityList.add(city);
        app.printCityDistrict(cityList);
    }
}