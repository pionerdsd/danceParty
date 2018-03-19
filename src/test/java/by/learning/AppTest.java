package by.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;


import static org.junit.Assert.assertNotNull;


/**
 * Hello world!
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DanceConfig.class)
public class AppTest {
@Rule
public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Autowired
    private DanceFloor danceFloor;

    @Autowired
    private  Dance dance;

    @Test
    public void danceShouldHaveAnyDanceFloor(){
        assertNotNull(danceFloor);
    }
    @Test
    public void danceShoulHaveAnyDancer(){
        assertNotNull(dance);
    }
    @Test
    public void dannce(){
        dance.Dance();

    }




}

