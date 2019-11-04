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
    
    
    public ArrayList<Client> getContactNames() {

        ArrayList<Client> contact_names_of_gold = new ArrayList<Client>();
        for (Corporate_client name : corporate_clients
        ) {
            if (name.service_level == Level.GOLD) {
                contact_names_of_gold.add(name);

            }

            for (Private_client p_name : private_clients
            ) {
                if (p_name.service_level == Level.GOLD) {
                    contact_names_of_gold.add(p_name);

                }

            }
            
        }


        return contact_names_of_gold;
    }
}

}
