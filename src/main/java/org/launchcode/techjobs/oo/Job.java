package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField{


    private int id;
    private static int nextId = 1;

    private static String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }


    //create a toString method that passes the first test.
    @Override
    public String toString(){
        String output = "";

        output = String.format(
                        '\n' + "ID: " + id + '\n'
                        + "Name: " + name
                        + '\n' +"Employer: " + employer + '\n'
                        + "PositionType: " + positionType + '\n'
                        + "Location: " + location + '\n'
                        + "Core Competency: " + coreCompetency + '\n'


                );
        if(name.equals("")) {
            return "Data not available";
            }
            if(getEmployer().toString().isEmpty()) {
                return "Data not available";
            }if(getPositionType().toString().isEmpty()) {
                return "Data not available";
            }if(getLocation().toString().isEmpty()) {
                return "Data not available";
            }if(getCoreCompetency().toString().isEmpty()) {
                return "Data not available";
            }else



        //Alexa - Finish coding 'toString handles cases in which fields are empty'

        return output;
    };


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }




    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.getId();
        //Alexa - check if .getId() works here
    }




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
