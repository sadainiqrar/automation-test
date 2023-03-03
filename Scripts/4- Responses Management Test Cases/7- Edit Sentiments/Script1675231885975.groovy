import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1- Login Test Cases/Login with Email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.EnvURL)

WebUI.click(findTestObject('2- Campaign Management/Campaign Card'))

WebUI.click(findTestObject('4- Response Moderation/Nav_responses'))

WebUI.click(findTestObject('4- Response Moderation/Edit Response'))

boolean negative = false

boolean positive = false

boolean neutral = false

try {
    WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Sentiment Neutral'), 5)

    neutral = true
}
catch (Exception e) {
} 

try {
    WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Sentiment Positive'), 5)

    positive = true
}
catch (Exception e) {
} 

try {
    WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Sentiment Negative'), 5)

    negative = true
}
catch (Exception e) {
} 

if (neutral == true) {
    WebUI.click(findTestObject('4- Response Moderation/Sentiment Neutral'))

    WebUI.click(findTestObject('4- Response Moderation/Select sentiment negative'))
} else if (positive == true) {
    WebUI.click(findTestObject('4- Response Moderation/Sentiments Positive'))

    WebUI.click(findTestObject('4- Response Moderation/Select sentiment negative'))
} else if (negative == true) {
    WebUI.click(findTestObject('4- Response Moderation/Sentiments Negative'))

    WebUI.click(findTestObject('4- Response Moderation/Select Sentiment positive'))
}

WebUI.click(findTestObject('4- Response Moderation/Apply button in Edit Popup'))

WebUI.verifyTextPresent('Post edited successfully', false)

