package com.personalrssfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RssFeedsAdapter extends ArrayAdapter {
    public RssFeedsAdapter(Context context, List<RssFeed> feeds) {
        super(context, 0, feeds);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RssFeed feed = (RssFeed) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rss_edit_feed_item_row, parent, false);
        }


        TextView feedAddress = (TextView) convertView.findViewById(R.id.rssEditFeedItemAddressTV);
        TextView feedTitle = (TextView) convertView.findViewById(R.id.rssEditFeedTitleTV);

        feedAddress.setText(feed.rssFeedAddress);
        feedTitle.setText(feed.rssFeedTitle);

        return convertView;
    }

}


