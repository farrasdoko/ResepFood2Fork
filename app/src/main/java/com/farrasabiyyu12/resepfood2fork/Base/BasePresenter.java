package com.farrasabiyyu12.resepfood2fork.Base;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T v);
    void onDetach();
}
