package io.luna.config;

import static java.lang.String.format;

public final class Configuration { 
    private Server server;

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append( "Configuration:\n\n" )
            .append( format( "Server:\n%s\n", this.server.toString() ) )
            .toString();
    }
}