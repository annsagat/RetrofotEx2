package com.example.a777.retrofotex2.netwotk;

import com.example.a777.retrofotex2.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 777 on 29.03.2017.
 */

public class RestManager {

	private FlowerService mFlowerService;

	public FlowerService getFlowerService(){
		if (mFlowerService == null){

			Retrofit retrofit = new Retrofit.Builder()
					.baseUrl(Constants.HTTP.BASE_URL)
					.addConverterFactory(GsonConverterFactory.create())
					.build();
			mFlowerService = retrofit.create(FlowerService.class);
		}
		return mFlowerService;
	}
}
