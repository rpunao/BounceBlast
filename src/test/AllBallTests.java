package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBallFactory.class, TestBasketBall.class, TestBowlingBall.class, TestSoccerBall.class,
		TestTennisBall.class })
public class AllBallTests {

}
