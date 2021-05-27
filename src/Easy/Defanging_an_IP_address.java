package Easy;

public class Defanging_an_IP_address {
    public String defangIPaddr(String address) {
        String str = address.replace(".", "[.]");
        return str;
    }
}
