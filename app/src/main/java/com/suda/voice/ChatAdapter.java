package com.suda.voice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;

/**
 * Created by YangJiali on 2016/8/16 0016.
 */
public class ChatAdapter extends BaseAdapter{
    private Context mContext;
    private List<ChatMessage> mData;

    public ChatAdapter(Context mContext,List<ChatMessage> data) {
        this.mContext = mContext;
        this.mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView content;
        switch (mData.get(position).getmType()){
            case ChatMessage.Message_To:
                convertView = LayoutInflater.from(mContext).inflate(R.layout.send_message_to, null);
                content = (TextView)convertView.findViewById(R.id.To_Content);
                content.setText(mData.get(position).getContent());
                break;
            case ChatMessage.Message_From:
                convertView = LayoutInflater.from(mContext).inflate(R.layout.send_message_from,null);
                content = (TextView)convertView.findViewById(R.id.From_Content);
                content.setText(mData.get(position).getContent());
                break;
        }
        return convertView;
    }
}
