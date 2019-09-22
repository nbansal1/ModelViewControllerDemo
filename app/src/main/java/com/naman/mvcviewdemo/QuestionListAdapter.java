package com.naman.mvcviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class QuestionListAdapter extends RecyclerView.Adapter<QuestionListAdapter.ViewHolder> implements QuestionListItemViewMvc.Listener {

    private Context mContext;
    private List<String> mQuestionList;
    private IOnQuestionClickedListener onQuestionItemClickListener;

    public QuestionListAdapter(Context context, List<String> mQuestionList, IOnQuestionClickedListener onQuestionItemClick) {
        mContext = context;
        this.mQuestionList = mQuestionList;
        this.onQuestionItemClickListener = onQuestionItemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        QuestionListItemViewMvc mvc = new QuestionListItemsViewMvcImpl(LayoutInflater.from(mContext),parent);

        mvc.registerListener(this);

        return new ViewHolder(mvc);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.mvc.bindQuestion(mQuestionList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onQuestionItemClickListener.onQuestionClicked(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mQuestionList.size();
    }

    @Override
    public void onQuestionClicked(int pos) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private QuestionListItemViewMvc mvc;


        public ViewHolder(QuestionListItemViewMvc mvc) {
            super(mvc.getViewRoot());
            this.mvc = mvc;
        }
    }
    public interface IOnQuestionClickedListener{
        void onQuestionClicked(int pos);
    }
}
