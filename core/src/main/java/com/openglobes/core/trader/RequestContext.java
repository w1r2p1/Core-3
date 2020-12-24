/*
 * Copyright (C) 2020 Hongbao Chen <chenhongbao@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.openglobes.core.trader;

import java.util.Properties;

/**
 *
 * @author Hongbao Chen
 * @since 1.0
 */
public class RequestContext {

    private final Request request;
    private final Instrument instrument;
    private final Properties properties;
    private final int requestId;

    public RequestContext(Request request,
                          Instrument instrument,
                          Properties properties,
                          int requestId) {
        this.request = request;
        this.instrument = instrument;
        this.properties = properties;
        this.requestId = requestId;
    }

    public Request getRequest() {
        return request;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public Properties getProperties() {
        return properties;
    }

    public int getRequestId() {
        return requestId;
    }

}