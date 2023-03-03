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

WebUI.verifyElementText(findTestObject('4- Response Moderation/Name_response_card'), 'Waqas')

WebUI.click(findTestObject('4- Response Moderation/Nav_responses'))

WebUI.verifyElementText(findTestObject('4- Response Moderation/Name_response_card'), 'Waqas')

WebUI.verifyElementText(findTestObject('4- Response Moderation/Question on Card'), 'This is Question 01 for Testing?')

WebUI.verifyElementText(findTestObject('4- Response Moderation/Permission value'), 'Share Publicly')

WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Time Option in Response Card'), 3)

WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Select Option for Response card'), 3)

WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Featured Option on Response Card'), 3)

WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Approve Option on Response Card'), 3)

WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Tags Option On Response Card'), 3)

WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Keywords Option on Response Card'), 3)

WebUI.verifyElementPresent(findTestObject('4- Response Moderation/Trackers Option on esponse Card'), 3)

