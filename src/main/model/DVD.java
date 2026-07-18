package model;

// Represents a DVD in the library catalog
public class DVD implements Item {
    private String title;
    private String director;

    // Unique catalog identifier for the DVD
    private String catalogNumber;

    // Availability status of the DVD
    private boolean available;

    // Creates a new DVD that is available by default
    public DVD(String title, String director, String catalogNumber) {
        this.title = title;
        this.director = director;
        this.catalogNumber = catalogNumber;
        this.available = true;
    }

    @Override
    public String getTitle() { return title; }

    // Returns the director's name
    public String getDirector() { return director; }

    @Override
    public String getId() { return catalogNumber; }

    @Override
    public boolean isAvailable() { return available; }

    @Override
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String getType() { return "DVD"; }
}