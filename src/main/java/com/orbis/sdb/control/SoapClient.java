/*
 *                C O P Y R I G H T  (c) 2024
 *                        DEDALUS SPA
 *                    All Rights Reserved
 *
 *
 *      THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF
 *                        DEDALUS SPA
 *     The copyright notice above does not evidence any
 *    actual or intended publication of such source code.
 */
package com.orbis.sdb.control;

import java.net.URL;

import javax.xml.namespace.QName;

import com.orbis.sdb.control.wsdlclient.CalculatorSoap;

import jakarta.inject.Singleton;
import jakarta.xml.ws.Service;

/**
 * @author AP
 *
 */
@Singleton
public class SoapClient {

    public int add(int a, int b) throws Exception {
        URL url = new URL("http://www.dneonline.com/calculator.asmx?wsdl");
        QName qname = new QName("http://tempuri.org/", "Calculator");
        Service service = Service.create(url, qname);
        CalculatorSoap calculator = service.getPort(CalculatorSoap.class);
        return calculator.add(a, b);
    }
}
