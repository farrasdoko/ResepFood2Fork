package com.farrasabiyyu12.resepfood2fork.Main.presenter;

import com.farrasabiyyu12.resepfood2fork.Base.BasePresenter;
import com.farrasabiyyu12.resepfood2fork.Base.BaseView;
import com.farrasabiyyu12.resepfood2fork.Main.model.RecipesItem;
import com.farrasabiyyu12.resepfood2fork.Main.model.ResponseRecipe;
import com.farrasabiyyu12.resepfood2fork.Main.view.MainView;
import com.farrasabiyyu12.resepfood2fork.Rest.ApiClient;
import com.farrasabiyyu12.resepfood2fork.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements BasePresenter<MainView> {

    MainView mainView;
    String API_KEY = "530b195e19ff416ad3a37db94d4b6b6b";
    String query = "chicken breast";

//   2. TODO Get Data Method For Main Acitivity
    public void getData(){
        call().enqueue(new Callback<ResponseRecipe>() {
            @Override
            public void onResponse(Call<ResponseRecipe> call, Response<ResponseRecipe> response) {
//               5.TODO pengecekan berhasil tidaknya
                if (response.isSuccessful()){
//                    6. TODO jika data berhasil didapatkan
                    List<RecipesItem> recipesItems = response.body().getRecipes();
//                    7. TODO data dikembalikan ke view
                    mainView.onSuccess(recipesItems);
                }else {
                    mainView.onError("Gagal Mengambil Data");
                }
            }

            @Override
            public void onFailure(Call<ResponseRecipe> call, Throwable t) {
                mainView.onError(t.getMessage());
            }
        });
    }

    @Override
    public void onAttach(MainView v) {
        mainView = v;
    }

    @Override
    public void onDetach() {
    mainView = null;
    }
//  3. TODO Get konfigurasi Network Profit
//  4. TODO Mengambil Model
    Call<ResponseRecipe> call(){
        return ApiClient.getInstance().getResepData(API_KEY, query, 1);
    }
}
