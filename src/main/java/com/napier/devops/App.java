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

        ArrayList<Country> countrylist = a.getCountryList();
        System.out.println(" ---------- Countries organized by largest to smallest population ---------- ");
        //Print list of Countries by largest population to smallest
        a.printCountryList(countrylist);

        ArrayList<Country> countryregion = a.getCountryRegion();
        System.out.println(" ---------- Countries organized by largest to smallest population ---------- ");
        //Print list of Countries by largest population to smallest in region
        a.printCountryRegion(countryregion);

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

    //Countries in the world organised by largest population to smallest.
    public ArrayList<Country> getCountryList() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countrylist = new ArrayList<Country>();
            while (rest.next()) {
                Country country = new Country();
                country.code = rest.getString("Code");
                country.name = rest.getString("Name");
                country.continent = rest.getString("Continent");
                country.region = rest.getString("Region");
                country.population = rest.getInt("Population");
                country.capital = rest.getInt("Capital");
                countrylist.add(country);
            }
            return countrylist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Countries by largest population to smallest");
            return null;
        }
    }

    //Print list of Countries by largest population to smallest
    public void printCountryList(ArrayList<Country> countrylist) {
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country country : countrylist) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            country.code, country.name, country.continent, country.region, country.population, country.capital);
            System.out.println(cty_string);
        }
    }

    //Countries in the world organised by largest population to smallest in region.
    public ArrayList<Country> getCountryRegion() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country WHERE Region = 'Southern and Central Asia' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rest = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> countrylist = new ArrayList<Country>();
            while (rest.next()) {
                Country country = new Country();
                country.code = rest.getString("Code");
                country.name = rest.getString("Name");
                country.continent = rest.getString("Continent");
                country.region = rest.getString("Region");
                country.population = rest.getInt("Population");
                country.capital = rest.getInt("Capital");
                countrylist.add(country);
            }
            return countrylist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Countries by largest population to smallest");
            return null;
        }
    }

    //Print list of Countries by largest population to smallest
    public void printCountryRegion(ArrayList<Country> countrylist) {
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-35s %-25s %10s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country country : countrylist) {
            if (country == null)
                continue;
            String cty_string =
                    String.format("%-10s %-25s %-25s %-35s %-25s %10s",
                            country.code, country.name, country.continent, country.region, country.population, country.capital);
            System.out.println(cty_string);
        }
    }

}