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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://qualitypointtech.net/timesheetdemo/index.php')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Online Timesheet  Qualitypointtech.com/input_User Name_username'), 'admin')

WebUI.setText(findTestObject('Page_Online Timesheet  Qualitypointtech.com/input_Password_password'), 'admin')

WebUI.click(findTestObject('Page_Online Timesheet  Qualitypointtech.com/input_Password_login'))

WebUI.verifyElementPresent(findTestObject('Page_Employees List - Online Timesheet  Qualitypointtech.com/a_Employee Details'), 
    3)
WebUI.closeBrowser()
