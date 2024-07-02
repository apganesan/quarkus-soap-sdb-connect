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

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

/**
 * @author AP
 *
 */
@Path("/soap")
public class SoapResource {

    @Inject
    SoapClient soapClient;

    @GET
    @Path("/add")
    public Response addValue(@QueryParam("param1") int param1,@QueryParam("param2")int param2) throws Exception {
        int result = soapClient.add(param1,param2);
        return Response.ok("SOAP response Add Service: " + result).build();
    }
}
