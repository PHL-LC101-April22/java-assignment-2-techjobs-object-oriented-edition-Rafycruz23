package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.swing.text.Position;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job = new Job();
        Job job2 = new Job();
        Assert.assertNotEquals(job.getId(), job2.getId());
    }

//    Job job;
//
//    @Before
//    public void jobInstance(){
//        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(job.getName() instanceof String);
        Assert.assertTrue(job.getEmployer() instanceof Employer);
        Assert.assertTrue(job.getLocation() instanceof Location);
        Assert.assertTrue(job.getPositionType() instanceof PositionType);
        Assert.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals(job.getName(), job.getName());
        Assert.assertEquals(job.getEmployer().toString(), "ACME");
        Assert.assertEquals(job.getLocation().toString(), "Desert");
        Assert.assertEquals(job.getPositionType().toString(), "Quality control");
        Assert.assertEquals(job.getCoreCompetency().toString(), "Persistence");

    }
    @Test
    public void testJobsForEquality(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(job.equals(job2));
        Assert.assertNotEquals(job.getId(), job2.getId());
        Assert.assertTrue(job.equals(job));

    }


    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals('\n', job.toString().charAt(0));
        Assert.assertEquals('\n', job.toString().charAt(job.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals("\nID: " + job.getId()+ "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer()+ "\nLocation: " + job.getLocation() +"\nPosition Type: " +
                job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency()+ "\n",job.toString());
    }

@Test
    public void testToStringHandlesEmptyField(){
    Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    Assert.assertEquals("\nID: " + job.getId()+ "\nName: Data not available" + "\nEmployer: Data not available" + "\nLocation: Data not available" +"\nPosition Type: Data not available" +
            "\nCore Competency: Data not available" + "\n",job.toString());
}
}





