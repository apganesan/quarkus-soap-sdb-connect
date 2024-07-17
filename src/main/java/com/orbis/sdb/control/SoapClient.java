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

import com.orbis.sdb.control.theriaque.TheriakAPIPort;

import jakarta.inject.Singleton;
import jakarta.xml.ws.Service;

/**
 * @author AP
 *
 */
@Singleton
public class SoapClient {

    public Object fetchDetail() throws Exception {
        URL url = new URL("http://ws000535.dedalus.lan:14280/webservice_v4331/server.php?wsdl");
        QName qname = new QName("http://www.ws-theriaque.localhost/server.php", "theriakAPIService");
        Service service = Service.create(url, qname);
        TheriakAPIPort apiPort = service.getPort(TheriakAPIPort.class);

        return apiPort.getTheNivGrav();
    }
}
