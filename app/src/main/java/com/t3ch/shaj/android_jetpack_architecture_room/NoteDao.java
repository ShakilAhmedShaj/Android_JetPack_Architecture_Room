package com.t3ch.shaj.android_jetpack_architecture_room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);
}
