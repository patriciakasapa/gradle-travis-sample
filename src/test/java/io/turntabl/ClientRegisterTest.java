package io.turntabl

import org.junit.Test

//import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {

    private List<Corporate_client> corporate_client;

    @Test
    void testToString() {
        Client Tabbi = new Client("Tabbitha Samphone", 1212, Level.PLATINUM);
        System.out.println(Tabbi);
        assertTrue((BooleanSupplier) Tabbi);
    }

    @Test

    void corporates() {

        ArrayList<Corporate_client> corporate_clients = Arrays.asList(
                new Corporate_client(),
                new Corporate_client("Abigail Ankomah", 4355, "Francis Billa"),
                new Corporate_client("Travis Greene", 4355, "Bill Ocansey"),
                new Corporate_client("Regina Akuffo", 4355, "Patricia Serwaa"),
                new Corporate_client("Kasapa Kodie", 4355, "Freda Marker")
        );


        )
        //assertEquals((List<Corporate_client>corporate_clientList), (List<Corporate_client>corporate_clientList));
    }

    void testPrivates() {
        List<Private_client> private_clients = Arrays.asList(
                new Private_client()
    }
}
