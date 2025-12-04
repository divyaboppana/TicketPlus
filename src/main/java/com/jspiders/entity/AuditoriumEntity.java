package com.jspiders.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auditorium")
public class AuditoriumEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "audi_name",nullable = false)
    private String Audi_Name;

    @Column(name = "seat_rows",nullable = false)
    private Integer seat_Rows;

    @Column(name = "seat_cols",nullable = false)
    private Integer seat_Cols;

    @OneToMany(mappedBy = "auditorium",cascade = CascadeType.ALL)
    private List<ShowEntity> showList = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAudi_Name() {
        return Audi_Name;
    }

    public void setAudi_Name(String audi_Name) {
        Audi_Name = audi_Name;
    }

    public Integer getSeat_Rows() {
        return seat_Rows;
    }

    public void setSeat_Rows(Integer seat_Rows) {
        this.seat_Rows = seat_Rows;
    }

    public Integer getSeat_Cols() {
        return seat_Cols;
    }

    public void setSeat_Cols(Integer seat_Cols) {
        this.seat_Cols = seat_Cols;
    }

    public List<ShowEntity> getShowList() {
        return showList;
    }

    public void setShowList(List<ShowEntity> showList) {
        this.showList = showList;
    }

    @Override
    public String toString() {
        return "AuditoriumEntity{" +
                "id=" + id +
                ", Audi_Name='" + Audi_Name + '\'' +
                ", seat_Rows=" + seat_Rows +
                ", seat_Cols=" + seat_Cols +
                '}';
    }
}
