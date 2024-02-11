package labs.lab_6;

import java.util.Scanner;

public class Lab_6_4 {
    public static void main(String[] args) {
        String url = inputAnUrl();
        checkProtocol(url);
        checkDomainName(url);
    }

    private static void checkDomainName(String url) {
        String removedProtocolInUrl = (url.split(":")[1]).split("//")[1];
        String domain = removedProtocolInUrl.split("/")[0];
        System.out.println("Domain name: " + domain);
        System.out.println("The top-level domain is: " + topLevelDomain(domain));
    }

    private static String topLevelDomain(String domain) {
        String[] stringArray = domain.split("[.]");
        int length = stringArray.length;
        if (length > 0){
            return stringArray[length-1];
        }
        return null;
    }


    private static void checkProtocol(String url) {
        System.out.println("The protocol is: " + url.split(":")[0]);
    }

    private static String inputAnUrl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an url:");
        return scanner.nextLine();
    }
}
