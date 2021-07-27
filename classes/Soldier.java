package classes;


public class Soldier  {
    public String SolderName;
    public String SoldierID;
    public String SoldierBatch;
    public String Height;
public String SolderRank;

    public void setSolderRank(String solderRank) {
        this.SolderRank = solderRank;
    }
    

    public void setSolderName(String solderName) {
        this.SolderName = solderName;
    }

    public String getSolderRank() {
        return SolderRank;
    }

    public void setHeight(String height) {
        this.Height = height;
    }
    public   void setSoldierName(String a){
        this.SolderName=a;
    }
    public   void setSoldierBatch(String a){
        this.SoldierBatch=a;

    }

    public void setSoldierID(String soldierID) {
        this.SoldierID = soldierID;
    }

    public String getHeight() {

        return Height;
    }

    public String getSoldierID() {
        return SoldierID;
    }

    public String getSolderName() {
        return SolderName;
    }

    public String getSoldierBatch() {
        return SoldierBatch;
    }


}

