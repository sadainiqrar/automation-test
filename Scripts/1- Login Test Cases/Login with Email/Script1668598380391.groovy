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

WebUI.navigateToUrl(GlobalVariable.LoginUrl)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login Repo/Login with Email/Page_Fanvoice Console/input_Welcome to fanvoice_authStyles__Input_8d9327'), 
    'waqas.ahmed@fankave.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Repo/Login with Email/Page_Fanvoice Console/input_Welcome to fanvoice_authStyles__Input_8d9327_1'), 
    'SKME85Cnv5aKbiLmeMucKg==')

WebUI.click(findTestObject('Object Repository/Login Repo/Login with Email/Page_Fanvoice Console/button_Sign in'))

WebUI.delay(6)

