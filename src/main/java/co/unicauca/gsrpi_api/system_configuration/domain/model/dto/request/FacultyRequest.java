package co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request;

public class FacultyRequest {
    private long facultyId;
    private String name;
    private String abbreviation;

    public FacultyRequest() {
    }

    public FacultyRequest(long facultyId, String name, String abbreviation) {
        this.facultyId = facultyId;
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(long facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

}

