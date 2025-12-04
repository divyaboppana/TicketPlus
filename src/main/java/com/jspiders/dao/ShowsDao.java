package com.jspiders.dao;

import com.jspiders.entity.ShowEntity;

public interface ShowsDao {
    void addShows(ShowEntity showEntity);
    void getShows(Long showId);
    void updateShows(Long showId);
    void deleteShows(Long showId);
}
