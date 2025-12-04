package com.jspiders.services;

import com.jspiders.dto.MovieDto;
import com.jspiders.dto.ShowDto;

public interface ShowService {

    void addShow(Long audiId, Long movieId, ShowDto showDto);
}
