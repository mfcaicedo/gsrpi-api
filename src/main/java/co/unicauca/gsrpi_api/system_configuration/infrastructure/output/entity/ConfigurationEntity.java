package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "configuracion")
public class ConfigurationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "configuracion_id")
    private long configurationId;

    @OneToOne
    @JoinColumn(name = "facultad_id", nullable = false)
    private FacultyEntity faculty;

    public ConfigurationEntity() { }

    public ConfigurationEntity(FacultyEntity faculty) {
        this.faculty = faculty;
    }

    public long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(long configurationId) {
        this.configurationId = configurationId;
    }

    public FacultyEntity getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyEntity faculty) {
        this.faculty = faculty;
    }
}
