package com.napier.devops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        app.printCountryWorld(null, "CountryWorld.md");
    }

    @Test
    void printCountryWorldTestEmpty()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        app.printCountryWorld(countryWorld, "CountryWorld.md");
    }

    @Test
    void printCountryWorldContainsNull()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        countryWorld.add(null);
        app.printCountryWorld(countryWorld, "CountryWorld.md");
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
        app.printCountryWorld(countryWorld, "CountryWorld.md");
    }

    @Test
    void printCountryContinentNull()
    {
        app.printCountryContinent(null, "CountryContinent.md");
    }

    @Test
    void printCountryContinentTestEmpty()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        app.printCountryContinent(countryWorld, "CountryContinent.md");
    }

    @Test
    void printCountryContinentContainsNull()
    {
        ArrayList<Country> countryWorld = new ArrayList<>();
        countryWorld.add(null);
        app.printCountryContinent(countryWorld, "CountryContinent.md");
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
        app.printCountryWorld(countryWorld, "CountryWorld.md");
    }

    @Test
    void printCountryRegionNull()
    {
        app.printCountryRegion(null, "CountryRegion.md");
    }

    @Test
    void printCountryRegionTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printCountryRegion(countryList, "CountryRegion.md");
    }

    @Test
    void printCountryRegionContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printCountryRegion(countryList, "CountryRegion.md");
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
        app.printCountryRegion(countryList, "CountryRegion.md");
    }

    @Test
    void printTopCountryWorldNull()
    {
        app.printTopCountryWorld(null, "TopCountryWorld.md");
    }

    @Test
    void printTopCountryWorldTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printTopCountryWorld(countryList, "TopCountryWorld.md");
    }

    @Test
    void printTopCountryWorldContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printTopCountryWorld(countryList, "TopCountryWorld.md");
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
        app.printTopCountryWorld(countryList, "TopCountryWorld.md");
    }

    @Test
    void printTopCountryContinentNull()
    {
        app.printTopCountryContinent(null, "TopCountryContinent.md");
    }

    @Test
    void printTopCountryContinentTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printTopCountryContinent(countryList, "TopCountryContinent.md");
    }

    @Test
    void printTopCountryContinentContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printTopCountryContinent(countryList, "TopCountryContinent.md");
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
        app.printTopCountryContinent(countryList, "TopCountryContinent.md");
    }

    @Test
    void printTopCountryRegionNull()
    {
        app.printTopCountryRegion(null, "TopCountryRegion.md");
    }

    @Test
    void printTopCountryRegionTestEmpty()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        app.printTopCountryRegion(countryList, "TopCountryRegion.md");
    }

    @Test
    void printTopCountryRegionContainsNull()
    {
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(null);
        app.printTopCountryRegion(countryList, "TopCountryRegion.md");
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
        app.printTopCountryRegion(countryList, "TopCountryRegion.md");
    }

    @Test
    void printCityWorldNull()
    {
        app.printCityWorld(null, "CityWorld.md");
    }

    @Test
    void printCityWorldTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityWorld(cityList, "CityWorld.md");
    }

    @Test
    void printCityWorldContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityWorld(cityList, "CityWorld.md");
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
        app.printCityWorld(cityList, "CityWorld.md");
    }

    @Test
    void printCityRegionNull()
    {
        app.printCityRegion(null, "CityRegion.md");
    }

    @Test
    void printCityRegionTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityRegion(cityList, "CityRegion.md");
    }

    @Test
    void printCityRegionContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityRegion(cityList, "CityRegion.md");
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
        app.printCityRegion(cityList, "CityRegion.md");
    }

    @Test
    void printCityContinentNull()
    {
        app.printCityContinent(null, "CityContinent.md");
    }

    @Test
    void printCityContinentTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityContinent(cityList, "CityContinent.md");
    }

    @Test
    void printCityContinentContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityContinent(cityList, "CityContinent.md");
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
        app.printCityContinent(cityList, "CityContinent.md");
    }

    @Test
    void printCityCountryNull()
    {
        app.printCityCountry(null , "CityCountry.md");
    }

    @Test
    void printCityCountryTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityCountry(cityList, "CityCountry.md");
    }

    @Test
    void printCityCountryContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityCountry(cityList, "CityCountry.md");
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
        app.printCityCountry(cityList, "CityCountry.md");
    }

    @Test
    void printCityDistrictNull()
    {
        app.printCityDistrict(null, "CityDistrict.md");
    }

    @Test
    void printCityDistrictTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printCityDistrict(cityList, "CityDistrict.md");
    }

    @Test
    void printCityDistrictContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printCityDistrict(cityList, "CityDistrict.md");
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
        app.printCityDistrict(cityList, "CityDistrict.md");
    }
    //PopulationWorld
    @Test
    void printTopCityWorldNull()
    {
        app.printTopCityWorld(null, "TopCityWorld.md");
    }

    @Test
    void printTopCityWorldTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityWorld(cityList, "TopCityWorld.md");
    }

    @Test
    void printTopCityWorldContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityWorld(cityList, "TopCityWorld.md");
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
        app.printTopCityWorld(cityList, "TopCityWorld.md");
    }

    //PopulationContinent
    @Test
    void printTopCityContinentNull()
    {
        app.printTopCityContinent(null, "TopCityContinent.md");
    }

    @Test
    void printTopCityContinentTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityContinent(cityList, "TopCityContinent.md");
    }

    @Test
    void printTopCityContinentContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityContinent(cityList, "TopCityContinent.md");
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
        app.printTopCityContinent(cityList, "TopCityContinent.md");
    }

    //PopulationRegion
    @Test
    void printTopCityRegionNull()
    {
        app.printTopCityRegion(null, "TopCityRegion.md");
    }

    @Test
    void printTopCityRegionTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityRegion(cityList, "TopCityRegion.md");
    }

    @Test
    void printTopCityRegionContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityRegion(cityList, "TopCityRegion.md");
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
        app.printTopCityRegion(cityList, "TopCityRegion.md");
    }

    //PopulationCountry
    @Test
    void printTopCityCountryNull()
    {
        app.printTopCityCountry(null, "TopCityCountry.md");
    }

    @Test
    void printTopCityCountryTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityCountry(cityList, "TopCityCountry.md");
    }

    @Test
    void printTopCityCountryContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityCountry(cityList, "TopCityCountry.md");
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
        app.printTopCityCountry(cityList, "TopCityCountry.md");
    }

    //PopulationDistrict
    @Test
    void printTopCityDistrictNull()
    {
        app.printTopCityDistrict(null, "TopCityDistrict.md");
    }

    @Test
    void printTopCityDistrictTestEmpty()
    {
        ArrayList<City> cityList = new ArrayList<>();
        app.printTopCityDistrict(cityList, "TopCityDistrict.md");
    }

    @Test
    void printTopCityDistrictContainsNull()
    {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(null);
        app.printTopCityDistrict(cityList, "TopCityDistrict.md");
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
        app.printTopCityDistrict(cityList, "TopCityDistrict.md");
    }

    //PopulationCapital
    @Test
    void printCapitalWorldNull()
    {
        app.printCapitalWorld(null,null);
    }

    @Test
    void printCapitalWorldTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printCapitalWorld(capitalList,"CapitalWorld.md");
    }

    @Test
    void printCapitalWorldContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printCapitalWorld(capitalList,"CapitalWorld.md");
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
        app.printCapitalWorld(capitalList,"CapitalWorld.md");
    }

    //PopulationContinent
    @Test
    void printCapitalContinentNull()
    {
        app.printCapitalContinent(null,null);
    }

    @Test
    void printCapitalContinentTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printCapitalContinent(capitalList,"CapitalContinent.md");
    }

    @Test
    void printCapitalContinentContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printCapitalContinent(capitalList,"CapitalContinent.md");
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
        app.printCapitalContinent(capitalList,"CapitalContinent.md");
    }

    //PopulationRegion
    @Test
    void printCapitalRegionNull()
    {
        app.printCapitalRegion(null,null);
    }

    @Test
    void printCapitalRegionTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printCapitalRegion(capitalList,"CapitalRegion.md");
    }

    @Test
    void printCapitalRegionContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printCapitalRegion(capitalList,"CapitalRegion.md");
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
        app.printCapitalRegion(capitalList,"CapitalRegion.md");
    }

    //PopulationWorld
    @Test
    void printTopCapitalWorldNull()
    {
        app.printTopCapitalWorld(null,null);
    }

    @Test
    void printTopCapitalWorldTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printTopCapitalWorld(capitalList,"CapitalTopWorld.md");
    }

    @Test
    void printTopCapitalWorldContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printTopCapitalWorld(capitalList,"CapitalTopWorld.md");
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
        app.printTopCapitalWorld(capitalList,"CapitalTopWorld.md");
    }

    //Population Continent
    @Test
    void printTopCapitalContinentNull()
    {
        app.printTopCapitalContinent(null,null);
    }

    @Test
    void printTopCapitalContinentTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printTopCapitalContinent(capitalList,"CapitalTopContinent.md");
    }

    @Test
    void printTopCapitalContinentContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printTopCapitalContinent(capitalList,"CapitalTopContinent.md");
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
        app.printTopCapitalContinent(capitalList,"CapitalTopContinent.md");
    }

    //Population Capital
    @Test
    void printTopCapitalRegionNull()
    {
        app.printTopCapitalRegion(null,null);
    }

    @Test
    void printTopCapitalRegionTestEmpty()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        app.printTopCapitalRegion(capitalList,"CapitalTopRegion.md");
    }

    @Test
    void printTopCapitalRegionContainsNull()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        capitalList.add(null);
        app.printTopCapitalRegion(capitalList,"CapitalTopRegion.md");
    }

    @Test
    void printTopCapitalRegion()
    {
        ArrayList<Capital_City> capitalList = new ArrayList<>();
        Capital_City capital = new Capital_City();
        capital.setName("Saint John??s ");
        capital.setCountry("Antigua and Barbuda ");
        capital.setPopulation(24000 );
        capitalList.add(capital);
        app.printTopCapitalRegion(capitalList,"CapitalTopRegion.md");
    }

    //Population Region
    @Test
    void printPopulationRegionNull()
    {
        app.printPopulationRegion(null, null);
    }

    @Test
    void printPopulationRegionTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printPopulationRegion(populationList,"PopulationRegion.md");
    }

    @Test
    void printPopulationRegionContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printPopulationRegion(populationList,"PopulationRegion.md");
    }

    @Test
    void printPopulationRegion()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population population = new Population();
        population.setName("Western Europe ");
        population.setCountryPopulation(183247600);
        population.setCityPopulation(45683298);
        populationList.add(population);
        app.printPopulationRegion(populationList,"PopulationRegion.md");
    }

    //Population Country
    @Test
    void printPopulationCountryNull()
    {
        app.printPopulationCountry(null, "CountryPopulation.md");
    }

    @Test
    void printPopulationCountryTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printPopulationCountry(populationList, "CountryPopulation.md");
    }

    @Test
    void printPopulationCountryContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printPopulationCountry(populationList, "CountryPopulation.md");
    }

    @Test
    void printPopulationCountry()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setName("Pitcairn");
        populations.setCountryPopulation(42);
        populations.setLivingPer(84);
        populations.setCityPopulation(8);
        populations.setNotLivingPer(16);
        populationList.add(populations);
        app.printPopulationCountry(populationList, "CountryPopulation.md");
    }

    //World Population
    @Test
    void printWorldPopulationNull()
    {
        app.printWorldPopulation(null, "WorldPopulation.md");
    }

    @Test
    void printWorldPopulationTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printWorldPopulation(populationList, "WorldPopulation.md");
    }

    @Test
    void printWorldPopulationContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printWorldPopulation(populationList, "WorldPopulation.md");
    }

    @Test
    void printWorldPopulation()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setWorldPopulation(553573);
        populationList.add(populations);
        app.printPopulationCountry(populationList, "CountryPopulation.md");
    }

    //All Continent Population
    @Test
    void printAllContinentPopulationNull()
    {
        app.printAllContinentPopulation(null, "AllContinentPopulation.md");
    }

    @Test
    void printAllContinentPopulationTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printAllContinentPopulation(populationList, "AllContinentPopulation.md");
    }

    @Test
    void printAllContinentPopulationContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printAllContinentPopulation(populationList, "AllContinentPopulation.md");
    }

    @Test
    void printAllContinentPopulation()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setName("Antarctica");
        populations.setWorldPopulation(0);
        populationList.add(populations);
        app.printAllContinentPopulation(populationList, "AllContinentPopulation.md");
    }

    //All Region Population
    @Test
    void printAllRegionPopulationNull()
    {
        app.printAllRegionPopulation(null, "AllRegionPopulation.md");
    }

    @Test
    void printAllRegionPopulationTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printAllRegionPopulation(populationList, "AllRegionPopulation.md");
    }

    @Test
    void printAllRegionPopulationContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printAllRegionPopulation(populationList, "AllRegionPopulation.md");
    }

    @Test
    void printAllRegionPopulation()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setName("Western Europe");
        populations.setWorldPopulation(183247600);
        populationList.add(populations);
        app.printAllRegionPopulation(populationList, "AllRegionPopulation.md");
    }

    //All Country Population
    @Test
    void printCountryPopulationNull()
    {
        app.printCountryPopulation(null, "CountryTotalPopulation.md");
    }

    @Test
    void printCountryPopulationTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printCountryPopulation(populationList, "CountryTotalPopulation.md");
    }

    @Test
    void printCountryPopulationContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printCountryPopulation(populationList, "CountryTotalPopulation.md");
    }

    @Test
    void printCountryPopulation()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setName("Pitcairn");
        populations.setWorldPopulation(553573);
        populationList.add(populations);
        app.printCountryPopulation(populationList, "CountryTotalPopulation.md");
    }

    //All City Population
    @Test
    void printCityPopulationNull()
    {
        app.printCityPopulation(null, "CityPopulation.md");
    }

    @Test
    void printCityPopulationTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printCityPopulation(populationList, "CityPopulation.md");
    }

    @Test
    void printCityPopulationContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printCityPopulation(populationList, "CityPopulation.md");
    }

    @Test
    void printCityPopulation()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setPopulationOfCityName("Shanghai");
        populations.setPopulationOfCity(9696300);
        populationList.add(populations);
        app.printCountryPopulation(populationList, "CountryTotalPopulation.md");
    }



    //All District Population
    @Test
    void printAllDistrictPopulationNull()
    {
        app.printAllDistrictPopulation(null, "AllDistrictPopulation.md");
    }

    @Test
    void printAllDistrictPopulationTestEmpty()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        app.printAllDistrictPopulation(populationList, "AllDistrictPopulation.md");
    }

    @Test
    void printAllDistrictPopulationContainsNull()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        populationList.add(null);
        app.printAllDistrictPopulation(populationList, "AllDistrictPopulation.md");
    }

    @Test
    void printAllDistrictPopulation()
    {
        ArrayList<Population> populationList = new ArrayList<>();
        Population populations = new Population();
        populations.setName("Abidjan");
        populations.setWorldPopulation(2500000);
        populationList.add(populations);
        app.printAllDistrictPopulation(populationList, "AllDistrictPopulation.md");
    }

    //All language over the world with percentage
    @Test
    void printLanguageNull()
    {
        app.printLanguage(null,0.0, "LanguagesList.md");
    }

    @Test
    void printLanguageTestEmpty()
    {
        ArrayList<Language> languagesList = new ArrayList<>();
        app.printLanguage(languagesList,0.0, "LanguagesList.md");
    }

    @Test
    void printLanguageContainsNull()
    {
        ArrayList<Language> languagesList = new ArrayList<>();
        languagesList.add(null);
        app.printLanguage(languagesList,0.0, "LanguagesList.md");
    }

    @Test
    void printLanguage()
    {
        ArrayList<Language> languagesList = new ArrayList<>();
        Language languages = new Language();
        languages.setLanguage("English");
        languages.setLanguagePopulation(459158800);
        languagesList.add(languages);
        app.printLanguage(languagesList,7.56, "LanguagesList.md");
    }
}