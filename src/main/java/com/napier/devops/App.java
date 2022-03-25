package com.napier.devops;

import java.sql.*;
import java.util.ArrayList;

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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString("Name"));
                city.setCountryCode(rest.getString("CountryCode"));
                city.setDistrict(rest.getString("District"));
                city.setPopulation(rest.getInt("Population"));
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
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "CountryCode", "District", "Population");
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
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Region  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Region = 'Antarctica'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString("Name"));
                city.setCountryCode(rest.getString("CountryCode"));
                city.setDistrict(rest.getString("District"));
                city.setPopulation(rest.getInt("Population"));
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
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "CountryCode", "District", "Population");
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
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Region "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            ArrayList<City> cityList = new ArrayList<>();
            // Extract Country information
            while (rest.next()) {
                City city = new City();
                city.setName(rest.getString("Name"));
                city.setCountryCode(rest.getString("CountryCode"));
                city.setDistrict(rest.getString("District"));
                city.setPopulation(rest.getInt("Population"));
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
     * Get list of city in the continent organised by largest population to smallest
     */
    public void printCityContinent(ArrayList<City> cityList) {
        // Print header
        System.out.printf("%-30s %-10s %-20s %10s%n", "Name", "CountryCode", "District", "Population");
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
}