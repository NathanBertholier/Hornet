package fr.hornet.hornetproject.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "plane", schema = "public", catalog = "hornet")
public class PlaneEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tailnum")
    private String tailnum;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "manufacturer")
    private String manufacturer;
    @Basic
    @Column(name = "issue_date")
    private Date issueDate;
    @Basic
    @Column(name = "model")
    private String model;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "aircraft_type")
    private String aircraftType;
    @Basic
    @Column(name = "year")
    private Integer year;

}
