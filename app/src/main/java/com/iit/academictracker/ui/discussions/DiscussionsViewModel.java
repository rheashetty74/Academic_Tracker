package com.iit.academictracker.ui.discussions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiscussionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DiscussionsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}