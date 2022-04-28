package com.napier.devops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.math.RoundingMode;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        if(args.length < 1){
            a.connect("localhost:33060", 0);
        }else{
            a.connect("db:3306", 30000);
        }

        ArrayList<Country> countryWorld = a.getCountryWorld();
        System.out.println(" \n ++++++++++++++++ 1. Countries organized by largest to smallest population in World  ++++++++++++++++ \n ");
        //Print list of Countries by largest population to smallest
        a.printCountryWorld(countryWorld, "CountryWorld.md");

        ArrayList<Country> countryContinent = a.getCountryContinent();
        System.out.println(" \n ++++++++++++++++ 2. Countries organized by largest to smallest population in Continent  ++++++++++++++++ \n ");
        //Print list of Countries by largest population to smallest in continent
        a.printCountryContinent(countryContinent);

        ArrayList<Country> countryRegion = a.getCountryRegion();
        System.out.println(" \n ++++++++++++++++ 3. Countries organized by largest to smallest population in Region  ++++++++++++++++ \n ");
        //Print list of Countries by largest population to smallest in region
        a.printCountryRegion(countryRegion);

        ArrayList<Country> topCountryWorld = a.getTopCountryWorld();
        System.out.println(" \n ++++++++++++++++ 4. Top 10 Populated Countries in World  ++++++++++++++++ \n ");
        //Print list of Countries by largest population to smallest
        a.printTopCountryWorld(topCountryWorld);

        ArrayList<Country> topCountryContinent = a.getTopCountryContinent();
        System.out.println(" \n ++++++++++++++++ 5. Top 10 Populated Countries in Continent  ++++++++++++++++ \n ");
        //Print Top 10 Populated Country List in Continent
        a.printTopCountryContinent(topCountryContinent);

        ArrayList<Country> topCountryRegion = a.getTopCountryRegion();
        System.out.println(" \n ++++++++++++++++ 6. Top 10 Populated Countries in Region  ++++++++++++++++ \n ");
        //Print Top 10 Populated Country List in Region
        a.printTopCountryRegion(topCountryRegion);

        ArrayList<City> cityWorld = a.getCityWorld();
        //Cities in the world organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 7.  List of cities in the world organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCityWorld(cityWorld);

        ArrayList<City> cityRegion = a.getCityRegion();
        //Cities in the region organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 8.  List of cities in the region organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCityRegion(cityRegion);

        ArrayList<City> cityContinent = a.getCityContinent();
        //Cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 9.  List of cities in the continent organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCityContinent(cityContinent, "CityContinent.md");

        ArrayList<City> cityCountry = a.getCityCountry();
        //Cities in the country organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 10.  List of cities in the country organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCityCountry(cityCountry, "CityCountry.md");

        ArrayList<City> cityDistrict = a.getCityDistrict();
        //Cities in the district organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 11.  List of cities in the district organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCityDistrict(cityDistrict, "CityDistrict.md");

        ArrayList<City> cityTopWorld = a.getTopCityWorld();
        //Cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 12.  Top 10 populated cities in World  ++++++++++++++++ \n ");
        a.printTopCityWorld(cityTopWorld);

        ArrayList<City> cityTopContinent = a.getTopCityContinent();
        //Cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 13.  Top 10 populated cities in continent  ++++++++++++++++ \n ");
        a.printTopCityContinent(cityTopContinent);

        ArrayList<City> cityTopRegion = a.getTopCityRegion();
        //Cities in the region organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 14.  Top 10 populated cities in region  ++++++++++++++++ \n ");
        a.printTopCityRegion(cityTopRegion);

        ArrayList<City> cityTopCountry = a.getTopCityCountry();
        //Cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 15.  Top 10 populated cities in country  ++++++++++++++++ \n ");
        a.printTopCityCountry(cityTopCountry);

        ArrayList<City> cityTopDistrict = a.getTopCityDistrict();
        //Cities in the district organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 16.  Top 10 populated cities in district  ++++++++++++++++ \n ");
        a.printTopCityDistrict(cityTopDistrict);

        ArrayList<Capital_City> capitalWorld = a.getCapitalWorld();
        //Capital cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 17.  List of capital city in the world organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCapitalWorld(capitalWorld);

        ArrayList<Capital_City> capitalContinent = a.getCapitalContinent();
        //Capital cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 18.  List of capital city in the continent organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCapitalContinent(capitalContinent);

        ArrayList<Capital_City> capitalRegion = a.getCapitalRegion();
        //Capital cities in the region organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 19.  List of capital city in the region organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCapitalRegion(capitalRegion);

        ArrayList<Capital_City> capitalTopWorld = a.getTopCapitalWorld();
        //Top 10 Capital cities in the world organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 20.  Top 10 capital city in the world organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printTopCapitalWorld(capitalTopWorld);

        ArrayList<Capital_City> capitalTopContinent = a.getTopCapitalContinent();
        //Top 10 Capital cities in the continent organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 21.  Top 10 capital city in the continent organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printTopCapitalContinent(capitalTopContinent);

        ArrayList<Capital_City> capitalTopRegion = a.getTopCapitalRegion();
        //Top 10 Capital cities in the region organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 22.  Top 10 capital city in the region organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printTopCapitalRegion(capitalTopRegion);

        ArrayList<Population> populationContinent = a.getPopulationContinent();
        System.out.println(" \n ++++++++++++++++ 23. The population of people living in cities and people not living in cities in each continent  ++++++++++++++++ \n ");
        //Print the population of people living in cities and people not living in cities in each continent
        a.printPopulationContinent(populationContinent);

        ArrayList<Population> populationRegion = a.getPopulationRegion();
        System.out.println(" \n ++++++++++++++++ 24. The population of people living in cities and people not living in cities in each region  ++++++++++++++++ \n ");
        //Print the population of people living in cities and people not living in cities in each region
        a.printPopulationRegion(populationRegion);

        // Country City
        ArrayList<Population> countryPopulation = a.getPopulationCountry();
        System.out.println(" \n ++++++++++++++++ 25.  Population of cities in the country with percentage  ++++++++++++++++ \n ");
        //Print the population of Country
        a.printPopulationCountry(countryPopulation, "CountryPopulation.md");

        ArrayList<Population> worldPopulation = a.getWorldPopulation();
        System.out.println(" \n ++++++++++++++++ 26. The population of the world  ++++++++++++++++ \n ");
        //Print the population of the world
        a.printWorldPopulation(worldPopulation, "WorldPopulation.md");

        ArrayList<Population> allContinentPopulation = a.getAllContinentPopulation();
        System.out.println(" \n ++++++++++++++++ 27. The population of a continent  ++++++++++++++++ \n ");
        //Print the population of a continent
        a.printAllContinentPopulation(allContinentPopulation, "AllContinentPopulation.md");

        ArrayList<Population> allRegionPopulation = a.getAllRegionPopulation();
        System.out.println(" \n ++++++++++++++++ 28. The population of a region  ++++++++++++++++ \n ");
        //Print the population of a region
        a.printAllRegionPopulation(allRegionPopulation, "AllRegionPopulation.md");

        // Country Population
        ArrayList<Population> countryTotalPopulation = a.getCountryPopulation();
        System.out.println(" \n ++++++++++++++++ 29.  Population of country  ++++++++++++++++ \n ");
        a.printCountryPopulation(countryTotalPopulation, "CountryTotalPopulation.md");

        // City Population
        ArrayList<Population> cityPopulation = a.getCityPopulation();
        System.out.println(" \n ++++++++++++++++ 30.  Population of cities  ++++++++++++++++ \n ");
        a.printCityPopulation(cityPopulation);

        ArrayList<Population> allDistrictPopulation = a.getAllDistrictPopulation();
        System.out.println(" \n ++++++++++++++++ 31. The population of a district  ++++++++++++++++ \n ");
        //Print the population of a district
        a.printAllDistrictPopulation(allDistrictPopulation);

        // language
        System.out.println(" \n ++++++++++++++++ 32. Using languages of the world  ++++++++++++++++ \n ");
        a.getLanguage();

        // Disconnect from database
        a.disconnect();
    }

    private Connection con = null;
    /**
     * Connection to MySQL database.
     */
    public void connect(String location, int delay) {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }
        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(delay);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + location
                                + "/world?allowPublicKeyRetrieval=true&useSSL=false",
                        "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /**
     * 1. Get list of Countries in the world organised by largest population to smallest
     * @return countryList
     */
    public ArrayList<Country> getCountryWorld() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                        +"FROM country, city "
                        +"WHERE country.Capital = city.ID ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countryList = new ArrayList<>();
            while (rest.next()) {
                Country country = new Country();
                country.setCode(rest.getString(1));
                country.setName(rest.getString(2));
                country.setContinent(rest.getString(3));
                country.setRegion(rest.getString(4));
                country.setPopulation(rest.getInt(5));
                country.setCapital(rest.getString(6));
                countryList.add(country);
            }
            return countryList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Countries by largest population to smallest in World");
            return null;
        }
    }

    /**
     * @param countryList
     * Print list of Countries in world organised by largest population to smallest
     */
    public void printCountryWorld(ArrayList<Country> countryList, String filename) {
        // Check countryList is not null
        if (countryList == null)
        {
            System.out.println("No Country");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("| Code | Name | Continent | Region | Population | Capital |\r\n");
        sb.append("| --- | --- | --- | --- | --- | --- |\r\n");
        // Loop over all countries in the list
        for (Country country : countryList) {
            if (country == null)
                continue;
            sb.append("| "+ country.getCode() + " | " + country.getName() + " | " + country.getContinent() + " | " + country.getRegion() + " | " + country.getPopulation() + " | " + country.getCapital() + " |\r\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2. Get list of countries in the continent organised by largest population to smallest
     * @return countryList
     */
    public ArrayList<Country> getCountryContinent() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID AND country.Continent ='Asia' ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countryList = new ArrayList<>();
            while (rest.next()) {
                Country country = new Country();
                country.setCode(rest.getString(1));
                country.setName(rest.getString(2));
                country.setContinent(rest.getString(3));
                country.setRegion(rest.getString(4));
                country.setPopulation(rest.getInt(5));
                country.setCapital(rest.getString(6));
                countryList.add(country);
            }
            return countryList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Countries by largest population to smallest in Continent");
            return null;
        }
    }

    /**
     * @param countryList
     * Print list of Countries in continent by largest population to smallest
     */
    public void printCountryContinent(ArrayList<Country> countryList) {
        // Check countryList is not null
        if (countryList == null)
        {
            System.out.println("No Country");
            return;
        }
        // Print header
        System.out.printf("%-10s %-25s %-10s %-35s %-15s %20s%n", "Code", "Name", "Continent", "Region", "Population", "Capital");
        // Loop over all countries in the list
        for (Country country : countryList) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-10s %-35s %-15s %20s",
                            country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital());
            System.out.println(cty_string);
        }
    }

    /**
     * 3. Get list of countries in region organised by largest population to smallest in region
     * @return countryList
     */
    public ArrayList<Country> getCountryRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID AND country.Region = 'Southern and Central Asia' ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countryList = new ArrayList<>();
            while (rest.next()) {
                Country country = new Country();
                country.setCode(rest.getString(1));
                country.setName(rest.getString(2));
                country.setContinent(rest.getString(3));
                country.setRegion(rest.getString(4));
                country.setPopulation(rest.getInt(5));
                country.setCapital(rest.getString(6));
                countryList.add(country);
            }
            return countryList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Countries by largest population to smallest in Region");
            return null;
        }
    }

    /**
     * @param countryList
     * Print list of Countries in region by largest population to smallest
     */
    public void printCountryRegion(ArrayList<Country> countryList) {
        // Check countryList is not null
        if (countryList == null)
        {
            System.out.println("No Country in Region");
            return;
        }
        // Print header
        System.out.printf("%-10s %-25s %-10s %-35s %-15s %20s%n", "Code", "Name", "Continent", "Region", "Population", "Capital");
        // Loop over all countries in the list
        for (Country country : countryList) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-10s %-35s %-15s %20s",
                            country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital());
            System.out.println(cty_string);
        }
    }

    /**
     * 4. Get top 10 countries in the world organised by largest population to smallest.
     * @return countryList
     */
    public ArrayList<Country> getTopCountryWorld() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID ORDER BY country.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countryList = new ArrayList<>();
            while (rest.next()) {
                Country country = new Country();
                country.setCode(rest.getString(1));
                country.setName(rest.getString(2));
                country.setContinent(rest.getString(3));
                country.setRegion(rest.getString(4));
                country.setPopulation(rest.getInt(5));
                country.setCapital(rest.getString(6));
                countryList.add(country);
            }
            return countryList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top 10 Countries by largest population to smallest in World");
            return null;
        }
    }

    /**
     * @param countryList
     * Print top 10 countries in the world organised by largest population to smallest
     */
    public void printTopCountryWorld(ArrayList<Country> countryList) {
        // Check countryList is not null
        if (countryList == null)
        {
            System.out.println("No Country");
            return;
        }
        // Print header
        System.out.printf("%-10s %-25s %-25s %-35s %-25s %10s%n", "Code", "Name", "Continent", "Region", "Population", "Capital");
        // Loop over all countries in the list
        for (Country country : countryList) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital());
            System.out.println(cty_string);
        }
    }

    /**
     * 5. Get Top 10 populated countries in continent list by largest population to smallest
     * @return countryList
     */
    public ArrayList<Country> getTopCountryContinent() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID AND country.Continent = 'Asia' ORDER BY country.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countryList = new ArrayList<>();
            while (rest.next()) {
                Country country = new Country();
                country.setCode(rest.getString(1));
                country.setName(rest.getString(2));
                country.setContinent(rest.getString(3));
                country.setRegion(rest.getString(4));
                country.setPopulation(rest.getInt(5));
                country.setCapital(rest.getString(6));
                countryList.add(country);
            }
            return countryList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top 10 Countries by largest population to smallest in Continent");
            return null;
        }
    }

    /**
     * @param countryList
     * Print list of top 10 populated countries in continent by largest population to smallest
     */
    public void printTopCountryContinent(ArrayList<Country> countryList) {
        // Check countryList is not null
        if (countryList == null)
        {
            System.out.println("No Country");
            return;
        }
        // Print header
        System.out.printf("%-10s %-25s %-25s %-35s %-25s %10s%n", "Code", "Name", "Continent", "Region", "Population", "Capital");
        // Loop over all countries in the list
        for (Country country : countryList) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital());
            System.out.println(cty_string);
        }
    }

    /**
     * 6. Get top 10 populated countries in region list by largest population to smallest
     * @return countryList
     */
    public ArrayList<Country> getTopCountryRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID AND country.Region = 'Western Africa' ORDER BY country.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countryList = new ArrayList<>();
            while (rest.next()) {
                Country country = new Country();
                country.setCode(rest.getString(1));
                country.setName(rest.getString(2));
                country.setContinent(rest.getString(3));
                country.setRegion(rest.getString(4));
                country.setPopulation(rest.getInt(5));
                country.setCapital(rest.getString(6));
                countryList.add(country);
            }
            return countryList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Top 10 Countries by largest population to smallest in Region");
            return null;
        }
    }

    /**
     * @param countryList
     * Print list of top 10 populated countries in region by largest population to smallest
     */
    public void printTopCountryRegion(ArrayList<Country> countryList) {
        // Check countryList is not null
        if (countryList == null)
        {
            System.out.println("No Country");
            return;
        }
        // Print header
        System.out.printf("%-10s %-25s %-25s %-35s %-25s %10s%n", "Code", "Name", "Continent", "Region", "Population", "Capital");
        // Loop over all countries in the list
        for (Country country : countryList) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital());
            System.out.println(cty_string);
        }
    }

    /**
     * 7. Get list of cities in the world organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getCityWorld() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in World");
            return null;
        }
    }

    /**
     * @param cityList
     * Show list of cities in the world organised by largest population to smallest
     */
    public void printCityWorld(ArrayList<City> cityList) {
        // Check countryList is not null
        if (cityList == null)
        {
            System.out.println("No City");
            return;
        }
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "Country", "District", "Population");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-30s %-10s %-20s %10s",
                            city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 8. Get list of cities in the region organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getCityRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Region = 'Caribbean' "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in region");
            return null;
        }
    }

    /**
     * @param cityList
     * Show list of cities in the region organised by largest population to smallest
     */
    public void printCityRegion(ArrayList<City> cityList) {
        // Check countryList is not null
        if (cityList == null)
        {
            System.out.println("No City");
            return;
        }
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "Country", "District", "Population");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-30s %-10s %-20s %10s",
                            city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 9. Get list of cities in the continent organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getCityContinent() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Continent = 'Asia' "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * @param cityList
     * Show list of city in the continent organised by largest population to smallest
     */
    public void printCityContinent(ArrayList<City> cityList, String filename) {
        // Check countryList is not null
        if (cityList == null)
        {
            System.out.println("No City");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("| Name | Country | District | Population |\r\n");
        sb.append("| --- | --- | --- | --- |\r\n");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            sb.append ("| "+ city.getName() +" | "+ city.getCountryCode() +" | "+ city.getDistrict() + " | "+ city.getPopulation() + " |\r\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 10. Get list of cities in the country organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getCityCountry() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Name = 'Myanmar' "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in country");
            return null;
        }
    }

    /**
     * @param cityList
     * Show list of city in the country organised by largest population to smallest
     */
    public void printCityCountry(ArrayList<City> cityList, String filename) {
        // Check countryList is not null
        if (cityList == null)
        {
            System.out.println("No City");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("| Name | Country | District | Population|\r\n");
        sb.append("| --- | --- | --- | --- |\r\n");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            sb.append("| "+ city.getName() +" | | "+ city.getCountryCode() + " | | "+ city.getDistrict() + " | | "+ city.getPopulation() + " |\r\n");
            try {
                new File("./reports/").mkdir();
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
                writer.write(sb.toString());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 11. Get list of cities in the district organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getCityDistrict() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND city.District = 'Bahia' "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get list of City by largest population to smallest in district");
            return null;
        }
    }

    /**
     * @param cityList
     * Show list of city in the district organised by largest population to smallest
     */
    public void printCityDistrict(ArrayList<City> cityList, String filename) {
        // Check countryList is not null
        if (cityList == null)
        {
            System.out.println("No City");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("| Name | Country | District | Population|\r\n");
        sb.append("| --- | --- | --- | --- |\r\n");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            sb.append("| "+ city.getName() +" | | "+ city.getCountryCode() + " | | "+ city.getDistrict() + " | | "+ city.getPopulation() + " |\r\n");
            try {
                new File("./reports/").mkdir();
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
                writer.write(sb.toString());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 12. Get top 10 cities in the world organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getTopCityWorld() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code "
                            + "ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 City by largest population to smallest in world");
            return null;
        }
    }

    /**
     * @param cityList
     * Show top 10 city in the world organised by largest population to smallest
     */
    public void printTopCityWorld(ArrayList<City> cityList) {
        // Check cityList is not null
        if (cityList == null)
        {
            System.out.println("No Population city");
            return;
        }
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "Country", "District", "Population");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-30s %-10s %-20s %10s",
                            city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 13. Get top 10 cities in the continent organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getTopCityContinent() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Continent = 'Asia' "
                            + "ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 City by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * @param cityList
     * Show top 10 city in the continent organised by largest population to smallest
     */
    public void printTopCityContinent(ArrayList<City> cityList) {
        // Check cityList is not null
        if (cityList == null)
        {
            System.out.println("No Population city");
            return;
        }
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "Country", "District", "Population");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-30s %-10s %-20s %10s",
                            city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 14. Get top 10 cities in the region organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getTopCityRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Region = 'Southern and Central Asia' "
                            + "ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 City by largest population to smallest in region");
            return null;
        }
    }

    /**
     * @param cityList
     * Show top 10 city in the region organised by largest population to smallest
     */
    public void printTopCityRegion(ArrayList<City> cityList) {
        // Check cityList is not null
        if (cityList == null)
        {
            System.out.println("No Population city");
            return;
        }
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "Country", "District", "Population");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-30s %-10s %-20s %10s",
                            city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 15. Get top 10 cities in the country organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getTopCityCountry() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Name = 'Myanmar'"
                            + "ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 City by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * @param cityList
     * Show top 10 city in the country organised by largest population to smallest
     */
    public void printTopCityCountry(ArrayList<City> cityList) {
        // Check cityList is not null
        if (cityList == null)
        {
            System.out.println("No Population city");
            return;
        }
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "Country", "District", "Population");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-30s %-10s %-20s %10s",
                            city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 16. Get top 10 cities in the district organised by largest population to smallest
     * @return cityList
     */
    public ArrayList<City> getTopCityDistrict() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND city.District = 'Bahia' "
                            + "ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString(1));
                city.setCountryCode(rest.getString(2));
                city.setDistrict(rest.getString(3));
                city.setPopulation(rest.getInt(4));
                cityList.add(city);
            }
            return cityList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 City by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * @param cityList
     * Show top 10 city in the district organised by largest population to smallest
     */
    public void printTopCityDistrict(ArrayList<City> cityList) {
        // Check cityList is not null
        if (cityList == null)
        {
            System.out.println("No Population city");
            return;
        }
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "Country", "District", "Population");
        // Loop over all city in the list
        for (City city : cityList) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-30s %-10s %-20s %10s",
                            city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 17. Get list of capital city in the world organised by largest population to smallest
     * @return countryList
     */
    public ArrayList<Capital_City> getCapitalWorld() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Capital_City> capitalList = new ArrayList<>();
            while (rest.next()) {
                Capital_City capital = new Capital_City();
                capital.setName(rest.getString(1));
                capital.setCountry(rest.getString(2));
                capital.setPopulation(rest.getInt(3));
                capitalList.add(capital);
            }
            return capitalList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city by largest population to smallest in world");
            return null;
        }
    }

    /**
     * @param capitalList
     * Print list of capital city in world by largest population to smallest
     */
    public void printCapitalWorld(ArrayList<Capital_City> capitalList) {
        // Check capitalList is not null
        if (capitalList == null)
        {
            System.out.println("No Population capital");
            return;
        }
        // Print header
        System.out.printf("%-30s %-25s %-10s%n", "Capital", "Name", "Population");
        // Loop over all countries in the list
        for (Capital_City capital : capitalList) {
            if (capital == null)
                continue;
            String cty_string =
                    String.format("%-30s %-25s %-10s",
                            capital.getName(), capital.getCountry(), capital.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 18. Get list of capital city in the continent organised by largest population to smallest
     * @return countryList
     */
    public ArrayList<Capital_City> getCapitalContinent() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID AND country.Continent ='Asia' ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Capital_City> capitalList = new ArrayList<>();
            while (rest.next()) {
                Capital_City capital = new Capital_City();
                capital.setName(rest.getString(1));
                capital.setCountry(rest.getString(2));
                capital.setPopulation(rest.getInt(3));
                capitalList.add(capital);
            }
            return capitalList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city by largest population to smallest in Continent");
        return null;
        }
    }

    /**
     * @param capitalList
     * Print list of capital city in continent by largest population to smallest
     */
    public void printCapitalContinent(ArrayList<Capital_City> capitalList) {
        // Check capitalList is not null
        if (capitalList == null)
        {
            System.out.println("No Population capital");
            return;
        }
        // Print header
        System.out.printf("%-30s %-25s %-10s%n", "Capital", "Name", "Population");
        // Loop over all countries in the list
        for (Capital_City capital : capitalList) {
            if (capital == null)
                continue;
            String cty_string =
                    String.format("%-30s %-25s %-10s",
                            capital.getName(), capital.getCountry(), capital.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 19. Get list of capital city in the region organised by largest population to smallest
     * @return countryList
     */
    public ArrayList<Capital_City> getCapitalRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID AND country.Region ='Caribbean' ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Capital_City> capitalList = new ArrayList<>();
            while (rest.next()) {
                Capital_City capital = new Capital_City();
                capital.setName(rest.getString(1));
                capital.setCountry(rest.getString(2));
                capital.setPopulation(rest.getInt(3));
                capitalList.add(capital);
            }
            return capitalList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city by largest population to smallest in region");
            return null;
        }
    }

    /**
     * @param capitalList
     * Print list of capital city in region by largest population to smallest
     */
    public void printCapitalRegion(ArrayList<Capital_City> capitalList) {
        // Check capitalList is not null
        if (capitalList == null)
        {
            System.out.println("No Population capital");
            return;
        }
        // Print header
        System.out.printf("%-30s %-25s %-10s%n", "Capital", "Name", "Population");
        // Loop over all countries in the list
        for (Capital_City capital : capitalList) {
            if (capital == null)
                continue;
            String cty_string =
                    String.format("%-30s %-25s %-10s",
                            capital.getName(), capital.getCountry(), capital.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 20. Get top 10 capital city in the world organised by largest population to smallest
     * @return countryList
     */
    public ArrayList<Capital_City> getTopCapitalWorld() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Capital_City> capitalList = new ArrayList<>();
            while (rest.next()) {
                Capital_City capital = new Capital_City();
                capital.setName(rest.getString(1));
                capital.setCountry(rest.getString(2));
                capital.setPopulation(rest.getInt(3));
                capitalList.add(capital);
            }
            return capitalList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 capital city by largest population to smallest in world");
            return null;
        }
    }

    /**
     * @param capitalList
     * Print top 10 capital city in world by largest population to smallest
     */
    public void printTopCapitalWorld(ArrayList<Capital_City> capitalList) {
        // Check capitalList is not null
        if (capitalList == null)
        {
            System.out.println("No Population capital");
            return;
        }
        // Print header
        System.out.printf("%-30s %-25s %-10s%n", "Capital", "Name", "Population");
        // Loop over all countries in the list
        for (Capital_City capital : capitalList) {
            if (capital == null)
                continue;
            String cty_string =
                    String.format("%-30s %-25s %-10s",
                            capital.getName(), capital.getCountry(), capital.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 21. Get top 10 capital city in the continent organised by largest population to smallest
     * @return capitalList
     */
    public ArrayList<Capital_City> getTopCapitalContinent() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Capital_City> capitalList = new ArrayList<>();
            while (rest.next()) {
                Capital_City capital = new Capital_City();
                capital.setName(rest.getString(1));
                capital.setCountry(rest.getString(2));
                capital.setPopulation(rest.getInt(3));
                capitalList.add(capital);
            }
            return capitalList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 capital city by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * @param capitalList
     * Print top 10 capital city in continent by largest population to smallest
     */
    public void printTopCapitalContinent(ArrayList<Capital_City> capitalList) {
        // Check capitalList is not null
        if (capitalList == null)
        {
            System.out.println("No Population capital");
            return;
        }
        // Print header
        System.out.printf("%-30s %-25s %-10s%n", "Capital", "Name", "Population");
        // Loop over all countries in the list
        for (Capital_City capital : capitalList) {
            if (capital == null)
                continue;
            String cty_string =
                    String.format("%-30s %-25s %-10s",
                            capital.getName(), capital.getCountry(), capital.getPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 22. Get top 10 capital city in the region organised by largest population to smallest
     * @return capitalList
     */
    public ArrayList<Capital_City> getTopCapitalRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            +"FROM country, city "
                            +"WHERE country.Capital = city.ID AND country.Region ='Caribbean' ORDER BY city.Population DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Capital_City> capitalList = new ArrayList<>();
            while (rest.next()) {
                Capital_City capital = new Capital_City();
                capital.setName(rest.getString(1));
                capital.setCountry(rest.getString(2));
                capital.setPopulation(rest.getInt(3));
                capitalList.add(capital);
            }
            return capitalList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get top 10 capital city by largest population to smallest in region");
            return null;
        }
    }

    /**
     * @param capitalList
     * Print top 10 capital city in region by largest population to smallest
     */
    public void printTopCapitalRegion(ArrayList<Capital_City> capitalList) {
        // Check capitalList is not null
        if (capitalList == null)
        {
            System.out.println("No Population capital");
            return;
        }
        // Print header
        System.out.printf("%-30s %-25s %-10s%n", "Capital", "Name", "Population");
        // Loop over all countries in the list
        for (Capital_City capital : capitalList) {
            if (capital == null)
                continue;
            String cty_string =
                    String.format("%-30s %-25s %-10s",
                            capital.getName(), capital.getCountry(), capital.getPopulation());
          System.out.println(cty_string);
        }
    }

    /**
     * 23. Get list the population of people living in cities and people not living in cities in each continent
     * @return populationList
     */
    public ArrayList<Population> getPopulationContinent() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Continent, SUM(DISTINCT country.Population), SUM(city.Population) "
                            +"FROM country, city "
                            +"WHERE country.Code = city.CountryCode GROUP BY country.Continent ORDER BY country.Continent ASC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);

            // Extract Population information
            ArrayList<Population> populationList = new ArrayList<>();
            while (rest.next()) {
                Population population = new Population();
                population.setName(rest.getString(1));
                population.setWorldPopulation(rest.getLong(2));
                population.setCityPopulation(rest.getInt(3));
                populationList.add(population);
            }
            return populationList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the population of people living in cities and people not living in cities in each continent");
            return null;
        }
    }

    /**
     * @param populationList
     * Print list the population of people living in cities and people not living in cities in each continent
     */
    public void printPopulationContinent(ArrayList<Population> populationList) {
        // Print header
        System.out.printf("%-35s %-25s %-25s %-25s%n", "Continent", "Total Population", "Living on City", "Non-living on City");

        // Loop over all population of people living in cities and people not living in cities in each continent
        double living, nonLivingPer;
        long nonLiving;
        for (Population population : populationList) {
            if (population == null)
                continue;
            double city = population.getCityPopulation();
            double country = population.getWorldPopulation();
            living = (city * 100) / country;
            nonLiving = population.getWorldPopulation() - population.getCityPopulation();
            nonLivingPer = 100 - living;
            DecimalFormat df = new DecimalFormat("#.##");
            String cty_string =
                    String.format("%-35s %-25s %-25s %-25s",
                            population.getName(), population.getWorldPopulation(), population.getCityPopulation() + " (" + df.format(living) + "%)", nonLiving + " (" + df.format(nonLivingPer) + "%)");
            System.out.println(cty_string);
        }
    }

    /**
     * 24. Get list the population of people living in cities and people not living in cities in each region
     * @return populationList
     */
    public ArrayList<Population> getPopulationRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Region, SUM(DISTINCT country.Population), SUM(city.Population) "
                            +"FROM country, city "
                            +"WHERE country.Code = city.CountryCode GROUP BY country.Region ORDER BY country.Region ASC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);

            // Extract Population information
            ArrayList<Population> populationList = new ArrayList<>();
            while (rest.next()) {
                Population population = new Population();
                population.setName(rest.getString(1));
                population.setCountryPopulation(rest.getInt(2));
                population.setCityPopulation(rest.getInt(3));
                populationList.add(population);
            }
            return populationList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the population of people living in cities and people not living in cities in each region");
            return null;
        }
    }

    /**
     * @param populationList
     * Print list the population of people living in cities and people not living in cities in each region
     */
    public void printPopulationRegion(ArrayList<Population> populationList) {
        // Check PopulationList is not null
        if (populationList == null)
        {
            System.out.println("No Population Country in Region");
            return;
        }
        // Print header
        System.out.printf("%-35s %-25s %-25s %-25s%n", "Region", "Total Population", "Living on City", "Non-living on City");
        // Loop over all population of people living in cities and people not living in cities in each region
        double living, nonLivingPer;
        int nonLiving;
        for (Population population : populationList) {
            if (population == null)
                continue;
            double city = population.getCityPopulation();
            double country = population.getCountryPopulation();
            living = (city * 100) / country;
            nonLiving = population.getCountryPopulation() - population.getCityPopulation();
            nonLivingPer = 100 - living;
            DecimalFormat df = new DecimalFormat("#.##");
            String cty_string =
                    String.format("%-35s %-25s %-25s %-25s",
                            population.getName(), population.getCountryPopulation(), population.getCityPopulation()+" ("+df.format(living)+"%)", nonLiving+" ("+df.format(nonLivingPer)+"%)");
            System.out.println(cty_string);
        }
    }

    /**
     * 25. Getting list the population of people living in cities and people not living in cities in each country
     * @return populationList
     */
    public ArrayList<Population> getPopulationCountry() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            //Create string for SQL statement
            String strSelect = "SELECT country.Name, country.Population,SUM(DISTINCT city.Population),(SUM(DISTINCT city.Population)/country.Population)*100,country.Population-SUM(DISTINCT city.Population),((country.Population-SUM(DISTINCT city.Population))/country.Population)*100 "
                    +"FROM city, country WHERE country.Code = city.CountryCode GROUP BY country.Name, country.Population "
                    +"ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<Population> populationList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                Population populations = new Population();
                populations.setName(rest.getString(1));
                populations.setPopulation(rest.getInt(2));
                populations.setCountryPopulation(rest.getInt(3));
                populations.setLivingPer(rest.getFloat(4));
                populations.setCityPopulation(rest.getInt(5));
                populations.setNotLivingPer(rest.getFloat(6));
                populationList.add(populations);
            }
            return populationList;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Failed ");
            return null;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * Print list the population of people living in cities and people not living in cities in each country
     */
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public void printPopulationCountry(ArrayList<Population> populationList, String filename) {
        // Check PopulationList is not null
        if (populationList == null)
        {
            System.out.println("No Population cities in Country");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("# 25.  Population of cities in the country with percentage\r\n");
        sb.append("| Country Name | Country Population | Living population | Not Living population |\r\n");
        sb.append("| --- | --- | --- | --- |\r\n");
        // Loop over all city in the list
        for (Population population : populationList) {
            if (population == null)
                continue;
            df.setRoundingMode(RoundingMode.UP);
            sb.append("| "+ population.getName() + " | " + population.getPopulation() + " | " + population.getCountryPopulation() + " ("+df.format(population.getLivingPer())+"%)" + " | " + population.getCityPopulation() + " (" + df.format(population.getNotLivingPer())+ "%)" + "|\r\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 26. Get list the population of the world
     * @return populationList
     */
    public ArrayList<Population> getWorldPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(country.Population) FROM country";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);

            // Extract Population information
            ArrayList<Population> populationList = new ArrayList<>();
            while (rest.next()) {
                Population population = new Population();
                population.setWorldPopulation(rest.getLong(1));
                populationList.add(population);
            }
            return populationList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the population of the world");
            return null;
        }
    }

    /**
     * @param populationList
     * Print list the population of the world
     */
    public void printWorldPopulation(ArrayList<Population> populationList, String filename) {
        // Check PopulationList is not null
        if (populationList == null)
        {
            System.out.println("No Population Country in world");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("# 26. The population of the world\r\n");
        sb.append("| Name | Total Population |\r\n");
        sb.append("| --- | --- |\r\n");
        // Loop over all population of the world
        for (Population population : populationList) {
            if (population == null)
                continue;
            sb.append("| " + "World" + " | " + population.getWorldPopulation() +"|\r\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 27. Get list the population of a continent
     * @return populationList
     */
    public ArrayList<Population> getAllContinentPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Continent, SUM(country.Population) FROM country GROUP BY country.Continent ORDER BY country.Continent ASC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);

            // Extract Population information
            ArrayList<Population> populationList = new ArrayList<>();
            while (rest.next()) {
                Population population = new Population();
                population.setName(rest.getString(1));
                population.setWorldPopulation(rest.getLong(2));
                populationList.add(population);
            }
            return populationList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the population of a continent");
            return null;
        }
    }

    /**
     * @param allContinentPopulation
     * Print list the population of a continent
     */
    public void printAllContinentPopulation(ArrayList<Population> allContinentPopulation, String filename) {
        // Check PopulationList is not null
        if (allContinentPopulation == null)
        {
            System.out.println("No list the population of a continent");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("# 27. The population of a continent\r\n");
        sb.append("| Name | Total Population |\r\n");
        sb.append("| --- | --- |\r\n");
        // Loop over all population of a continent
        for (Population population : allContinentPopulation) {
            if (population == null)
                continue;
            sb.append("| " + population.getName() + " | " + population.getWorldPopulation() +"|\r\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 28. Get list the population of a Region
     * @return populationList
     */
    public ArrayList<Population> getAllRegionPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Region, SUM(country.Population) FROM country GROUP BY country.Region ORDER BY country.Region ASC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);

            // Extract Population information
            ArrayList<Population> populationList = new ArrayList<>();
            while (rest.next()) {
                Population population = new Population();
                population.setName(rest.getString(1));
                population.setWorldPopulation(rest.getLong(2));
                populationList.add(population);
            }
            return populationList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the population of a region");
            return null;
        }
    }

    /**
     * @param allRegionPopulation
     * Print list the population of a region
     */
    public void printAllRegionPopulation(ArrayList<Population> allRegionPopulation, String filename) {
        // Check PopulationList is not null
        if (allRegionPopulation == null)
        {
            System.out.println("No Population Country in Region");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("# 28. The population of a region\r\n");
        sb.append("| Name | Total Population |\r\n");
        sb.append("| --- | --- |\r\n");
        // Loop over all population of a region
        for (Population population : allRegionPopulation) {
            if (population == null)
                continue;
            sb.append("| " + population.getName() + " | " + population.getWorldPopulation() +"|\r\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 29. Getting list the population of people living in cities in each country
     * @return  populationList
     */
    public ArrayList<Population> getCountryPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            //Create string for SQL statement
            String strSelect = "SELECT country.Name, country.Population "
                    +"FROM country  "
                    +"ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<Population> populationList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                Population populations = new Population();
                populations.setPopulationOfCountryName(rest.getString(1));
                populations.setPopulationOfCountry(rest.getInt(2));
                populationList.add(populations);
            }
            return populationList;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Failed ");
            return null;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * @param populationList
     * Print list the population of people living in cities in each country
     */
    public void printCountryPopulation(ArrayList<Population> populationList, String filename) {
        // Check PopulationList is not null
        if (populationList == null)
        {
            System.out.println("No list the population of people living in cities in each country");
            return;
        }
        // Print header
        StringBuilder sb = new StringBuilder();
        sb.append("# 29. Population of country\r\n");
        sb.append("| Country Name | Country Population |\r\n");
        sb.append("| --- | --- |\r\n");
        // Loop over all city in the list
        for (Population population : populationList) {
            if (population == null)
                continue;
            sb.append("| " + population.getPopulationOfCountryName() + " | " + population.getPopulationOfCountry() +"|\r\n");
        }
        try {
            new File("./reports/").mkdir();
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./reports/" + filename)));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 30. Getting list the population of people in cities
     */
    public ArrayList<Population> getCityPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            //Create string for SQL statement
            String strSelect = "SELECT city.Name, city.Population "
                    +"FROM city  "
                    +"ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<Population> populationList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                Population populations = new Population();
                populations.setPopulationOfCityName(rest.getString(1));
                populations.setPopulationOfCity(rest.getInt(2));
                populationList.add(populations);
            }
            return populationList;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Failed ");
            return null;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in continent");
            return null;
        }
    }

    /**
     * @param populationList
     * Print list the population of people living in cities
     */
    public void printCityPopulation(ArrayList<Population> populationList) {
        // Check PopulationList is not null
        if (populationList == null)
        {
            System.out.println("No list the population of people living in cities");
            return;
        }
        // Print header
        System.out.printf("%-50s %-30s%n ", "City Name", "City Population");
        // Loop over all city in the list
        for (Population population : populationList) {
            if (population == null)
                continue;
            String cty_string =
                    String.format("%-50s %-30s ",
                            population.getPopulationOfCityName(), population.getPopulationOfCity());
            System.out.println(cty_string);
        }
    }

    /**
     * 31. Get list the population of a District
     * @return populationList
     */
    public ArrayList<Population> getAllDistrictPopulation() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.District, SUM(city.Population) FROM city GROUP BY city.District ORDER BY city.District ASC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);

            // Extract Population information
            ArrayList<Population> populationList = new ArrayList<>();
            while (rest.next()) {
                Population population = new Population();
                population.setName(rest.getString(1));
                population.setWorldPopulation(rest.getLong(2));
                populationList.add(population);
            }
            return populationList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the population of a district");
            return null;
        }
    }

    /**
     * @param populationList
     * Print list the population of a district
     */
    public void printAllDistrictPopulation(ArrayList<Population> populationList) {
        // Check PopulationList is not null
        if (populationList == null)
        {
            System.out.println("No Population Country in District");
            return;
        }
        // Print header
        System.out.printf("%-35s %-25s%n", "Name", "Total Population");
        // Loop over all population of a district
        for (Population population : populationList) {
            if (population == null)
                continue;
            String cty_string =
                    String.format("%-35s %-25s",
                            population.getName() , population.getWorldPopulation());
            System.out.println(cty_string);
        }
    }

    /**
     * 32. Getting list of language over the world with percentage
     */
    public void getLanguage() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            //Create string for SQL statement
            String strSelects="SELECT SUM(country.Population) FROM country  ";
            ResultSet rests = stmt.executeQuery(strSelects);
            // Extract Country information
            double W=0;
            while (rests.next()) {
                W=rests.getDouble(1);
            }
            String strSelect = "SELECT countrylanguage.Language, SUM(country.Population) FROM country,countrylanguage WHERE country.Code=countrylanguage.CountryCode "
                    +"And countrylanguage.Language In ('Chinese','English','Hindi','Spanish','Arabic') And countrylanguage.IsOfficial='T' GROUP BY countrylanguage.Language ";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<Language> languagesList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                Language languages = new Language();
                languages.setLanguage(rest.getString(1));
                languages.setLanguagePopulation(rest.getInt(2));
                languagesList.add(languages);
            }
            printLanguage(languagesList,W);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Failed ");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest in continent");
        }
    }

    /**
     * Print list of language over the world with percentage
     */
    public void printLanguage(ArrayList<Language> lang,double W) {
        // Check PopulationList is not null
        if (lang == null)
        {
            System.out.println("No list of language over the world with percentage");
            return;
        }
        // Print header
        System.out.printf("%-50s %30s%n", "Language", "Using Language Population of Country");
        // Loop over all city in the list
        for (Language language : lang) {
            if (language == null)
                continue;
            df.setRoundingMode(RoundingMode.UP);
            String cty_string =
                    String.format("%-50s %-30s",
                            language.getLanguage(), language.getLanguagePopulation() + "(" + df.format((language.getLanguagePopulation() / W) * 100) + "%)");
            System.out.println(cty_string);
        }
    }
}