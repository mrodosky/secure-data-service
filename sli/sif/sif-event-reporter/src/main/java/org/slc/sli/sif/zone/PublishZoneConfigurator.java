package org.slc.sli.sif.zone;

import openadk.library.ADKException;
import openadk.library.ADKFlags;
import openadk.library.Zone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Configuration for zone publishers
 */
public class PublishZoneConfigurator implements ZoneConfigurator {

    private static final Logger LOG = LoggerFactory.getLogger(PublishZoneConfigurator.class);

    @Override
    public void configure(Zone[] allZones) {
        for (Zone zone : allZones) {
            try {
                // Connect to this zone
                LOG.info("- Connecting to zone \"" + zone.getZoneId() + "\" at " + zone.getZoneUrl());

                zone.connect(ADKFlags.PROV_REGISTER | ADKFlags.PROV_PROVIDE);
            } catch (ADKException ex) {
                LOG.error("  " + ex.getMessage(), ex);
            }
        }

    }

}
