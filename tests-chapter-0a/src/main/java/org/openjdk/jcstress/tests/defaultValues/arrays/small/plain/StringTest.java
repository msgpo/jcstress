/*
 * Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.jcstress.tests.defaultValues.arrays.small.plain;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.*;

// -- This file was mechanically generated: Do not edit! -- //

/**
 * Tests if fields are initialized to default values.
 */
@JCStressTest
@Outcome(id = "[null, null, null, null]", expect = Expect.ACCEPTABLE, desc = "Default value for the element.")
@Outcome(expect = Expect.FORBIDDEN, desc = "Non-default values are forbidden.")
@State
public class StringTest {

    String[] arr;

    @Actor
    public void actor1() {
        arr = new String[4];
    }

    @Actor
    public void actor2(StringResult4 r) {
        String[] a = arr;
        if (a == null) {
            // Pretend we have seen the default values
            r.r1 = r.r2 = r.r3 = r.r4 = null;
        } else {
            r.r1 = a[0];
            r.r2 = a[1];
            r.r3 = a[2];
            r.r4 = a[3];
        }
    }

}

