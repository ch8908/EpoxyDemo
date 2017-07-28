package com.example.epoxydemo.controller;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.TypedEpoxyController;
import com.example.epoxydemo.R;
import com.example.epoxydemo.model.Comment;
import com.example.epoxydemo.view.CommentItemModel.CommentItemHolder;
import com.example.epoxydemo.view.CommentItemModel_;
import com.example.epoxydemo.view.FooterItemViewModel_;
import com.example.epoxydemo.view.HeaderItemViewModel_;

import java.util.List;

/**
 * Created by Kros on 26/07/2017.
 */

public class ListController extends TypedEpoxyController<List<Comment>> {

    private final Context context;
    @AutoModel HeaderItemViewModel_ headerItemViewModel;
    @AutoModel FooterItemViewModel_ footerItemViewModel;

    public ListController(Context context) {
        this.context = context;
    }

    @Override
    protected void buildModels(List<Comment> data) {

        headerItemViewModel
                .title(R.string.header_1)
                .addTo(this);

        for (Comment comment : data) {
            new CommentItemModel_()
                    .id(comment.getId())
                    .comment(comment.getComment())
                    .clickListener(new OnModelClickListener<CommentItemModel_, CommentItemHolder>() {
                        @Override
                        public void onClick(CommentItemModel_ model, CommentItemHolder parentView, View clickedView, int position) {
                            Toast.makeText(context, "click position:" + String.valueOf(position), Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addTo(this);
        }

        footerItemViewModel
                .addIf(true, this);
    }
}
