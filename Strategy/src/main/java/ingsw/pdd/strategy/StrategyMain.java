package ingsw.pdd.strategy;

import java.util.Scanner;
import ingsw.pdd.strategy.impl.AuthenticationProvider;
import ingsw.pdd.strategy.impl.Principal;
import ingsw.pdd.strategy.impl.providers.OnMemoryAuthenticationProvider;
import ingsw.pdd.strategy.impl.providers.SQLAuthenticationProvider;
import ingsw.pdd.strategy.impl.providers.XMLAuthenticationProvider;


public class StrategyMain {

    private static Scanner in = new Scanner(System.in);
    private static AuthenticationProvider authProvider = new AuthenticationProvider();

    public static void main(String[] args) {
        changeAuthetificationStrategy();
        Principal principal = null;
        do {
            System.out.println("\n\nFavor de autenticarse:");
            System.out.println("Usuario:");
            String userName = in.next();
            System.out.println("Pasword:");
            String password = in.next();

            principal = authProvider.authenticate(userName, password);
            if (principal == null) {
                System.out.println("Usuario o password invalido.");
                System.out.println("¿Desea cambiar el metodo de autentificacion? (S/N)");

                String op = in.next();
                if (op.equalsIgnoreCase("S")) {
                    changeAuthetificationStrategy();
                }
            }
        } while (principal == null);

        System.out.println("Autenticacion exitosa");
        System.out.println(principal);
    }

    private static void changeAuthetificationStrategy() {
        System.out.println("Introdusca el tipo de autentificacion a utilizar.");
        System.out.println("1.-OnMemory Authentication");
        System.out.println("2.-SQL Authentication");
        System.out.println("3.-XML Authentication");
        int op = in.nextInt();
        switch (op) {
            case 1:
                authProvider.setAuthenticationStrategy(
                        new OnMemoryAuthenticationProvider());
                System.out.println("OnMemory Authentication Select >");
                break;
            case 2:
                authProvider.setAuthenticationStrategy(
                        new SQLAuthenticationProvider());
                System.out.println("SQL Authentication Select >");
                break;
            case 3:
                authProvider.setAuthenticationStrategy(
                        new XMLAuthenticationProvider());
                System.out.println("XML Authentication Select >");
                break;
            default:
                System.out.println("Opcion invalida");
                System.exit(1);
        }
    }
}
