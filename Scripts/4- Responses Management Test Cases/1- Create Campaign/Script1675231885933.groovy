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

WebUI.click(findTestObject('2- Campaign Management/Button add campaign'))

WebUI.setText(findTestObject('3- Campaign Creation/input__campaignName'), 'Automated Test Campaign 02')

int randomnumber = Math.floor(Math.random() * 100)

WebUI.setText(findTestObject('3- Campaign Creation/campaign url'), 'automatedtestcampaign02' + randomnumber)

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.setText(findTestObject('3- Campaign Creation/input__experienceHeading'), 'Automated Test Campaign by Waqas')

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.setText(findTestObject('3- Campaign Creation/textarea__question-section'), 'This is Question 01 for Testing?')

WebUI.click(findTestObject('3- Campaign Creation/Add question button'))

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.setText(findTestObject('3- Campaign Creation/input__thankYouHeading'), 'Thank You for getting back.')

WebUI.setText(findTestObject('3- Campaign Creation/input__getInTouchHeading'), 'Get in Touch')

WebUI.click(findTestObject('3- Campaign Creation/input_Name_infoField'))

WebUI.click(findTestObject('3- Campaign Creation/button_Finish'))

WebUI.verifyTextPresent('Campaign added successfully', false)

GlobalVariable.ExperienceUrl = ((GlobalVariable.HalfUrl + 'automatedtestcampaign02') + randomnumber)

