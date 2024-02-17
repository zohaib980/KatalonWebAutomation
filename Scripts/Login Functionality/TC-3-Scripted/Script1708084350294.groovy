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

// Visite the Platform
WebUI.openBrowser("https://master.chargeautomation.com")
// For Maximize Window
WebUI.maximizeWindow()
// Validate Start Page
WebUI.verifyElementPresent(findTestObject('Object Repository/TC-3 Scripting/Page_Charge Automation/h2_Powerful Payment Processing'), 4)
// Click on Login Button
WebUI.click(findTestObject('Object Repository/TC-3 Scripting/Page_Charge Automation/a_Log In'))
// Validate Login Form Header
/* If you don't want to run any statement just add 'not_run:' in start of statement
 * not_run:WebUI.verifyElementPresent(findTestObject('Object Repository/TC-3 Scripting/Page_ChargeAutomation - Login/h2_Log In'), 4)
 */
WebUI.verifyElementPresent(findTestObject('Object Repository/TC-3 Scripting/Page_ChargeAutomation - Login/h2_Log In'), 4)
// Enter Email
WebUI.setText(findTestObject('Object Repository/TC-3 Scripting/Page_ChargeAutomation - Login/input_Chargeback Protection_email'), "automation9462@gmail.com")
// Enter Password
WebUI.setText(findTestObject('Object Repository/TC-3 Scripting/Page_ChargeAutomation - Login/input_Email_password'), "Boring321")
// Click on Login Button
WebUI.click(findTestObject('Object Repository/TC-3 Scripting/Page_ChargeAutomation - Login/input_Remember Me_login'))
// Validate Dashboard
WebUI.verifyElementPresent(findTestObject('Object Repository/TC-3 Scripting/Page_Dashboard New/h1_Welcome Waqas'), 8)
// Click on Bookings Tab
not_run:WebUI.click(findTestObject('Object Repository/Login Page/Page_Dashboard New/a_Bookings'))
// Validate Booking listing page
WebUI.verifyElementPresent(findTestObject('Object Repository/TC-3 Scripting/Page_Bookings/h1_Bookings'), 3)
// Close Browser
WebUI.closeBrowser()

