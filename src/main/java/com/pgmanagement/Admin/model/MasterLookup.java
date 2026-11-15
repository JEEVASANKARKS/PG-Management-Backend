
package com.pgmanagement.Admin.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "master_lookups", schema = "pg_config_db")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MasterLookup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String category;

    @Column(name = "lookup_key", nullable = false)
    private String lookupKey;

    @Column(name = "lookup_value", nullable = false)
    private String lookupValue;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}
