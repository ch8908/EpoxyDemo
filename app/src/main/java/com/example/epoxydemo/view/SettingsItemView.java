package com.example.epoxydemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.airbnb.epoxy.ModelProp;
import com.airbnb.epoxy.ModelProp.Option;
import com.airbnb.epoxy.ModelView;
import com.example.epoxydemo.R;

/**
 * Created by Kros on 26/07/2017.
 */
@ModelView(defaultLayout = R.layout.model_settings_item_view)
public class SettingsItemView extends LinearLayout {
    @BindView(R.id.titleTextView) TextView titleTextView;

    public SettingsItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_settings_item, this);
        ButterKnife.bind(this);
    }

    @ModelProp
    public void setTitle(@StringRes int resId) {
        titleTextView.setText(resId);
    }

    @ModelProp(options = Option.DoNotHash)
    public void setClickListener(@Nullable OnClickListener clickListener) {
        this.setOnClickListener(clickListener);
    }
}
