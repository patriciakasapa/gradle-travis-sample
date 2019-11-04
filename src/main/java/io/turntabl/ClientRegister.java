package io.turntabl;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class ClientRegister {
    public List<Corporate_client> corporate_clients;
    public List<Private_client> private_clients;

    public ClientRegister(List<Corporate_client> corporate_clients, List<Private_client> private_clients) {
        this.corporate_clients = corporate_clients;
        this.private_clients = private_clients;
    }



    @Override
    public String toString() {
        return "ClientRegister{" +
                "corporate_clients=" + corporate_clients +
                ", private_clients=" + private_clients +
                '}';
    }

    public String getContactNames(){
        ArrayList<String>contact_names_of_gold = new ArrayList<>();
        ArrayList<Level> gold = new ArrayList<Level>();
        for (Level myLevel: gold
             ) { if(myLevel == Level.GOLD){
                 contact_names_of_gold.add(String.valueOf(myLevel));



        }

        }
    }


}
