package fr.hornet.hornetproject.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "airport", schema = "public", catalog = "hornet")
public class AirportEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iata")
    private String iata;
    @Basic
    @Column(name = "airport")
    private String airport;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "lat")
    private Double lat;
    @Basic
    @Column(name = "long")
    private Double lon;


}
