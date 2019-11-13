package northwind;

import java.util.Scanner;

public class Main {
    public static void main (String args[]) throws ClassNotFoundException {
        CustomerDAO first = new CustomerDAOImplementation();
        Scanner sc = new Scanner (System.in);
        first.getCustomersNames();
    }
}
