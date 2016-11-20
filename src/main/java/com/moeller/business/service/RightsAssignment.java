package com.moeller.business.service;

import com.moeller.business.common.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bernd on 20.11.2016.
 */
@Service
public class RightsAssignment {
    private static final Logger LOGGER = LoggerFactory.getLogger(RightsAssignment.class);

    private boolean hasRight = false;

    public boolean hasRight(){
        return hasRight;
    }

    public void setHasRight(boolean hasRight){
        this.hasRight = hasRight;
    }

    public boolean toggleRight() {
        hasRight = !hasRight;
        LOGGER.info("Toggeled right to" + hasRight);
        return hasRight;
    }
}
