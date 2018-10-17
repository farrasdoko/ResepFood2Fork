package com.farrasabiyyu12.resepfood2fork.Main.view;

import com.farrasabiyyu12.resepfood2fork.Base.BaseView;
import com.farrasabiyyu12.resepfood2fork.Main.model.RecipesItem;
import com.farrasabiyyu12.resepfood2fork.Main.model.ResponseRecipe;

import java.util.List;

public interface MainView extends BaseView {
    void onError(String msg);
    void onSuccess(List<RecipesItem> data);
}