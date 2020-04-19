package io.luna.config;

import static java.lang.String.format;

public final class Server {
    private String host;
    private int port;
    private Key key;

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public Key getKey() {
        return this.key;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append( format( "Host: %s\n", this.host ) )
            .append( format( "Port: %s\n\n", this.port ) )
            .append( format( "Key:\n%s\n", this.key.toString() ) )
            .toString();
    }
}