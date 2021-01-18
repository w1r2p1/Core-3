/*
 * Copyright (C) 2021 Hongbao Chen <chenhongbao@outlook.com>
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
package com.openglobes.core.interceptor;

/**
 *
 * @author Hongbao Chen
 * @since 1.0
 */
public class InterceptorException extends Exception {

    private static final long serialVersionUID = 247266390917L;

    public InterceptorException(String message) {
        super(message);
    }

    public InterceptorException(String message,
                                Throwable cause) {
        super(message,
              cause);
    }

    public InterceptorException(Throwable cause) {
        super(cause);
    }

    public InterceptorException(String message,
                                Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message,
              cause,
              enableSuppression,
              writableStackTrace);
    }

}