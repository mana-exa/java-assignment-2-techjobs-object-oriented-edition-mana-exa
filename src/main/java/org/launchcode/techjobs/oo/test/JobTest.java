package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.CoreCompetency;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() throws ClassNotFoundException,
            InvocationTargetException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            NoSuchFieldException{
        Job jobTestOne = new Job();
        Job jobTestTwo = new Job();
        assertNotEquals(jobTestOne.getId(), jobTestTwo.getId());







    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobTestThree = new Job("Product tester",
                            new Employer("ACME"),
                            new Location("Desert"),
                            new PositionType("Quality control"),
                            new CoreCompetency("Persistence"));

        assertTrue(jobTestThree.getName().equals("Product tester"));
        assertEquals(jobTestThree.getName(), "Product tester");

        assertTrue(String.valueOf(jobTestThree.getEmployer()).equals("ACME"));
        assertEquals(String.valueOf(jobTestThree.getEmployer()), "ACME");

        assertTrue(String.valueOf(jobTestThree.getLocation()).equals("Desert"));
        assertEquals(String.valueOf(jobTestThree.getLocation()), "Desert");

        assertTrue(String.valueOf(jobTestThree.getPositionType()).equals("Quality control"));
        assertEquals(String.valueOf(jobTestThree.getPositionType()), "Quality control");

        assertTrue(String.valueOf(jobTestThree.getCoreCompetency()).equals("Persistence"));
        assertEquals(String.valueOf(jobTestThree.getCoreCompetency()), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job jobTestFour = new Job("Build tester",
                new Employer("Nora"),
                new Location("Remote"),
                new PositionType("Quality tester"),
                new CoreCompetency("Fast Learner"));

        Job jobTestFive = new Job("Build tester",
                new Employer("Nora"),
                new Location("Remote"),
                new PositionType("Quality tester"),
                new CoreCompetency("Fast Learner"));

        assertNotEquals(jobTestFour, jobTestFive);
        assertFalse(jobTestFour.equals(jobTestFive));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){

        Job testToStringJob = new Job(
                "Web Developer",
                new Employer("LaunchCode"),
                new Location("My House"),
                new PositionType("Front End"),
                new CoreCompetency("Beginner")
        );
        char firstChar = testToStringJob.toString().charAt(0);
        char lastChar = testToStringJob.toString().charAt(testToStringJob.toString().length() - 1);



//        assertEquals(lastChar, '\n');
//        assertEquals(firstChar, '\n');
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobTestLabelData = new Job(
                "Web Developer",
                new Employer("LaunchCode"),
                new Location("My House"),
                new PositionType("Front End"),
                new CoreCompetency("Beginner")
        );
        String output = String.format(
                '\n' +"ID: %d\n"
                +"Name: %s\n" + "Employer: %s\n"
                + "Location: %s\n"
                + "Position Type: %s\n"
                + "Core Competency: %s\n",

                jobTestLabelData.getId(), jobTestLabelData.getName(),
                jobTestLabelData.getEmployer(), jobTestLabelData.getLocation(),
                jobTestLabelData.getPositionType(), jobTestLabelData.getCoreCompetency()


        );
        assertEquals(output, jobTestLabelData.toString());
    }

    // Alexa - finish testToStringHandlesEmptyField test
    @Test
    public void testToStringHandlesEmptyField(){
        Job testEmptyJob = new Job(
                "Web Developer",
                new Employer(""),
                new Location("StL"),
                new PositionType(""),
                new CoreCompetency("Java")
        );



        String output = testEmptyJob.toString();




        assertEquals(String.valueOf(testEmptyJob.getEmployer().toString()), "Data not available");
//        assertEquals(output, "Data not available.");



    }



}
