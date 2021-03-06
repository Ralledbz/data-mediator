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
package com.heaven7.java.data.mediator.batchbind;

import com.heaven7.java.base.util.Throwables;
import com.heaven7.java.data.mediator.Binder;
import com.heaven7.java.data.mediator.Property;

/**
 * the batch binder of view,
 *
 * @param <T> the module data type
 * @author heaven7
 * @since 1.0.8
 */
public class BatchViewBinder<T> {

    protected final Binder<T> mBinder;
    protected final Object mView;

    /**
     * create batch base view binder for target view
     * @param mBinder the binder impl
     * @param view the view . on android is  any child of 'android.view.View'.
     */
    public BatchViewBinder(Binder<T> mBinder, Object view) {
        Throwables.checkNull(mBinder);
        Throwables.checkNull(view);
        this.mBinder = mBinder;
        this.mView = view;
    }

    /**
     * bind visibility of view (on android the visibility is masked as int.).
     *
     * @param property       the property
     * @param forceAsBoolean force to use property as boolean or not. if true that means on android:
     *                       only support  View.GONE(false) and View.VISIBLE(true).
     * @return this.
     */
    public BatchViewBinder<T> bindVisibility(String property, boolean forceAsBoolean) {
        mBinder.bindVisibility(property, mView, forceAsBoolean);
        return this;
    }

    /**
     * bind visibility of view (on android the visibility is masked as int.).
     *
     * @param property       the property
     * @param forceAsBoolean force to use property as boolean or not. if true that means on android:
     *                       only support  View.GONE(false) and View.VISIBLE(true).
     * @return this.
     * @since 1.1.2
     */
    public BatchViewBinder<T> bindVisibility(Property property, boolean forceAsBoolean) {
        mBinder.bindVisibility(property.getName(), mView, forceAsBoolean);
        return this;
    }

    /**
     * bind visibility of view (on android the visibility is masked as int.).
     * here force use property of visibility as boolean.
     *
     * @param property the property
     * @return this.
     */
    public BatchViewBinder<T> bindVisibility(String property) {
        return bindVisibility(property, true);
    }

    /**
     * bind visibility of view (on android the visibility is masked as int.).
     * here force use property of visibility as boolean.
     *
     * @param property the property
     * @return this.
     * @since 1.1.2
     */
    public BatchViewBinder<T> bindVisibility(Property property) {
        return bindVisibility(property.getName(), true);
    }

    /**
     * bind enable of view.
     *
     * @param property the property
     * @return this.
     */
    public BatchViewBinder<T> bindEnable(String property) {
        mBinder.bindEnable(property, mView);
        return this;
    }
    /**
     * bind enable of view.
     *
     * @param property the property
     * @return this.
     * @since 1.1.2
     */
    public BatchViewBinder<T> bindEnable(Property property) {
        mBinder.bindEnable(property.getName(), mView);
        return this;
    }

    /**
     * bind background resource of view.
     *
     * @param property the property
     * @return this.
     */
    public BatchViewBinder<T> bindBackgroundRes(String property) {
        mBinder.bindBackgroundRes(property, mView);
        return this;
    }
    /**
     * bind background resource of view.
     *
     * @param property the property
     * @return this.
     * @since 1.1.2
     */
    public BatchViewBinder<T> bindBackgroundRes(Property property) {
        mBinder.bindBackgroundRes(property.getName(), mView);
        return this;
    }

    /**
     * bind background drawable of view.
     *
     * @param property the property
     * @return this.
     */
    public BatchViewBinder<T> bindBackground(String property) {
        mBinder.bindBackground(property, mView);
        return this;
    }
    /**
     * bind background drawable of view.
     *
     * @param property the property
     * @return this.
     * @since 1.1.2
     */
    public BatchViewBinder<T> bindBackground(Property property) {
        mBinder.bindBackground(property.getName(), mView);
        return this;
    }

    /**
     * bind background color of view.
     *
     * @param property the property
     * @return this.
     */
    public BatchViewBinder<T> bindBackgroundColor(String property) {
        mBinder.bindBackgroundColor(property, mView);
        return this;
    }
    /**
     * bind background color of view.
     *
     * @param property the property
     * @return this.
     * @since 1.1.2
     */
    public BatchViewBinder<T> bindBackgroundColor(Property property) {
        mBinder.bindBackgroundColor(property.getName(), mView);
        return this;
    }

    /**
     * end this batch binder and return to original binder.
     * @return the original binder
     */
    public final Binder<T> end(){
        return mBinder;
    }
}
