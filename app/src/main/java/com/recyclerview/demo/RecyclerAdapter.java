package com.recyclerview.demo;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * 作者：wangshy on 17/11/22 13:45
 *
 * @author wangshy
 */

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final static int TEXT = 0x000000;
    private final static int IMAGE = 0x000001;
    private final static int RECYCLERVIEW = 0x000002;
    private Context mContext;
    private List<BaseItme> mListBean;

    public RecyclerAdapter(Context mContext, List<BaseItme> listBean) {
        this.mContext = mContext;
        this.mListBean = listBean;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder viewHolder = null;
        if (viewType == TEXT) {
            viewHolder = new ViewHolder(mContext, LayoutInflater.from(mContext).inflate(R.layout.text_itme, parent, false));
        } else if (viewType == IMAGE) {
            viewHolder = new ViewHolder(mContext, LayoutInflater.from(mContext).inflate(R.layout.imag_itme, parent, false));
        } else if (viewType == RECYCLERVIEW) {
            viewHolder = new ViewHolder(mContext, LayoutInflater.from(mContext).inflate(R.layout.recyclerview_tiem, parent, false));
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.e("RecyclerAdapter", "---wangshy---->>>> onBindViewHolder(RecyclerAdapter.java:37)" + holder.getItemViewType());
        switch (getItemViewType(position)) {
            case TEXT:
                break;
            case IMAGE:
                ImageItme imageItme = (ImageItme) mListBean.get(position);
                Glide.with(mContext)
                        .load(imageItme.getImageUrl())
                        .crossFade().centerCrop()
                        .into((ImageView) holder.getView(R.id.imageView));
                break;
            case RECYCLERVIEW:
                RecyclerItme recyclerItme = (RecyclerItme) mListBean.get(position);
                RecyclerView recyclerView = holder.getView(R.id.recyclerview);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(new RecyclerViewAdapter(recyclerItme.getImage()));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mListBean == null ? 0 : mListBean.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mListBean.get(position).getType();
    }

    class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
        private List<ImageItme> items;

        public RecyclerViewAdapter(List<ImageItme> baseItme) {
            this.items = baseItme;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(mContext, LayoutInflater.from(mContext).inflate(R.layout.imag_itme, parent, false));
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            ImageItme imageItme = items.get(position);
            Glide.with(mContext)
                    .load(imageItme.getImageUrl())
                    .crossFade()
                    .centerCrop()
                    .placeholder(R.mipmap.aa)
                    .override(350, 300)
                    .into((ImageView) holder.getView(R.id.imageView));
        }

        @Override
        public int getItemCount() {
            return items == null ? 0 : items.size();
        }
    }

}
