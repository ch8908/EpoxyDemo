package com.example.epoxydemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.airbnb.epoxy.ModelView;
import com.example.epoxydemo.R;

/**
 * Created by Kros on 26/07/2017.
 */
@ModelView(defaultLayout = R.layout.model_avatar_item_view)
public class AvatarItemView extends LinearLayout {
    public AvatarItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_avatar_item, this);
        ButterKnife.bind(this);
    }
}
