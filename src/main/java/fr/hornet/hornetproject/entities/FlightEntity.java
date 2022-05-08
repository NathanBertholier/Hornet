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
@Table(name = "flight", schema = "public", catalog = "hornet")
public class FlightEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "date")
    private Date date;
    @Basic
    @Column(name = "deptime")
    private Integer deptime;
    @Basic
    @Column(name = "crsdeptime")
    private Integer crsdeptime;
    @Basic
    @Column(name = "arrtime")
    private Integer arrtime;
    @Basic
    @Column(name = "crsarrtime")
    private Integer crsarrtime;
    @ManyToOne
    @JoinColumn(name = "uniquecarrier")
    private CarriersEntity uniquecarrier;
    @Basic
    @Column(name = "flightnum")
    private Integer flightnum;
    @ManyToOne
    @JoinColumn(name = "tailnum")
    private PlaneEntity tailnum;
    @Basic
    @Column(name = "actualelapsedtime")
    private Integer actualelapsedtime;
    @Basic
    @Column(name = "crselapsedtime")
    private Integer crselapsedtime;
    @Basic
    @Column(name = "airtime")
    private Integer airtime;
    @Basic
    @Column(name = "arrdelay")
    private Integer arrdelay;
    @Basic
    @Column(name = "depdelay")
    private Integer depdelay;

    @ManyToOne()
    @JoinColumn(name = "origin")
    private AirportEntity origin;
    @ManyToOne()
    @JoinColumn(name = "dest")
    private AirportEntity dest;
    @Basic
    @Column(name = "distance")
    private Integer distance;
    @Basic
    @Column(name = "taxiin")
    private Integer taxiin;
    @Basic
    @Column(name = "taxiout")
    private Integer taxiout;
    @Basic
    @Column(name = "cancelled")
    private Boolean cancelled;
    @Basic
    @Column(name = "cancellationcode")
    private String cancellationcode;
    @Basic
    @Column(name = "diverted")
    private Boolean diverted;
    @Basic
    @Column(name = "carrierdelay")
    private Integer carrierdelay;
    @Basic
    @Column(name = "weatherdelay")
    private Integer weatherdelay;
    @Basic
    @Column(name = "nasdelay")
    private Integer nasdelay;
    @Basic
    @Column(name = "securitydelay")
    private Integer securitydelay;
    @Basic
    @Column(name = "lateaircraftdelay")
    private Integer lateaircraftdelay;
    @Basic
    @Column(name = "delay")
    private Integer delay;
}
