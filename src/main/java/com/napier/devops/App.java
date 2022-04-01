package com.napier.devops;

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
        a.connect();

        ArrayList<Country> countryWorld = a.getCountryWorld();
        System.out.println(" \n ++++++++++++++++ 1. Countries organized by largest to smallest population in World  ++++++++++++++++ \n ");
        //Print list of Countries by largest population to smallest
        a.printCountryWorld(countryWorld);

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
        a.printCityContinent(cityContinent);

        ArrayList<City> cityCountry = a.getCityCountry();
        //Cities in the country organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 10.  List of cities in the country organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCityCountry(cityCountry);

        ArrayList<City> cityDistrict = a.getCityDistrict();
        //Cities in the district organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 11.  List of cities in the district organised by largest population to smallest  ++++++++++++++++ \n ");
        a.printCityDistrict(cityDistrict);

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

        ArrayList<Population> populationRegion = a.getPopulationRegion();
        System.out.println(" \n ++++++++++++++++ 24. The population of people living in cities and people not living in cities in each region  ++++++++++++++++ \n ");
        //Print the population of people living in cities and people not living in cities in each region
        a.printPopulationRegion(populationRegion);

        // Country City
        ArrayList<Population> countryPopulation = a.getPopulationCountry();
        System.out.println(" \n ++++++++++++++++ 25.  Population of cities in the country with percentage  ++++++++++++++++ \n ");
        a.printPopulationCountry(countryPopulation);

        // Disconnect from database
        a.disconnect();
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;
    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Type 1:Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://localhost:33060/world", "root", "example");
                System.out.println("Type 1:Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());

                System.out.println("Type 2:Connecting to database...");
                try
                {
                    // Wait a bit for db to start
                    Thread.sleep(30000);
                    // Connect to database
                    con = DriverManager.getConnection("jdbc:mysql://db:3306/world", "root", "example");
                    System.out.println("Type 2:Successfully connected");
                    break;
                }
                catch (SQLException sqles)
                {
                    System.out.println("Failed to connect to database attempt " + i);
                    System.out.println(sqles.getMessage());
                }
                catch (InterruptedException ie)
                {
                    System.out.println("Thread interrupted? Should not happen.");
                }
            }
            catch (InterruptedException ie)
            {
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
     * Get list of Countries in the world organised by largest population to smallest
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
    public void printCountryWorld(ArrayList<Country> countryList) {
        // Check countryList is not null
        if (countryList == null)
        {
            System.out.println("No Country");
            return;
        }
        // Print header
        System.out.printf("%-10s %-35s %-25s %-35s %-15s %20s%n", "Code", "Name", "Continent", "Region", "Population", "Capital");
        // Loop over all countries in the list
        for (Country country : countryList) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-35s %-25s %-35s %-15s %20s",
                            country.getCode(), country.getName(), country.getContinent(), country.getRegion(), country.getPopulation(), country.getCapital());
            System.out.println(cty_string);
        }
    }

    /**
     * Get list of countries in the continent organised by largest population to smallest
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
     * Get list of countries in region organised by largest population to smallest in region
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
     * Get top 10 countries in the world organised by largest population to smallest.
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
     * Get Top 10 populated countries in continent list by largest population to smallest
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
     * Get top 10 populated countries in region list by largest population to smallest
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
     * Get list of cities in the world organised by largest population to smallest
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
     * Get list of cities in the region organised by largest population to smallest
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
     * Get list of cities in the continent organised by largest population to smallest
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
     * Show list of city in the continent organised by largest population to smallest
     */
    public void printCityContinent(ArrayList<City> cityList) {
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
     * Get list of cities in the country organised by largest population to smallest
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
     * Show list of city in the country organised by largest population to smallest
     */
    public void printCityCountry(ArrayList<City> cityList) {
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
     * Get list of cities in the district organised by largest population to smallest
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
                            + "ORDER BY city.Population";
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
    public void printCityDistrict(ArrayList<City> cityList) {
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
     * Get top 10 cities in the world organised by largest population to smallest
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
     * Get top 10 cities in the continent organised by largest population to smallest
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
     * Get top 10 cities in the region organised by largest population to smallest
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
     * Get top 10 cities in the country organised by largest population to smallest
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
     * Get top 10 cities in the district organised by largest population to smallest
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
     * Get list of capital city in the world organised by largest population to smallest
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
     * Get list of capital city in the continent organised by largest population to smallest
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
     * Get list of capital city in the region organised by largest population to smallest
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
     * Get top 10 capital city in the world organised by largest population to smallest
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
     * Get top 10 capital city in the continent organised by largest population to smallest
     * @return countryList
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
     * Get top 10 capital city in the region organised by largest population to smallest
     * @return countryList
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
     * Get list the population of people living in cities and people not living in cities in each region
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
                population.setRegion(rest.getString(1));
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
                            population.getRegion(), population.getCountryPopulation(), population.getCityPopulation()+" ("+df.format(living)+"%)", nonLiving+" ("+df.format(nonLivingPer)+"%)");
            System.out.println(cty_string);
        }
    }
  
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

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public void printPopulationCountry(ArrayList<Population> populationList) {
        // Check PopulationList is not null
        if (populationList == null)
        {
            System.out.println("No Population cities in Country");
            return;
        }
        // Print header
        System.out.printf("%-50s %-30s %-30s %-30s%n ", "Country Name", "Country Population", "Living population","Not Living population");
        // Loop over all city in the list
    
        for (Population population : populationList) {
            if (population == null)
                continue;
            df.setRoundingMode(RoundingMode.UP);
            String cty_string =
                    String.format("%-50s %-30s %-30s %-30s ",
                            population.getName(), population.getPopulation(), population.getCountryPopulation()+" ("+df.format(population.getLivingPer())+"%)",population.getCityPopulation() + " (" + df.format(population.getNotLivingPer())+ "%)");
            System.out.println(cty_string);
        }
    }

}