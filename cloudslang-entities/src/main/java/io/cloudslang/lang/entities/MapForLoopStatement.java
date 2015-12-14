/*******************************************************************************
 * (c) Copyright 2014 Hewlett-Packard Development Company, L.P.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0 which accompany this distribution.
 *
 * The Apache License is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *******************************************************************************/
package io.cloudslang.lang.entities;

import org.apache.commons.lang3.Validate;

import java.io.Serializable;

/**
 * Date: 2/3/2015
 *
 * @author Bonczidai Levente
 */
public class MapForLoopStatement extends LoopStatement implements Serializable{

    private static final long serialVersionUID = -667210580560286978L;

    private final String keyName;
    private final String valueName;

    public MapForLoopStatement(String keyName, String valueName, String collectionExpression) {
        super(collectionExpression);
        Validate.notBlank(keyName, "key name cannot be empty");
        Validate.notBlank(valueName, "value name cannot be empty");

        this.keyName = keyName;
        this.valueName = valueName;
    }

    /**
     * only here to satisfy serialization libraries
     */
    @SuppressWarnings("unused")
    private MapForLoopStatement() {
        keyName = null;
        valueName = null;
    }

    public String getKeyName() {
        return keyName;
    }

    public String getValueName() {
        return valueName;
    }

}
