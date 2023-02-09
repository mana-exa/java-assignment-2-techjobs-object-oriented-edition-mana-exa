package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
//import org.launchcode.techjobs.oo.Employer;
//import org.launchcode.techjobs.oo.Location;
//import org.launchcode.techjobs.oo.PositionType;
//import org.launchcode.techjobs.oo.CoreCompetency;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException{
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

        assertTrue(jobTestThree instanceof Job);
        assertEquals(jobTestThree.getName(), "Product tester");
        assertEquals(String.valueOf(jobTestThree.getEmployer()), "ACME");
        assertEquals(String.valueOf(jobTestThree.getLocation()), "Desert");
        assertEquals(String.valueOf(jobTestThree.getPositionType()), "Quality control");
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

    }

}
