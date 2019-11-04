package io.turntabl;

import java.util.ArrayList;

public class Corporate_client extends Client {
    public String name_of_account_manager;


    public Corporate_client(String name, int client_ID, Level service_level, String name_of_account_manager) {
        super(name, client_ID, service_level);
    }

    public String getName_of_account_manager() {
        return name_of_account_manager;
    }

    public void setName_of_account_manager(String name_of_account_manager) {
        this.name_of_account_manager = name_of_account_manager;
    }

    @Override
    public void getContactName(){
        String contact_name = getName_of_account_manager();
    }

    ArrayList<Corporate_client> corporate_clients = new ArrayList<Corporate_client>();

}
