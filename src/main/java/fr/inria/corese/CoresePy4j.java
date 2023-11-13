package fr.inria.corese;

import py4j.GatewayServer;

public class CoresePy4j {
    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer();
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }
}
