package com.example.a777.retrofotex2;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a777.retrofotex2.model.Flower;
import com.squareup.picasso.Picasso;

/**
 * Created by 777 on 29.03.2017.
 */

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.Holder> {

	private static final String TAG = FlowerAdapter.class.getSimpleName();
	private List<Flower> mFlowers;

	public FlowerAdapter() {
		mFlowers = new ArrayList<>();
	}

	@Override
	public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

		View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent, false);
		return new Holder(row);
	}

	@Override
	public void onBindViewHolder(Holder holder, int position) {
		Flower currFlower = mFlowers.get(position);

		holder.mName.setText(String.valueOf(currFlower.getName()));
		holder.mPrice.setText(Double.toString(currFlower.getPrice()));

		Picasso.with(holder.itemView.getContext())
				.load(currFlower.getPhoto())
				.into(holder.mPhoto);
	}

	@Override
	public int getItemCount() {
		return mFlowers.size();
	}

	public void addFlower(Flower flower) {
		Log.d(TAG, flower.getPhoto());
		mFlowers.add(flower);
		notifyDataSetChanged();
	}

	public class Holder extends RecyclerView.ViewHolder {

		private ImageView mPhoto;
		private TextView mName, mPrice;

		public Holder(View itemView) {
			super(itemView);
			mPhoto = (ImageView) itemView.findViewById(R.id.row_item_imageView);
			mName = (TextView)itemView.findViewById(R.id.row_item_text_view);
			mPrice = (TextView)itemView.findViewById(R.id.row_item_text_view2);
		}
	}
}
