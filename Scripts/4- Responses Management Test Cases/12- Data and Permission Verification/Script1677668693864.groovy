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
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('1- Login Test Cases/Login with Email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.EnvURL)

WebUI.delay(3)

WebUI.click(findTestObject('3- Campaign Creation/button add campaign'))

WebUI.setText(findTestObject('3- Campaign Creation/input__campaignName'), 'Automated Test Campaign 02')

int randomnumber = Math.floor(Math.random() * 100)

WebUI.setText(findTestObject('3- Campaign Creation/campaign url'), 'automatedtestcampaign02' + randomnumber)

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.setText(findTestObject('3- Campaign Creation/input__experienceHeading'), 'Automated Test Campaign by Waqas')

WebUI.click(findTestObject('3- Campaign Creation/Consent Permission'))

WebUI.click(findTestObject('3- Campaign Creation/Select permission dropdown'))

WebUI.setText(findTestObject('3- Campaign Creation/Select permission dropdown'), 'Share')

WebUI.sendKeys(findTestObject('3- Campaign Creation/Select permission dropdown'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('3- Campaign Creation/Select permission share internally'))

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.setText(findTestObject('3- Campaign Creation/textarea__question-section'), 'This is Question 01 for Testing?')

WebUI.click(findTestObject('3- Campaign Creation/Add question button'))

WebUI.click(findTestObject('3- Campaign Creation/button_Next'))

WebUI.setText(findTestObject('3- Campaign Creation/input__thankYouHeading'), 'Thank You for getting back.')

WebUI.click(findTestObject('3- Campaign Creation/User info No'))

WebUI.click(findTestObject('3- Campaign Creation/button_Finish'))

WebUI.verifyTextPresent('Campaign added successfully', false)

WebUI.navigateToUrl((GlobalVariable.HalfUrl + 'automatedtestcampaign02') + randomnumber)

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

WebUI.callTestCase(findTestCase('1- Login Test Cases/Login with Email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.EnvURL)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('2- Campaign Management/Campaign Card'))

WebUI.click(findTestObject('4- Response Moderation/Nav_responses'))

WebUI.verifyElementText(findTestObject('4- Response Moderation/Name_response_card'), 'Anonymous')

WebUI.verifyElementText(findTestObject('4- Response Moderation/Question on Card'), 'This is Question 01 for Testing?')

WebUI.verifyElementText(findTestObject('4- Response Moderation/Permission value'), 'Share Internally')

WebUI.navigateToUrl(GlobalVariable.EnvURL)

List<WebElement> elements = WebUI.findWebElements(findTestObject('2- Campaign Management/Three dots on campaign card'), 
    30)

elements.get(0).click()

//WebUI.click(findTestObject('Campaign Creation/Page_Fanvoice Console/div_Fanvoice_style__SeeMore-sc-1cgs5df-0 gKjEBr'))
WebUI.click(findTestObject('2- Campaign Management/Option Delete Campaign'))

WebUI.click(findTestObject('2- Campaign Management/Delete campaign yes'))

WebUI.verifyTextPresent('Campaign deleted', false)

WebUI.closeBrowser()

