package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.swing.text.Position;

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
//        System.out.println(job.getId());
//        System.out.println(job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(job.getName() instanceof String);
        Assert.assertTrue(job.getEmployer() instanceof Employer);
        Assert.assertTrue(job.getLocation() instanceof Location);
        Assert.assertTrue(job.getPositionType() instanceof PositionType);
        Assert.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals(job.getName(), job.getName());
        Assert.assertEquals(job.getEmployer().toString(), job.getEmployer().toString());
        Assert.assertEquals(job.getLocation().toString(), job.getLocation().toString());
        Assert.assertEquals(job.getPositionType().toString(), job.getPositionType().toString());
        Assert.assertEquals(job.getCoreCompetency().toString(), job.getCoreCompetency().toString());

    }
//    @Test
//    public void testJobsForEquality(){
//        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    Assert.assertEquals(job,job2);
//    }

}





