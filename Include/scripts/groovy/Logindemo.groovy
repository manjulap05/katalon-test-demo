import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Logindemo {
	@Given("User navigate to config form")
	def Navigatetologinpage()	{
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://qualitypointtech.net/timesheetdemo/index.php')
		println("\n User navigate to config form")
	}

	@When("User enter (.*) and (.*)")
	def enterusernameandpassword(String username,String password) {
		println("User enter username :" +username)
		println("User enter password :"  +password)
		WebUI.maximizeWindow()
		
		WebUI.setText(findTestObject('Page_Online Timesheet  Qualitypointtech.com/input_User Name_username'), username)
		
		WebUI.setText(findTestObject('Page_Online Timesheet  Qualitypointtech.com/input_Password_password'), password)
	
	}


	@And("user clik on login button")
	def clikonloginbutton(){
		WebUI.click(findTestObject('Page_Online Timesheet  Qualitypointtech.com/input_Password_login'))
		println("\n clik on login button")
	}

	@Then("user navigates to config home page")
	def navigatestoconfighomepage(){
		WebUI.verifyElementPresent(findTestObject('Page_Employees List - Online Timesheet  Qualitypointtech.com/a_Employee Details'),
			5)
		
		WebUI.closeBrowser()
	}
	
}