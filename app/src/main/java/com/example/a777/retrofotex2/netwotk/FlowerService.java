package com.example.a777.retrofotex2.netwotk;

import java.util.List;

import com.example.a777.retrofotex2.model.Flower;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by 777 on 29.03.2017.
 */

public interface FlowerService {

	@GET("/feeds/flowers.json")
	Call<List<Flower>> getAllFlowers();
}
