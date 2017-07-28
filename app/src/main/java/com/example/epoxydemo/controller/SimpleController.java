package com.example.epoxydemo.controller;

import android.view.View;
import android.view.View.OnClickListener;
import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.EpoxyController;
import com.example.epoxydemo.R;
import com.example.epoxydemo.view.AdItemViewModel_;
import com.example.epoxydemo.view.AvatarItemViewModel_;
import com.example.epoxydemo.view.BannerItemViewModel_;
import com.example.epoxydemo.view.SettingsItemViewModel_;

/**
 * Created by Kros on 26/07/2017.
 */

/**
*
* */
public class SimpleController extends EpoxyController {

    @AutoModel AvatarItemViewModel_ avatarItemViewModel;
    @AutoModel BannerItemViewModel_ bannerItemViewModel;
    @AutoModel SettingsItemViewModel_ settingsItemViewModel1;
    @AutoModel SettingsItemViewModel_ settingsItemViewModel2;
    @AutoModel SettingsItemViewModel_ settingsItemViewModel3;
    @AutoModel AdItemViewModel_ adItemViewModel;

    @Override
    protected void buildModels() {
        avatarItemViewModel.addTo(this);
        bannerItemViewModel.addTo(this);
        settingsItemViewModel1
                .title(R.string.settings_1)
                .clickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .addTo(this);
        settingsItemViewModel2
                .title(R.string.settings_2)
                .clickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .addTo(this);
        settingsItemViewModel3
                .title(R.string.settings_3)
                .clickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .addTo(this);
        adItemViewModel.addTo(this);
    }
}
