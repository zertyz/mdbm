/* Copyright 2014 Yahoo! Inc. */
/* Licensed under the terms of the 3-Clause BSD license. See LICENSE file in the project root for details. */
package com.yahoo.db.mdbm.exceptions;

public class MdbmLockFailedException extends MdbmException {
    private static final long serialVersionUID = 1L;

    public MdbmLockFailedException() {
        super();
    }

    public MdbmLockFailedException(String message) {
        super(message);
    }

}
