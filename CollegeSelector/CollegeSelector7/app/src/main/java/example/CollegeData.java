package example;

import java.util.ArrayList;

public class CollegeData {

    /**
     * Returns only those colleges for the given program where the userRank
     * is within the cutoff threshold.
     */
    public static ArrayList<College> getAllColleges(String program, int userRank) {
        ArrayList<College> colleges = new ArrayList<>();

        // B.Tech examples
        if (program.equalsIgnoreCase("B.Tech")) {
            if (userRank <= 10000) {
                colleges.add(new College(
                        "Andhra University",
                        17.7298, 83.3215,
                        "CS: 800, IT: 900, ECE: 950"
                ));
                colleges.add(new College(
                        "BHIMAVARAM INST. OF ENGG. AND TECHNOLOGY",
                        16.5449, 81.5212,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "DNR University Campus",
                        16.5364, 81.5188,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "ANIL NEERUKONDA INSTITUTE OF TECHNOLOGY\n" +
                                "& SCIENCES",
                        17.8931, 83.3956,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "GMR INSTITUTE OF TECHNOLOGY",
                        18.4653, 83.6619,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "JNTUA COLLEGE OF ENGINEERING",
                        14.6495, 77.6068,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "VISHNU INSTITUTE OF TECHNOLOGY",
                        16.5449, 81.5212,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "GAYATRI VIDYA PARISHAD COLLEGE OF\n" +
                                "ENGINEERING",
                        17.8192, 83.3384,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "Jawaharlal Nehru Technological University (JNTUK)",
                        16.9786, 82.2406,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "CENTURION UNIVERSITY OF TECHNOLOGY & MANAGEMENT",
                        18.8070, 84.1400,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "SVR ENGINEERING COLLEGE",
                        15.7160, 78.0939,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "KAKINADA INSTITUTE OF TECHNOLOGY SCIENCES",
                        16.9891, 82.2475,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
            }
            if (userRank <= 30000) {
                colleges.add(new College(
                        "Vignan's Foundation for Science, Technology, and Research",
                        16.3067, 80.4365,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));

                colleges.add(new College(
                        "ADITYA INSTITUTE OF TECHNOLOGY AND\n" +
                                "MANAGEMENT",
                        18.6050,  84.2340,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "Velagapudi Ramakrishna Siddhartha Engineering College (VRSEC)",
                        16.4854, 80.6927,
                        "CS: 609-2189, IT: 10958-9924, ECE: 5075-7498, EEE:12697-14665"
                ));
                colleges.add(new College(
                        "RAGHU ENGINEERING COLLEGE",
                        19.0760, 72.8777,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        " SIDDHARTH INSTITUTE OF ENGINEERING &\n" +
                                "TECHNOLOGY",
                        19.0760, 72.8777,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "R.V.R.& J.C.COLLEGE OF ENGINEERING",
                        19.0760, 72.8777,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "N.B.K.R.INSTITUTE OF SCIENCE & TECHNOLOGY",
                        19.0760, 72.8777,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "KITS AKSHAR INSTITUTE OF TECHNOLOGY",
                        19.0760, 72.8777,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
            }
            if (userRank <= 50000) {
                colleges.add(new College(
                        "AVANTHI INSTITUTE OF ENGINEERING &\n" +
                                "TECHNOLOGY",
                        17.8925, 83.3950,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "ST. JOHNS COLLEGE OF ENGG. AND TECHNOLOGY",
                        15.4167, 77.4833,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "G.PULLA REDDY ENGINEERING COLLEGE",
                        15.8281, 78.0373,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "SREE VIDYANIKETHAN ENGINEERING COLLEGE",
                        13.6289, 79.4192,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "Nadimpalli Satyanarayana Raju Institute of Technology",
                        17.7215, 83.2246,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        " AUDISANKARA COLLEGE OF ENGINEERING &\n" +
                                "TECHNOLOGY",
                        14.1492, 79.8516,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "BAPATLA ENGINEERING COLLEGE",
                        15.9042, 80.4675,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "BABA INST OF TECH AND SCIENCES",
                        17.7333, 83.3167,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
            }
            if (userRank <= 80000) {
                colleges.add(new College(
                        "SIR C.V RAMAN INST OF TECHNOLOGY SCIENCES",
                        14.9167, 78.0167,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "GIET ENGINEERING COLLEGE",
                        17.0000, 81.7833,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "DR L BULLAYYA COLL EGE OF ENGINEERING",
                        17.7333, 83.3167,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "DNR COLLEGE OF ENGG AND TECH",
                        16.5449, 81.5212,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "ELURU COLLEGE OF ENGG AND TECHNOLOGY",
                        16.7100, 81.1000,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "GEETHANJALI INST OF SCIENCE AND TECHNOLOGY",
                        14.4333, 79.9667,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
                colleges.add(new College(
                        "HELAPURI INST OF TECH AND SCIENCE",
                        16.7100, 81.1000,
                        "CS: 2500, IT: 2800, ECE: 3000"
                ));
            }
        }
        // Medical examples
        else if (program.equalsIgnoreCase("Medical")) {
            if (userRank <= 500) {
                colleges.add(new College(
                        "XYZ Medical College",
                        13.0827, 80.2707,
                        "MBBS: 400, BDS: 480"
                ));
            }
            if (userRank <= 2000) {
                colleges.add(new College(
                        "Sunrise Medical College",
                        12.9716, 77.5946,
                        "MBBS: 1500, BDS: 1800"
                ));
            }
        }
        // Fallback or other programs
        else {
            if (userRank <= 5000) {
                colleges.add(new College(
                        "Universal College",
                        22.5726, 88.3639,
                        "General: 2500"
                ));
            }
        }

        return colleges;
    }
}

