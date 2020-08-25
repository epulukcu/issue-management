package com.elifpulukcu.issuemanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="created_by", length=50)
    private String createdBy;

    @Column(name="updatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column (name="updated_by", length=50)
    private String updatedBy;

    @Column (name="status")
    private Boolean status; //Kayıt aktif mi?
}
