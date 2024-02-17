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

WebUI.navigateToUrl('https://master.chargeautomation.com/')

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Charge Automation/h2_Powerful Payment Processing'), 0)

WebUI.click(findTestObject('Object Repository/Login Page/Page_Charge Automation/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Login Page/Page_ChargeAutomation - Login/input_Chargeback Protection_email'), 
    'automation9462@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/Page_ChargeAutomation - Login/input_Email_password'), 
    '9Ak8eq9ncYcPK8AwFnxguw==')

WebUI.click(findTestObject('Object Repository/Login Page/Page_ChargeAutomation - Login/input_Remember Me_login'))

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Dashboard New/h1_Welcome Waqas'), 0)

WebUI.click(findTestObject('Object Repository/Login Page/Page_Dashboard New/a_Bookings'))

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Bookings/h1_Bookings'), 0)

