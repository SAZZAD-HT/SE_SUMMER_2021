package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Officer {
    public String OfficerName;
    public String BMAbatch;
    public String OfficerRank;
    public String division;
    public  String Joindate;

    public void setJoindate(String joindate) {
      this.Joindate = joindate;
    }

    public String getJoindate() {
        return Joindate;
    }

    public void setBMAbatch(String BMAbatch) {
        this.BMAbatch = BMAbatch;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setOfficerName(String officerName) {
        this.OfficerName = officerName;
    }

    public void setOfficerRank(String officerRank) {
        this.OfficerRank = officerRank;
    }

    public String getBMAbatch() {
        return BMAbatch;
    }

    public String getDivision() {
        return division;
    }

    public String getOfficerName() {
        return OfficerName;
    }

    public String getOfficerRank() {
        return OfficerRank;
    }




    }
