package classes;

import interfaces.Soldier1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regiment extends Weapon implements Soldier1
{

    List<String>Slist=new ArrayList<>(100);

    Scanner input = new Scanner(System.in);
public void getSoldier(String SolderName){}





    public  void InsertSoldier(Soldier a ){

        Slist.add(a.getSolderName());
        Slist.add(a.getSoldierBatch());
        Slist.add(a.getSoldierID());
        Slist.add(a.getHeight());
        Slist.add(a.getSolderRank());
        System.out.println("Information Updated");
    }

    public  void DecommisoneSolder(Soldier a){
        int i=1;
        String SolderName;
        System.out.println("Insert Solder name");

        while(i<Slist.size()){

            System.out.println(Slist.get(i));
            if(a.SolderName.equals( Slist.get(i))){
                Slist.remove(i-1);
                Slist.remove(i-1);
                Slist.remove(i-1);
                Slist.remove(i-1);
                Slist.remove(i-1);
            }
            else{
                i+=4;
            }
        }
    }public void showallSoldier(){System.out.println("\n THE REGEMENT Solder is" + Slist);}
    public void SelectWeapon(Weapon a){
        System.out.println("Assaign weapon");
        System.out.println("Select Number");
        System.out.println("1.BD-08");
        System.out.println("2.SPS 12");
        System.out.println("3.AN32");
        System.out.println("4.RPG");
        int num;
        num=input.nextInt();
        if(num==1){
            Slist.add("BD 08");
        }
        else if (num==2){Slist.add("SPS12");}
        else if (num==3){Slist.add("An32");}
        else if (num==4){Slist.add("RPG");}
    }
    List<String>Wlist=new ArrayList<>(100);
    public void WeaponTYPE(){

        System.out.println("1.Ground");
        System.out.println("2.Water");
        System.out.println("3.Air deffence");
    }

        public void getWeapon(String Wp){}
    public void InsertWeapon(Weapon a){
        Wlist.add(a.getArmoredTank());
        Wlist.add(a.getAirdeffence());
        Wlist.add(a.getArtilary());
    }
    public void showAllWeapon() {
        System.out.println("\n WEAPONS ARE:" + Wlist);

    }
    List<String> Olist=new ArrayList<>(100);

    public  void AssginNewOffcier(Officer a){
        Olist.add(a.getOfficerName());
        Olist.add(a.getBMAbatch());
        Olist.add(a.getOfficerRank());


    };
    public void JoinDate(Officer a){
        a.setJoindate(a.Joindate);


    }
    public void getOffcerName(String ofn){}
    public void TransferOfficer(Officer r){
        int i=1;
        String OfficerName;
        System.out.println("Insert Solder name");
        while(i<Olist.size()){

            System.out.println(Olist.get(i));
            if( r.OfficerName.equals( Olist.get(i))){
                Olist.remove(i-1);
                Olist.remove(i-1);
                Olist.remove(i-1);
            }
            else{
                i+=4;
            }
        }}
    public void showAllOfficer() {
        System.out.println("\n THE REGEMENT OFFICER is" + Olist);

    }

}

