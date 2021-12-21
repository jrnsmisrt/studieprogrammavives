package be.vives;

public enum Courses {
    MATHMATICS("Mathmatics", "MATH"),
    ENGLISH("English", "ENG"),
    NEDERLANDS("Nederlands", "NED"),
    FRANCAIS("Francais", "FRANC"),
    ECONOMY("Economy", "ECON"),
    CODING("Coding", "COD"),
    NETWORKSYSTEMS("Network Systems", "NETSYS");

    private final String courseName;
    private final String id;

    Courses(String courseName, String id) {
        this.courseName = courseName;
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + courseName;
    }
}
