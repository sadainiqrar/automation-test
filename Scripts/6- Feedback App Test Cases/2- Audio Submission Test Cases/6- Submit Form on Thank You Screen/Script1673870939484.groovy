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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url1)

try {
    WebUI.verifyElementChecked(findTestObject('7- Feedback App/Audio Submission Objects/Checkbox on homepage'), 3)
}
catch (Exception e) {
    WebUI.click(findTestObject('7- Feedback App/Audio Submission Objects/Checkbox on homepage'))
} 

WebUI.click(findTestObject('7- Feedback App/Audio Submission Objects/Record Audio Option'))

WebUI.click(findTestObject('7- Feedback App/Audio Submission Objects/button_Get Started'))

boolean button = true

while (button == true) {
    WebUI.click(findTestObject('7- Feedback App/Audio Submission Objects/Start Recording Button'))

    WebUI.delay(7)

    WebUI.click(findTestObject('7- Feedback App/Audio Submission Objects/Stop Recording Button'))

    WebUI.click(findTestObject('7- Feedback App/Audio Submission Objects/Approve Button'))

    try {
        WebUI.verifyElementPresent(findTestObject('7- Feedback App/Audio Submission Objects/Start Recording Button'), 3)

        button = true
    }
    catch (Exception e) {
        button = false
    } 
}
WebUI.waitForElementPresent(findTestObject('7- Feedback App/Audio Submission Objects/Thank You Heading'), 10)

boolean form =false;
try {
	WebUI.verifyElementPresent(findTestObject('7- Feedback App/Form Submission/Form input Name'), 2)
	form=true;
}catch(Exception e) {
	println("7- Feedback App/Submit button not clickable. ")
}

if(form==true) {
	try {
		WebUI.setText(findTestObject('7- Feedback App/Form Submission/Form input Name'), 'Waqas Ahmad')
	}catch(Exception e) {
		println("Name Field not Present")
	}
	
	try {
		WebUI.setText(findTestObject('7- Feedback App/Form Submission/Form input email'), 'waqas@fankave.com')
	}catch(Exception e) {
		println("Email Field not Present")
	}
	
	try {
		WebUI.setText(findTestObject('7- Feedback App/Form Submission/Form input job title'), 'QA Automation')
	}catch(Exception e) {
		println("Job Title Field not Present")
	}
	
	try {
		WebUI.verifyElementPresent(findTestObject('7- Feedback App/Form Submission/Form submit button'), 2)
		WebUI.click(findTestObject('7- Feedback App/Form Submission/Form submit button'))
	}catch(Exception e) {
		println("Submit button not clickable. ")
	}
	
}else {
	println("Form not present")
}




