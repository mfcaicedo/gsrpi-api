package co.unicauca.gsrpi_api.system_configuration.domain.model;

public class Faculty {
    private long facultyId;
    private String name;
    private String location;
    private String phone;
    private String email;
    private String address;
    private String abbreviation;

    public Faculty() {}

    public Faculty(String name, String location, String phone, String email, String address, String abbreviation) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.abbreviation = abbreviation;
    }

    public Faculty(long facultyId, String name, String location, String phone, String email, String address, String abbreviation) {
        this.facultyId = facultyId;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.address = address;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}



