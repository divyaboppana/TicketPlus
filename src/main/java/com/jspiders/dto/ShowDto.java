package com.jspiders.dto;

import java.time.LocalDate;

public class ShowDto {
    private Integer movie;
    private Integer auditorium;
    private LocalDate showTime;
    private LocalDate endTime;
    private String status;

    public Integer getMovie() {
        return movie;
    }

    public void setMovie(Integer movie) {
        this.movie = movie;
    }

    public Integer getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Integer auditorium) {
        this.auditorium = auditorium;
    }

    public LocalDate getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDate showTime) {
        this.showTime = showTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ShowDto{" +
                "showTime=" + showTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                '}';
    }
}
