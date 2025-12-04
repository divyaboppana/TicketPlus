package com.jspiders.entity;

import com.jspiders.enums.ShowStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "shows")
public class ShowEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private MovieEntity movie;

    @ManyToOne
    @JoinColumn(name = "audi_id")
    private AuditoriumEntity auditorium;

    @Column(name = "show_time", nullable = false)
    private LocalDate show_Time;

    @Column(name = "end_time", nullable = false)
    private LocalDate end_time;

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public AuditoriumEntity getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(AuditoriumEntity auditorium) {
        this.auditorium = auditorium;
    }

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ShowStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getShow_Time() {
        return show_Time;
    }

    public void setShow_Time(LocalDate show_Time) {
        this.show_Time = show_Time;
    }

    public LocalDate getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalDate end_time) {
        this.end_time = end_time;
    }

    public ShowStatus getStatus() {
        return status;
    }

    public void setStatus(ShowStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ShowEntity{" +
                "id=" + id +
                ", show_Time=" + show_Time +
                ", end_time=" + end_time +
                ", status=" + status +
                '}';
    }
}
