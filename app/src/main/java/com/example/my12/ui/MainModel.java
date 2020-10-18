package com.example.my12.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainModel extends ViewModel {

    MutableLiveData<String> data;
    LiveData<String> liveData;

    public MainModel(String text) {
        assert data != null;
        data.setValue(text);
    }

    public LiveData<String> getLiveData() {
        if (data != null) {
            liveData = data;
        }
        return liveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        liveData = null;
    }
}
