/*
 * *************************************************************************************
 *  Copyright (C) 2006-2015 EsperTech, Inc. All rights reserved.                       *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.epl.datetime.eval;

import java.time.ZonedDateTime;

public class DatetimeLongCoercerZonedDateTime implements DatetimeLongCoercer {
    public long coerce(Object date) {
        return coerce((ZonedDateTime) date);
    }

    public static long coerce(ZonedDateTime zdt) {
        return zdt.toInstant().toEpochMilli();
    }
}
