package com.example.epoxydemo.view;

import android.support.annotation.CallSuper;
import android.view.View;
import butterknife.ButterKnife;
import com.airbnb.epoxy.EpoxyHolder;

/**
 * Created by Kros on 18/04/2017.
 */

public abstract class BaseEpoxyHolder extends EpoxyHolder {
    @CallSuper
    @Override
    protected void bindView(View itemView) {
        ButterKnife.bind(this, itemView);
    }
}
