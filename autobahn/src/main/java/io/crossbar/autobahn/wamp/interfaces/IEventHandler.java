///////////////////////////////////////////////////////////////////////////////
//
//   AutobahnJava - http://crossbar.io/autobahn
//
//   Copyright (c) Crossbar.io Technologies GmbH and contributors
//
//   Licensed under the MIT License.
//   http://www.opensource.org/licenses/mit-license.php
//
///////////////////////////////////////////////////////////////////////////////

package io.crossbar.autobahn.wamp.interfaces;

import java.util.List;
import java.util.Map;

import io.crossbar.autobahn.wamp.types.EventDetails;


@FunctionalInterface
public interface IEventHandler {
    void accept(List<Object> args,
                Map<String, Object> kwargs,
                EventDetails details);
}
