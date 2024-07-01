package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.stream.Location;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Cinema extends BaseEntity{
    private  String name;
    private  String sponsoredName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;
}
