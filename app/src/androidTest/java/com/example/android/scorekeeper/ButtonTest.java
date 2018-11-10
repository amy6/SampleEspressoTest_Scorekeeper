package com.example.android.scorekeeper;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class ButtonTest {

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testButtonToggle() {
        onView(withId(R.id.night_mode)).perform(click());
        onView(allOf(withId(R.id.night_mode), withText("Day Mode")))
                .check(matches(withText("Day Mode")));


        onView(withId(R.id.night_mode)).perform(click());
        onView(allOf(withId(R.id.night_mode), withText("Night Mode")))
                .check(matches(withText("Night Mode")));

    }

}
