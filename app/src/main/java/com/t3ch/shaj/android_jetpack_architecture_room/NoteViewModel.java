package com.t3ch.shaj.android_jetpack_architecture_room;
import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.os.AsyncTask;
import android.util.Log;

import java.util.List;
/**
 * Created by Shakil Ahmed Shaj on 07-Jan-19.
 * shakilahmedshaj@gmail.com
 */



public class NoteViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();


    public NoteViewModel(Application application) {
        super(application);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel Destroyed");
    }
}