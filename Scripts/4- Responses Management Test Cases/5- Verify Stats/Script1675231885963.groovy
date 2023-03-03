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

WebUI.click(findTestObject('5- Insights page/Nav item insight'))

WebUI.verifyElementText(findTestObject('5- Insights page/Total questions'), '1')

WebUI.verifyElementText(findTestObject('5- Insights page/Total participants'), '2')

WebUI.verifyElementText(findTestObject('5- Insights page/Total responses'), '2')

WebUI.verifyElementText(findTestObject('5- Insights page/Total Video responses'), '1')

WebUI.verifyElementText(findTestObject('5- Insights page/Video responses percentage'), '50%')

WebUI.verifyElementText(findTestObject('5- Insights page/Total Audio responses'), '1')

WebUI.verifyElementText(findTestObject('5- Insights page/Audio responses percentage'), '50%')

