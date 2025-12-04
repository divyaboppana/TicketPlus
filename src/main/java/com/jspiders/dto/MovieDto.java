package com.jspiders.dto;

import com.jspiders.enums.CertificateType;
import com.jspiders.enums.MovieStatus;

public class MovieDto {

    private String title;

    private String language;

    private Integer duration;

    private String  certificate;

    private MovieStatus status;

    private Long createdBy;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public MovieStatus getStatus() {
        return status;
    }


    public void setStatus(MovieStatus status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "MovieDto{" +
                "title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", duration=" + duration +
                ", certificate='" + certificate + '\'' +
                ", status=" + status +
                ", createdBy=" + createdBy +
                '}';
    }
}
