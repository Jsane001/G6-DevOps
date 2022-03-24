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

    //Get list of cities in the world organised by largest population to smallest
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

    //Show list of cities in the world organised by largest population to smallest
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

    //Get list of cities in the region organised by largest population to smallest
    public ArrayList<City> getCityRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Region  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Region = 'Asia'"
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

    //Show list of cities in the region organised by largest population to smallest
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

    //Get list of cities in the continent organised by largest population to smallest
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

    //Get list of city in the continent organised by largest population to smallest
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
