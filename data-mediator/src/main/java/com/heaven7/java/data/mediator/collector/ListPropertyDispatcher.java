/**
 * Copyright 2017
 group of data-mediator
 member: heaven7(donshine723@gmail.com)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.heaven7.java.data.mediator.collector;

import com.heaven7.java.data.mediator.Property;

/**
 * the list property dispatcher
 * @author heaven7
 * @since 1.4.4
 */
public interface ListPropertyDispatcher extends PropertyDispatcher{

    /**
     * called on add property values.
     *
     * @param data       the current module data.
     * @param original   the original module where occurs this event.
     * @param prop       the property to describe the field.
     * @param newValue   the newest value of property
     * @param addedValue the value which is added.
     */
    void dispatchOnAddPropertyValues(Object data, Object original, Property prop, Object newValue, Object addedValue);

    /**
     * called on add property values with index.
     *
     * @param data       the current module data .
     * @param original   the original module where occurs this event.
     * @param prop       the property to describe the field.
     * @param newValue   the newest value of property
     * @param addedValue the value which is added.
     * @param index      the index to add.
     */
    void dispatchOnAddPropertyValuesWithIndex(Object data, Object original, Property prop,
                                              Object newValue, Object addedValue, int index);

    /**
     * called on remove property values.
     *
     * @param data        the current module data .
     * @param original   the original module where occurs this event.
     * @param prop        the property to describe the field.
     * @param newValue    the newest value of property
     * @param removeValue the value which is removed.
     */
    void dispatchOnRemovePropertyValues(Object data, Object original, Property prop, Object newValue, Object removeValue);

    /**
     * called on property item changed.
     *
     * @param data    the current module data
     * @param original   the original module where occurs this event.
     * @param prop    the property
     * @param oldItem the old item
     * @param newItem the new item
     * @param index   the index of old item
     */
    void dispatchOnPropertyItemChanged(Object data, Object original, Property prop, Object oldItem, Object newItem, int index);
}
