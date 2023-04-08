package youareell;

import controllers.*;

import java.net.MalformedURLException;
import java.net.URL;

public class YouAreEll {
    /**
     *
     */
    TransactionController tt;

    public YouAreEll (TransactionController t) {
        this.tt = t;
    }

    public YouAreEll (MessageController m, IdController j){
        this.tt = new TransactionController(m, j);
    }

    public static void main(String[] args) {
        // hmm: is this Dependency Injection?
        YouAreEll urlhandler = new YouAreEll(
            new TransactionController(
                new MessageController(), new IdController()
        ));
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

    private String MakeURLCall(String s, String get, String s1) {
        return null;
    }

    public String get_ids() { //
        return tt.makecall("/ids", "GET", "");
    }

    public String get_messages() throws MalformedURLException {
//        return MakeURLCall("/messages", "GET", "");
        URL url = new URL("http://zipcode.rocks:8085");
        return tt.makecall("/messages", "GET", "");
    }


}
