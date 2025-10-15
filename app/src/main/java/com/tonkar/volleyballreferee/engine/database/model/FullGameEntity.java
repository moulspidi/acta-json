package com.tonkar.volleyballreferee.engine.database.model;

import androidx.annotation.NonNull;
import androidx.room.*;
import androidx.room.Ignore;

import lombok.*;

@Entity(tableName = "full_games")
@AllArgsConstructor
@Getter
@Setter
public class FullGameEntity {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "type")
    private String type;

    @NonNull
    @ColumnInfo(name = "content")
    private String content;

    @Ignore
    public FullGameEntity() {
        this.type = "";
        this.content = "";
    }

}
