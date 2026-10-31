package com.example.kotlintasks

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class WaterTrackerTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testAddWaterButton() {
        composeTestRule.setContent {
            WaterTracker()
        }

        composeTestRule.onNodeWithText("+250 мл").assertIsDisplayed()
        composeTestRule.onNodeWithText("0 мл").assertIsDisplayed()

        composeTestRule.onNodeWithText("+250 мл").performClick()
        composeTestRule.onNodeWithText("250 мл").assertIsDisplayed()
    }

    @Test
    fun testFinishDayButtonAndStreak() {
        composeTestRule.setContent {
            WaterTracker()
        }

        composeTestRule.onNodeWithText("Дней подряд >= 1500 мл: 0").assertIsDisplayed()
        composeTestRule.onNodeWithText("Завершить день").assertIsDisplayed()

        for (i in 1..6) {
            composeTestRule.onNodeWithText("+250 мл").performClick()
        }
        composeTestRule.onNodeWithText("1500 мл").assertIsDisplayed()

        composeTestRule.onNodeWithText("Завершить день").performClick()

        composeTestRule.onNodeWithText("Дней подряд >= 1500 мл: 1").assertIsDisplayed()
        composeTestRule.onNodeWithText("0 мл").assertIsDisplayed()
    }

    @Test
    fun testStreakTextAndResetOnInsufficientWater() {
        composeTestRule.setContent {
            WaterTracker()
        }

        composeTestRule.onNodeWithText("Дней подряд >= 1500 мл: 0").assertIsDisplayed()

        for (i in 1..6) {
            composeTestRule.onNodeWithText("+250 мл").performClick()
        }
        composeTestRule.onNodeWithText("Завершить день").performClick()

        composeTestRule.onNodeWithText("Дней подряд >= 1500 мл: 1").assertIsDisplayed()

        composeTestRule.onNodeWithText("+250 мл").performClick()
        composeTestRule.onNodeWithText("+250 мл").performClick()
        composeTestRule.onNodeWithText("Завершить день").performClick()

        composeTestRule.onNodeWithText("Дней подряд >= 1500 мл: 0").assertIsDisplayed()
    }
}