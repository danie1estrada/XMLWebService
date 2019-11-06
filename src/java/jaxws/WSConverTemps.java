/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel Estrada
 */
@WebService(serviceName = "WSConverTemps")
public class WSConverTemps {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "FahrenheitToCelsius")
    public double fahrenheitToCelsius(double f) {
        return ((f - 32) * 5) / 9;
    }
    
    @WebMethod(operationName = "CelsiusToFahrenheit")
    public double celsiusToFahrenheit(double c) {
        return 9 / 5 * c + 32;
    }
}
