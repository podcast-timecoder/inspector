package com.inspector.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

import static org.jacoco.cli.internal.Commands.dumpAction;

@Service
public class InspectorService {

    @Value("${hosts}")
    private String[] hosts;

    @Value("${destFolder}")
    private String destFolder;

    @Value("${fileName}")
    private String fileName;

    public boolean dump() {
        for (String host : hosts) {
            String[] addressAndPort = host.split(":");
            if (addressAndPort.length < 2) {
                throw new RuntimeException("There is wrong property " + host);
            }

            dumpAction(addressAndPort[0], addressAndPort[1], destFolder + File.separator + addressAndPort[0] + File.separator + addressAndPort[1] + File.separator + fileName);
        }
        return true;
    }
}
