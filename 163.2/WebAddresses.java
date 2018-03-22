import java.net.URL;
import java.util.Scanner;

class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddresses {
    public static void main(String[] args) throws Exception {
        URL addressFile = new URL("https://mrgallo.github.io/problem-files/163/fake-addresses.txt");
        Scanner scan = new Scanner(addressFile.openStream());
        
        Address[] address = new Address[6];
        for(int i = 0; i < 6; i++) {
            address[i] = new Address();
            address[i].street = scan.nextLine();
            address[i].city   = scan.nextLine();
            address[i].state  = scan.next();
            address[i].zip    = scan.nextInt();
            scan.skip("\n");
        }
        
        scan.close();
        for(int i = 0; i < 6; i++) {
            System.out.println(address[i].street + ", " + address[i].city + ", " + address[i].state + "  " + address[i].zip);
        }
    }
}
