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

WebUI.delay(3)

try {
    WebUI.verifyElementChecked(findTestObject('7- Feedback App/Video Recording Objects/Checkbox on Homepage'), 3)
}
catch (Exception e) {
    WebUI.click(findTestObject('7- Feedback App/Video Recording Objects/Checkbox on Homepage'))
} 

WebUI.click(findTestObject('7- Feedback App/Video Recording Objects/Video Recording Option'))

WebUI.click(findTestObject('7- Feedback App/Video Recording Objects/Get Started Button'))

boolean button = true

while (button == true) {
    WebUI.click(findTestObject('7- Feedback App/Video Recording Objects/Start Recording Button'))

    WebUI.delay(7)

    WebUI.click(findTestObject('7- Feedback App/Video Recording Objects/Stop Recording Button'))

    WebUI.click(findTestObject('7- Feedback App/Video Recording Objects/Approve Button'))

    try {
        WebUI.verifyElementPresent(findTestObject('7- Feedback App/Video Recording Objects/Start Recording Button'), 3)

        button = true
    }
    catch (Exception e) {
        button = false
    } 
}

WebUI.waitForElementVisible(findTestObject('7- Feedback App/Video Recording Objects/Thank You Heading'), 10)

