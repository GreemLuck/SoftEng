/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.logging.*;

/**
 *
 * @author DurandA
 */
public class HelloWorld {
    private static Logger loggingService = Logger.getLogger("Hello");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loggingService.info("Hello World!");
        
    }
    
}
