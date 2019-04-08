package io.github.liftbridge.grpc;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorldClient {
    private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());

    private final ManagedChannel channel;
    private GreeterGrpc.GreeterBlockingStub blockingStub;
    private GreeterGrpc.GreeterStub asyncStub;

    private HelloWorldClient(String hostname, int port) {
        channel = ManagedChannelBuilder.forAddress(hostname, port)
                .usePlaintext(true)
                .build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
        asyncStub = GreeterGrpc.newStub(channel);
    }

    private void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    private void simpleSayHello(String name) {
        logger.info("Trying to sayHello " + name);
        try {
            HelloRequest request = HelloRequest.newBuilder().setName(name).build();
            HelloResponse response = blockingStub.sayHello(request);
            logger.info("Response: ---------->> " + response.getMessage());
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }
    }

    private void serverStream(String name) {
        // logger.info("Trying to sayHello " + name);
        try {
            HelloRequest request = HelloRequest.newBuilder().setName(name).build();
            Iterator<HelloResponse> it = blockingStub.serverStreamSayHello(request);
            while (it.hasNext()) {
                HelloResponse response = it.next();
                System.out.println("Response: ---------->> " + response.getMessage());
                // logger.info("Response: ---------->> " + response.getMessage());
            }
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }

    }

    private void syncSystemstream(String name) throws InterruptedException {
        logger.info("async client");

    }


    public static void main(String[] args) throws Exception {
        HelloWorldClient client = new HelloWorldClient("localhost", 42420);
        String name = args.length > 0 ? args[0] : "tsingson call";

        try {
            client.simpleSayHello(name);
            logger.info("Response: ---------->> ");
            client.serverStream(name);
        } finally {
            client.shutdown();
        }
    }
}
