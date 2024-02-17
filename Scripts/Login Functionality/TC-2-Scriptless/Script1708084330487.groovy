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

WebUI.openBrowser('master.chargeautomation.com')

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Charge Automation/h2_Powerful Payment Processing'), 0)

WebUI.click(findTestObject('Login Page/Page_Charge Automation/a_Log In'))

WebUI.setText(findTestObject('Login Page/Page_ChargeAutomation - Login/input_Chargeback Protection_email'), 'automation9462@gmail.com')

WebUI.setText(findTestObject('Login Page/Page_ChargeAutomation - Login/input_Email_password'), 'Boring4321')

WebUI.click(findTestObject('Login Page/Page_ChargeAutomation - Login/input_Remember Me_login'))

WebUI.verifyElementPresent(findTestObject('Login Page/Page_ChargeAutomation - Login/span_These credentials do not match our records'), 
    0)

WebUI.closeBrowser()

