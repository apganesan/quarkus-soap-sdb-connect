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
package com.orbis.sdb.boundary;

import com.orbis.sdb.control.SoapClient;
import com.orbis.sdb.control.TheriaqueAdaptor;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * @author AP
 *
 */
@Path("/soap")
public class SoapResource {

    @Inject
    SoapClient soapClient;

    @Inject
    TheriaqueAdaptor adaptor;

    @GET
    @Path("/getTheriak")
    public Response addValue() throws Exception {
        Object result = adaptor.getServicePort();
        return Response.ok("SOAP Theriaque Service: " + result).build();
    }
}
