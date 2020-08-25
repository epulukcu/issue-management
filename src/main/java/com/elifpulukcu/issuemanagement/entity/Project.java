package com.elifpulukcu.issuemanagement.entity;

import lombok.*;
import javax.persistence.*;


@Entity
@Table(name="project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_code", length = 30)
    private String projectCode;

    @Column(name = "project_name", length = 300)
    private String projectName;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User manager;
}
