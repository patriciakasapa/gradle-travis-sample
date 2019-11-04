package io.turntabl;

public class Private_client extends Client {

    public Private_client(String name, int client_ID, Level service_level) {
        super(name, client_ID, service_level);
    }

    public void getContactName(){
        String contact_name =  getName();
    }
}
