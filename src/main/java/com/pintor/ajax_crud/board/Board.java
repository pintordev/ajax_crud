package com.pintor.ajax_crud.board;

import com.pintor.ajax_crud.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Board extends BaseEntity {

    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;
}
