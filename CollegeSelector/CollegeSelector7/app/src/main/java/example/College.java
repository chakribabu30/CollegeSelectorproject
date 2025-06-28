package example;

import java.util.HashMap;
import java.util.Map;

public class College {
    private String name;
    private double latitude, longitude;
    private Map<String, Integer> cutoffs;  // Using a Map to store cutoff values for different branches

    // Constructor
    public College(String name, double latitude, double longitude, String cutoffs) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cutoffs = parseCutoffs(cutoffs); // Parse the string into a Map of cutoff values
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Eligibility check based on program and rank
    public boolean isEligible(String program, int userRank) {
        if (cutoffs.containsKey(program)) {
            return userRank <= cutoffs.get(program); // Check eligibility for a specific program
        }
        return false;
    }

    // Method to parse the cutoff string into a Map
    private Map<String, Integer> parseCutoffs(String cutoffsString) {
        Map<String, Integer> cutoffsMap = new HashMap<>();

        // Example cutoff string: "CS: 800, IT: 900, ECE: 950"
        String[] branches = cutoffsString.split(", ");
        for (String branch : branches) {
            String[] parts = branch.split(": ");
            String branchName = parts[0];
            int cutoff = Integer.parseInt(parts[1]);
            cutoffsMap.put(branchName, cutoff);
        }
        return cutoffsMap;
    }

    // Method to get cutoff values
    public Map<String, Integer> getCutoffs() {
        return cutoffs;
    }
    @Override
    public String toString() {
        return this.name; // or any readable property
    }

}

