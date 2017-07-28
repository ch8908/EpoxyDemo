package com.example.epoxydemo.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.BindView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.example.epoxydemo.R;
import com.example.epoxydemo.view.CommentItemModel.CommentItemHolder;

import static com.airbnb.epoxy.EpoxyAttribute.Option.DoNotHash;

/**
 * Created by Kros on 12/04/2017.
 */

@EpoxyModelClass(layout = R.layout.model_comment_item_view)
public abstract class CommentItemModel extends EpoxyModelWithHolder<CommentItemHolder> {
    @EpoxyAttribute String comment;
    @EpoxyAttribute(DoNotHash) OnClickListener clickListener;

    @Override
    public void bind(CommentItemHolder holder) {
        holder.itemView.setOnClickListener(clickListener);
        holder.commentTextView.setText(comment);
    }

    @Override
    public void unbind(CommentItemHolder holder) {
        holder.itemView.setOnClickListener(null);
    }

    public static class CommentItemHolder extends BaseEpoxyHolder {
        @BindView(R.id.itemView) View itemView;
        @BindView(R.id.commentTextView) TextView commentTextView;
    }
}
