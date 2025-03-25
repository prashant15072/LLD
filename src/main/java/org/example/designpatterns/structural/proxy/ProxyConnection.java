package org.example.designpatterns.structural.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyConnection implements Internet{
    private final RealInternetConnection realInternetConnection;
    private static final Set<String> bannedSites;
    public ProxyConnection(RealInternetConnection realInternetConnection) {
        this.realInternetConnection = realInternetConnection;
    }

    static {
        bannedSites = new HashSet<>();
        bannedSites.add("www.facebook.com");
    }
    @Override
    public void connectToInternet(String url) {
        if (bannedSites.contains(url)){
            //Throw an exception
        }
        realInternetConnection.connectToInternet(url);
    }
}
