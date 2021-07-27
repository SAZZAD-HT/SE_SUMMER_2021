


import classes.*;
import classes.Regiment;
import classes.Soldier;
import classes.Weapon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        int choice = 0,subChoice = 0;


        Scanner in = new Scanner( System.in );
        Regiment C=new Regiment();
        Officer o=new Officer();
        Soldier d=new Soldier();
        System.out.println("                                                BANGLADESH ARMY          ");
        System.out.println("                                               " +

                                                                         "East BENGLE REGIMENT       ");
        System.out.println("                                      In War, In Peace We are Everywhere for our Country"                         );

        while(true){
            try{


                System.out.println("1.Solder.");
                System.out.println("2. Officer");
                System.out.println("3.Commanders AND War History");
                System.out.println("4. Weapon");
                System.out.println("5. Exit");
                System.out.println("Enter your choice:");
                choice = in.nextInt();
                in.nextLine();

            }
            catch (Exception u){System.out.println(      "Sorry" +
                                                      " Try again.");
                break; }
            switch(choice) {
                case 1:{while(true){


                    try{System.out.println("\nSolder Portal");
                        System.out.println("\n1.Commiosne A Soldier :");
                        System.out.println("\n2.Decommisone A Solder");

                        System.out.println("\n3.Show All General Solder:");

                        System.out.println("\n4.Going Back.");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                       }
                    catch(Exception p){ System.out.println("Error occured.Please try again."); }
                    if(subChoice==1){
                        try {
                            Soldier a=new Soldier();
                            String newSolderName;
                            String newSoldierID;
                            String newSoldierBatch;
                            String newHeight;
                            String newSolderRank;
                            System.out.println("Enter  Name");
                            newSolderName=in.nextLine();
                            System.out.println("Enter Possible Training Batch");
                            newSoldierBatch=in.nextLine();
                            System.out.println("Enter SOlder ID");
                            newSoldierID=in.nextLine();
                            System.out.println("Enter The height");
                            newHeight=in.nextLine();
                            System.out.println("E N T E R -- The Charcter of  Rank ");
                            newSolderRank=in.nextLine();
                            in.nextLine();

                            a.setSolderRank(newSolderRank);
                            a.setSoldierName(newSolderName);
                            a.setSoldierBatch(newSoldierBatch);
                            a.setSoldierID(newSoldierID);
                            a.setHeight(newHeight);

                            C.InsertSoldier(a);



                        }
                        catch (Exception a){System.out.println(      "Sorry Try again.");}

                    }
                    else if(subChoice==2){
                        try{ Soldier s=new Soldier();
                            String searchSoldierName;
                            System.out.println("\nEnter Your Name to Apply For a Transfer request");
                            searchSoldierName = in.next();
                            s.setSolderName(searchSoldierName);
                            C.DecommisoneSolder(s);
                            break;





                        }
                        catch(Exception a){System.out.println(            "Sorry" +
                                " Try again.");break;

                        }


                    }
                    else if(subChoice==3){C.showallSoldier();

                    }


                    else if(subChoice==4){
                        break;
                    }
                }

                        System.out.println("Army Cheif:- ");
                        System.out.println("Present Commander :- Brigadier General Obaydul Haque");
                        System.out.println("Colonel Commandent:- General Karim Bhuya");
                        break;

                }
                case 2:{
                    while(true){
                        try {

                            System.out.println("\nOfficer Portal");
                            System.out.println("\n1.Assign New Officer :");
                            System.out.println("\n2.Classified :");
                            System.out.println("\n3.Transfer Request");
                            System.out.println("\n4.Show All Officer:");
                            System.out.println("\n5.Going Back.");
                            System.out.println("\nEnter your option:");
                            subChoice = in.nextInt();
                            in.nextLine();
                        }catch(Exception u) {
                            System.out.println("Error occured.Please try again.");
                            break;
                        }
                        if(subChoice==1){
                            try {
                                Officer s = new Officer();
                                String newOfficerName;
                                String newBmabatch;
                                String newOfficerRank;
                                String newJoindate;


                                System.out.println("    Enter the name of the OFFICER:");
                                newOfficerName = in.nextLine();
                                System.out.println("    Enter BMA Batch");
                                newBmabatch = in.next();
                                in.nextLine();
                                System.out.println("    ENTER OFFICER RANK");
                                newOfficerRank=in.next();
                                in.nextLine();
                                System.out.println("      Enter JOIN Date In The Regiment");
                                newJoindate=in.next();
                                in.nextLine();
                                 s.setJoindate(newJoindate);
                                s.setOfficerName(newOfficerName);
                                s.setOfficerRank(newOfficerRank);

                                s.setBMAbatch(newBmabatch);


                                C.AssginNewOffcier(s);
                            }catch(Exception e) {
                                System.out.println("Error occured.Please try again.");
                                break;
                            }
                        }
                        else if(subChoice==2){
                            Officer a=new Officer();
                            String DOJ;
                            int Password = 0;
                            int A=5;
                            System.out.println("Enter The PAssord");
                            Password=in.nextInt();
                            if(Password==A){

                                System.out.println("Enter JOIN DATE");
                                DOJ=in.next();
                                in.nextLine();
                                a.setJoindate(DOJ);



                            }

                        }
                        else if(subChoice==3){
                            try {
                                Officer r = new Officer();
                                String searchOfficerName;
                                System.out.println("\nEnter Your Name to Apply For a Transfer request");
                                searchOfficerName = in.next();
                                r.setOfficerName(searchOfficerName);
                                C.TransferOfficer(r);
                            }      catch(Exception e) {
                                break;
                            }
                        }
                        else if(subChoice==4){
                            C.showAllOfficer();
                        }
                        else if(subChoice==5){
                            break;
                        }

                    }
                    break;
                }
                case 3:while(true){ System.out.println("Army Cheif:- General Aziz Ahmed");
                        System.out.println("Present Commander :- Brigadier General Obaydul Haque");
                        System.out.println("Colonel Commandent:- General Karim Bhuya");
				break;}
                  
                
                case 4:{while (true){
                    try{System.out.println("Weapon Portal");
                        System.out.println("1.Insert Weapon :");
                        System.out.println("2. Show weapon");
                        System.out.println("3.Going Back.");
                        System.out.println("Enter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                        }
                    catch(Exception p){System.out.println(      "Sorry" +
                                                             " Try again.");

                    }
                    if(subChoice==1){
                        try {
                            Weapon a=new Weapon();
                            String newArmoredTank;
                            String newArtilary;
                            String newAirdeffence;

                            FileReadWrite frd=new FileReadWrite();

                            System.out.println("Enter  ARMored Tank model Name");
                            newArmoredTank=in.next();
                            a.setArmoredTank(newArmoredTank);
                            frd.writeInFile(newArmoredTank);
                            System.out.println("Enter Air deffence ");
                            newAirdeffence=in.next();
                            a.setAirdeffence(newAirdeffence);
                            frd.writeInFile(newAirdeffence);
                            System.out.println("Enter SOlder ID");
                            newArtilary=in.next();
                            a.setArtilary(newArtilary);
                            frd.writeInFile(newArtilary);

                            in.nextLine();



                        }
                        catch (Exception a){System.out.println(      "Sorry" +
                                                                 " Try again.");}

                    }
                    else if(subChoice==2) {
                        try {
                            FileReadWrite file = new FileReadWrite();

                            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(file)));

                            String st;
                            while ((st = br.readLine()) != null)
                                System.out.println(st);
                        }  catch (Exception a) {
                            System.out.println("Sorry Try again.");
                        }

}                       else if(subChoice==3){break;
                    }
                    }
}
}


}
}




}











