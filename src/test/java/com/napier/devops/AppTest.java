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
    //PopulationWorld
    @Test
    void printTopCityWorldNull()
    {
        app.printTopCityWorld(null);
    }

    @Test
    void printTopCityWorldTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityWorld(cityList);
    }

    @Test
    void printTopCityWorldContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityWorld(cityList);
    }

    @Test
    void printTopCityWorld()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("New York");
        city.setCountryCode("United States");
        city.setDistrict("New York");
        city.setPopulation(8008278);
        cityList.add(city);
        app.printTopCityWorld(cityList);
    }

    //PopulationContinent
    @Test
    void printTopCityContinentNull()
    {
        app.printTopCityContinent(null);
    }

    @Test
    void printTopCityContinentTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityContinent(cityList);
    }

    @Test
    void printTopCityContinentContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityContinent(cityList);
    }

    @Test
    void printTopCityContinent()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Teheran");
        city.setCountryCode("Iran");
        city.setDistrict("Teheran");
        city.setPopulation(6758845);
        cityList.add(city);
        app.printTopCityContinent(cityList);
    }

    //PopulationRegion
    @Test
    void printTopCityRegionNull()
    {
        app.printTopCityRegion(null);
    }

    @Test
    void printTopCityRegionTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityRegion(cityList);
    }

    @Test
    void printTopCityRegionContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityRegion(cityList);
    }

    @Test
    void printTopCityRegion()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Ahmedabad");
        city.setCountryCode("India");
        city.setDistrict("Gujarat");
        city.setPopulation(2876710);
        cityList.add(city);
        app.printTopCityRegion(cityList);
    }

    //PopulationCountry
    @Test
    void printTopCityCountryNull()
    {
        app.printTopCityCountry(null);
    }

    @Test
    void printTopCityCountryTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityCountry(cityList);
    }

    @Test
    void printTopCityCountryContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityCountry(cityList);
    }

    @Test
    void printTopCityCountry()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Mergui (Myeik)");
        city.setCountryCode("Myanmar");
        city.setDistrict("Tenasserim [Tanintha");
        city.setPopulation(122700);
        cityList.add(city);
        app.printTopCityCountry(cityList);
    }

    //PopulationDistrict
    @Test
    void printTopCityDistrictNull()
    {
        app.printTopCityDistrict(null);
    }

    @Test
    void printTopCityDistrictTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityDistrict(cityList);
    }

    @Test
    void printTopCityDistrictContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityDistrict(cityList);
    }

    @Test
    void printTopCityDistrict()
    {
        ArrayList<City> cityList = new ArrayList<>();
        City city = new City();
        city.setName("Alagoinhas");
        city.setCountryCode("Brazil");
        city.setDistrict("Bahia");
        city.setPopulation(126820);
        cityList.add(city);
        app.printTopCityDistrict(cityList);
    }

    //PopulationCapital
    @Test
    void printCapitalWorldNull()
    {
        app.printCapitalWorld(null);
    }

    @Test
    void printCapitalWorldTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printCapitalWorld(capitalList);
    }

    @Test
    void printCapitalWorldContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printCapitalWorld(capitalList);
    }

    @Test
    void printCapitalWorld()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        Capital_City capital = new Capital_City();
        capital.setName("Adamstown");
        capital.setCountry("Pitcairn");
        capital.setPopulation(42);
        capitalList.add(capital);
        app.printCapitalWorld(capitalList);
    }

    //PopulationContinent
    @Test
    void printCapitalContinentNull()
    {
        app.printCapitalContinent(null);
    }

    @Test
    void printCapitalContinentTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printCapitalContinent(capitalList);
    }

    @Test
    void printCapitalContinentContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printCapitalContinent(capitalList);
    }

    @Test
    void printCapitalContinent()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        Capital_City capital = new Capital_City();
        capital.setName("Bandar Seri Begawan");
        capital.setCountry("Brunei");
        capital.setPopulation(21484);
        capitalList.add(capital);
        app.printCapitalContinent(capitalList);
    }

    //PopulationRegion
    @Test
    void printCapitalRegionNull()
    {
        app.printCapitalRegion(null);
    }

    @Test
    void printCapitalRegionTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printCapitalRegion(capitalList);
    }

    @Test
    void printCapitalRegionContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printCapitalRegion(capitalList);
    }

    @Test
    void printCapitalRegion()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        Capital_City capital = new Capital_City();
        capital.setName("The Valley");
        capital.setCountry("Anguilla");
        capital.setPopulation(595);
        capitalList.add(capital);
        app.printCapitalRegion(capitalList);
    }

    //PopulationWorld
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