package com.hl.shoesshop.adapter;

import java.util.List;

import com.hl.shoesshop.R;
import com.hl.shoesshop.entity.ShoesInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CategoryAdapter extends BaseAdapter{
	Context context;
	List<ShoesInfo> shoesList;
	public CategoryAdapter(Context context, List<ShoesInfo> list){
		this.context = context;
		this.shoesList = list;
	}
	@Override
	public int getCount() {
		if(shoesList != null){
			return shoesList.size();
		}
		return 0;
	}

	@Override
	public ShoesInfo getItem(int pos) {
		if(shoesList != null){
			return shoesList.get(pos);
		}
		return null;
	}

	@Override
	public long getItemId(int id) {
		return id;
	}

	@Override
	public View getView(int pos, View view, ViewGroup parent) {
		view=LayoutInflater.from(context).inflate(R.layout.shoes_item, null);
		return view;
	}
	
	class ViewHolder{
	}
}
