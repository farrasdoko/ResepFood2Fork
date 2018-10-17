package com.farrasabiyyu12.resepfood2fork.Main.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.farrasabiyyu12.resepfood2fork.Main.model.RecipesItem;
import com.farrasabiyyu12.resepfood2fork.Main.presenter.MainPresenter;
import com.farrasabiyyu12.resepfood2fork.Main.view.MainView;
import com.farrasabiyyu12.resepfood2fork.R;
import com.farrasabiyyu12.resepfood2fork.adapter.MainAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new MainPresenter();
        onAttachView();

    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(List<RecipesItem> data) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter(MainActivity.this, data));
    }

    @Override
    public void onAttachView() {
//      1. TODO Get Data dari presenter dan onAttach Method
        mainPresenter.getData();
        mainPresenter.onAttach(this);
    }

    @Override
    public void onDetachView() {

    }
}
