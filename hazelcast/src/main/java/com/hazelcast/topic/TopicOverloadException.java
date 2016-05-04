/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.topic;

import com.hazelcast.core.HazelcastException;
import com.hazelcast.spi.annotation.Beta;

/**
 * A {@link HazelcastException} thrown when a publisher wants to write to a topic, but there is not sufficient storage
 * to deal with the event.
 *
 * This exception is only thrown in combination with the reliable topic.
 */
@Beta
public class TopicOverloadException extends HazelcastException {

    /**
     * Creates a TopicOverloadException.
     *
     * @param msg the message for this TopicOverloadException.
     */
    public TopicOverloadException(String msg) {
        super(msg);
    }
}