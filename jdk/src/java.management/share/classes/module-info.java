/*
 * Copyright (c) 2014, 2016, Oracle and/or its affiliates. All rights reserved.
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

/**
 * Defines the Java Management Extensions (JMX) API.
 * <P>
 * The JMX API consists of interfaces for monitoring and management of the
 * JVM and other components in the Java runtime.
 */
module java.management {
    requires transitive java.rmi;
    requires java.logging;
    requires java.naming;

    exports java.lang.management;
    exports javax.management;
    exports javax.management.loading;
    exports javax.management.modelmbean;
    exports javax.management.monitor;
    exports javax.management.openmbean;
    exports javax.management.relation;
    exports javax.management.remote;
    exports javax.management.remote.rmi;
    exports javax.management.timer;
    exports sun.management to jdk.jconsole, jdk.management;
    exports sun.management.spi to jdk.management;

    uses javax.management.remote.JMXConnectorProvider;
    uses javax.management.remote.JMXConnectorServerProvider;
    uses sun.management.spi.PlatformMBeanProvider;
    uses sun.management.spi.AgentProvider;

    provides javax.security.auth.spi.LoginModule
        with com.sun.jmx.remote.security.FileLoginModule;
}

