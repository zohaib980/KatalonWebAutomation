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

// Open Browser Chrome
WebUI.openBrowser('')
// Enter URL
WebUI.navigateToUrl('https://master.chargeautomation.com/')
// Maximize Window
WebUI.maximizeWindow()
// Click on Login page
WebUI.click(findTestObject('Object Repository/Booking Listing/Page_Charge Automation/a_Log In'))
// Enter Email
WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_ChargeAutomation - Login/input_Chargeback Protection_email'), 'waqasmanual@mailinator.com')
// Enter Password
WebUI.setEncryptedText(findTestObject('Object Repository/Booking Listing/Page_ChargeAutomation - Login/input_Email_password'), '9Ak8eq9ncYcPK8AwFnxguw==')
// Click on Login Button
WebUI.click(findTestObject('Object Repository/Booking Listing/Page_ChargeAutomation - Login/input_Remember Me_login'))
// Click on Bookings Tab
WebUI.click(findTestObject('Object Repository/Booking Listing/Page_Dashboard New/a_Bookings'))
// Click on Add new Booking
WebUI.click(findTestObject('Object Repository/Booking Listing/Page_Bookings/button_Add New Booking'))
// Enter Validate Booking Detail
WebUI.selectOptionByValue(findTestObject('Object Repository/Booking Listing/Page_Bookings/select_Select Property Waqas Property'), '3129', true)

WebUI.click(findTestObject('Object Repository/Booking Listing/Page_Bookings/div_MonTueWedThurFriSatSunMonTueWedThurFriS_3ddcce'))

WebUI.click(findTestObject('Object Repository/Booking Listing/Page_Bookings/button_16'))

WebUI.click(findTestObject('Object Repository/Booking Listing/Page_Bookings/button_24'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Booking Listing/Page_Bookings/select_Select Source Direct                _5c3c43'), '098876', true)

WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_Bookings/input_Total Booking Amount_total_booking_amount'), '100')

WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_Bookings/textarea_Internal Notes_bookingNotes'), 'This is automation test created Booking.')

WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_Bookings/input__first_name'), 'QA')

WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_Bookings/input__last_name'), 'Tester')

WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_Bookings/input_Email_email'), 'qatest@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_Bookings/input_Adults_numAdults'), '2')

WebUI.setText(findTestObject('Object Repository/Booking Listing/Page_Bookings/input_Children_numChild'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Booking Listing/Page_Bookings/select_Select Nationality                  _206fe6'), 'Pakistani', true)

WebUI.click(findTestObject('Object Repository/Booking Listing/Page_Bookings/button_Save Changes'))
// Validate Toast Message
WebUI.verifyElementPresent(findTestObject('Object Repository/Booking Listing/Page_Bookings/div_Booking added successfully'), 0)
// Close Browser
WebUI.closeBrowser()

