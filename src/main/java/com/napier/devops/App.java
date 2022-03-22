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

        ArrayList<City> cityworld = a.getCityWorld();
        //Cities in the world organised by largest population to smallest
        System.out.println(" \n ++++++++++++++++ 7.  Cities in the world organised by largest population to smallest ++++++++++++++++ \n ");
        a.printCityWorld(cityworld);

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

    //Get countries in the world organised by largest population to smallest.
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
            // Extract Country information
            ArrayList<City> citylist = new ArrayList<City>();
            while (rest.next()) {
                City city = new City();
                city.name = rest.getString("Name");
                city.countryCode = rest.getString("CountryCode");
                city.district = rest.getString("District");
                city.population = rest.getInt("Population");
                citylist.add(city);
            }
            return citylist;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get City by largest population to smallest");
            return null;
        }
    }

    //Get countries in the world organised by largest population to smallest.
    public void printCityWorld(ArrayList<City> citylist) {
        // Print header
        System.out.println(String.format("%-10s %-25s %-25s %-10s", "Name", "CountryCode", "District", "Population"));
        // Loop over all city in the list
        for (City city : citylist) {
            if (city == null)
                continue;
            String cty_string =
                    String.format("%-20s %-10s %-20s %10s",
                            city.name, city.countryCode, city.district, city.population);
            System.out.println(cty_string);
        }
    }

}