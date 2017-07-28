package com.example.epoxydemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.airbnb.epoxy.ModelView;
import com.example.epoxydemo.R;

/**
 * Created by Kros on 26/07/2017.
 */
@ModelView(defaultLayout = R.layout.model_footer_item_view)
public class FooterItemView extends FrameLayout {

    public FooterItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_footer_item, this);
        ButterKnife.bind(this);
    }
}
