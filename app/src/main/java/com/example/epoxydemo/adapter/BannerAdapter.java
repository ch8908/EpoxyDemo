package com.example.epoxydemo.adapter;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.epoxydemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kros on 19/04/2017.
 */

public class BannerAdapter extends PagerAdapter {
    private final Context context;
    private final BannerCallback bannerCallback;
    @BindView(R.id.bannerImageView) ImageView bannerImageView;
    private List<String> banners = new ArrayList<>();

    public BannerAdapter(Context context, BannerCallback bannerCallback) {
        this.context = context;
        this.bannerCallback = bannerCallback;
        banners = new ArrayList<>();
        banners.add("a");
        banners.add("b");
        banners.add("c");
    }

    @Override
    public int getCount() {
        return banners.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, final int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemLayout = inflater.inflate(R.layout.view_point_banner_item, view, false);
        ButterKnife.bind(this, itemLayout);

        bannerImageView.setBackgroundColor(getRandomColor(position));
        itemLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                bannerCallback.onClickBanner(position);
            }
        });

        view.addView(itemLayout, 0);
        return itemLayout;
    }

    private int getRandomColor(int position) {
        if (position % 3 == 0) {
            return ContextCompat.getColor(context, R.color.red);
        } else if (position % 3 == 1) {
            return ContextCompat.getColor(context, R.color.blue);
        } else {
            return ContextCompat.getColor(context, R.color.green);
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    public interface BannerCallback {
        void onClickBanner(int position);
    }
}
