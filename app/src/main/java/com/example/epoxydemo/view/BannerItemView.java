package com.example.epoxydemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.airbnb.epoxy.ModelView;
import com.example.epoxydemo.R;
import com.example.epoxydemo.adapter.BannerAdapter;
import com.example.epoxydemo.adapter.BannerAdapter.BannerCallback;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * Created by Kros on 26/07/2017.
 */
@ModelView(defaultLayout = R.layout.model_banner_item_view)
public class BannerItemView extends LinearLayout {
    @BindView(R.id.bannerViewPager) ViewPager viewPager;
    @BindView(R.id.bannerIndicator) CirclePageIndicator bannerIndicator;
    private BannerAdapter adapter;

    public BannerItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_banner_item, this);
        ButterKnife.bind(this);
        setUpViewPager();
        setUpIndicator();
    }

    private void setUpIndicator() {
        bannerIndicator.setViewPager(viewPager);
    }

    private void setUpViewPager() {
        adapter = new BannerAdapter(getContext(), new BannerCallback() {
            @Override
            public void onClickBanner(int position) {
            }
        });
        viewPager.setAdapter(adapter);
    }
}
