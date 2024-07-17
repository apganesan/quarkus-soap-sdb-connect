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

import com.theriaque.WsManager;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * @author AP
 *
 */
@ApplicationScoped
public class TheriaqueAdaptor {

    private WsManager getWSManager() {
        final WsManager wsManager = new WsManager("http://WS000535.DEDALUS.LAN:14280/webservice_v4331/server.php", 60, 60);
        return wsManager;
    }

    public Object getServicePort() {
        try {
            WsManager wsManager = getWSManager();
            System.out.println("wsManager#" + wsManager);
            // wsManager.getServicePort();
            // wsManager.getSDBInformations();
            return wsManager.isConnected();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
