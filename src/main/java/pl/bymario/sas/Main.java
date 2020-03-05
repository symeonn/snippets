package pl.bymario.sas;

public class Main {

    public static void main(String[] args) {

        String resourceUri ="https://luktest.servicebus.windows.net/";
        String keyName = "send-mario";
        String key = "ycRKF55hfxvoKEOFp3TmSvfCslwwLQPuoFM6mWHeQEM=";

        String hmac256 = SasTokenGenerator.GetSASToken(resourceUri, keyName, key);

        System.out.println(hmac256);

    }
}
