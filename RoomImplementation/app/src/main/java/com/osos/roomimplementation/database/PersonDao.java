package com.osos.roomimplementation.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;




import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface PersonDao {


    @Insert
    public void insert(Person person);

    @Delete
    public void delete();

    @Query("SELECT * FROM persons")
    public Flowable<List<Person>> getAll();
    


}
