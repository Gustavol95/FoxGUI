package com.gustavol95.foxgui.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gustavol95.foxgui.R;
import com.gustavol95.foxgui.models.TVShow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tavo on 02/09/2016.
 */
public class ViewPagerAdapter extends PagerAdapter {

    ArrayList<TVShow> list;
    Context context;
    LayoutInflater inflater;
    public ViewPagerAdapter(ArrayList<TVShow> list, Context ctx) {
        this.list=list;
        context=ctx;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View vistaRecycler=inflater.inflate(R.layout.viewpager_page,container,false);
        RecyclerView recyclerView=(RecyclerView)vistaRecycler.findViewById(R.id.cardList);
        CardAdapter adapter=new CardAdapter(list,context);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        container.addView(vistaRecycler);
        return vistaRecycler;
    }
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
