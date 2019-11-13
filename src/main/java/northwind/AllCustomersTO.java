package northwind;

public class AllCustomersTO {
    private String company_name;
    private String contact_name;
    private String contact_title;
    private String address;

    public AllCustomersTO(Integer customer_id, String company_name, String contact_name, String contact_title, String address) {
        this.company_name = company_name;
        this.contact_name = contact_name;
        this.contact_title = contact_title;
        this.address = address;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_title() {
        return contact_title;
    }

    public void setContact_title(String contact_title) {
        this.contact_title = contact_title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
