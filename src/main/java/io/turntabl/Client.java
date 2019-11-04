package io.turntabl;

public class Client {
    public String name;
    public int client_ID;
    public Level service_level;

    public Client(String name, int client_ID, Level service_level) {
        this.name = name;
        this.client_ID = client_ID;
        this.service_level = service_level;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", client_ID=" + client_ID +
                ", service_level=" + service_level +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public Level getService_level() {
        return service_level;
    }

    public void setService_level(Level service_level) {
        this.service_level = service_level;
    }

    public void getContactName(){
       String contact_name =  getName();
    }
}
