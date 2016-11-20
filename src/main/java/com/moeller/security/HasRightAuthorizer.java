package com.moeller.security;

import com.moeller.business.service.RightsAssignment;
import org.apache.deltaspike.security.api.authorization.Secures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * Created by Bernd on 20.11.2016.
 */
public class HasRightAuthorizer {
    private static final Logger LOGGER = LoggerFactory.getLogger(HasRightAuthorizer.class);

    @Inject
    private RightsAssignment rightsAssignment;

    @Secures
    @UserHasRight
    public boolean hasRight(){
        return rightsAssignment.hasRight();
    }
}
