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
package com.openglobes.core.event;

import com.openglobes.core.event.IEvent;
import com.openglobes.core.event.IEventHandler;
import com.openglobes.core.trader.EngineRequestError;
import com.openglobes.core.utils.Loggers;
import com.openglobes.core.interceptor.InterceptorException;
import java.util.logging.Level;
import com.openglobes.core.interceptor.IInterceptorChain;

/**
 *
 * @author Hongbao Chen
 * @since 1.0
 */
public class RequestErrorHandler implements IEventHandler<EngineRequestError> {

    private final IInterceptorChain interceptors;

    public RequestErrorHandler(IInterceptorChain interceptors) {
        this.interceptors = interceptors;
    }

    @Override
    public void handle(IEvent<EngineRequestError> event) {
        try {
            var rsp = event.get();
            interceptors.respond(EngineRequestError.class, rsp);
        }
        catch (InterceptorException ex) {
            Loggers.getLogger(ResponseHandler.class.getCanonicalName()).log(Level.SEVERE,
                                                                            ex.toString(),
                                                                            ex);
        }
    }

}