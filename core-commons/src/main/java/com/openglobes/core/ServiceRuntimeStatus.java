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
package com.openglobes.core;

import com.openglobes.core.utils.Utils;
import java.time.ZonedDateTime;

/**
 *
 * @author Hongbao Chen
 * @since 1.0
 */
public class ServiceRuntimeStatus extends RuntimeException {

    private static final long serialVersionUID = 3452774387640193L;

    private final Integer code;
    private final Long serviceRuntimeStatusId;
    private final ZonedDateTime timestamp = ZonedDateTime.now();

    public ServiceRuntimeStatus(Integer code, String msg) {
        super(msg);
        this.serviceRuntimeStatusId = Utils.nextId();
        this.code = code;
    }

    public ServiceRuntimeStatus(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.serviceRuntimeStatusId = Utils.nextId();
    }

    public Integer getCode() {
        return code;
    }

    public Long getServiceRuntimeStatusId() {
        return serviceRuntimeStatusId;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}