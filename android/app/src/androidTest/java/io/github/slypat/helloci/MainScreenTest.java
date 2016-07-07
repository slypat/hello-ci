package io.github.slypat.helloci;

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

@RunWith(AndroidJUnit4.class)
public class MainScreenTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void showsZeroCountMessageOnStartUp() {
        onView(withId(R.id.count)).check(matches(withText(R.string.you_have_pressed_the_button_0_times)));
    }

    @Test
    public void clickButton_updatesCountMessageWithIncrementedCount() {
        onView(withId(R.id.fab)).perform(click());

        onView(withId(R.id.count)).check(matches(withText("You have pressed the button 1 times.")));
    }
}
