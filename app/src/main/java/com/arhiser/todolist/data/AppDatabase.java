package com.arhiser.todolist.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.arhiser.todolist.model.list;

@Database(entities = {list.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ListDao noteDao();
}
