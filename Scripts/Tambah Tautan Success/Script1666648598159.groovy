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

WebUI.click(findTestObject('LOGIN/My Profile/add'))

WebUI.click(findTestObject('LOGIN/My Profile/Add_Url'))

WebUI.setText(findTestObject('LOGIN/My Profile/Field A Url'), 'testt')

WebUI.setText(findTestObject('LOGIN/My Profile/Field Enter A Description'), 'test')

WebUI.verifyElementNotClickable(findTestObject('LOGIN/My Profile/Button Disable add site'))

WebUI.setText(findTestObject('LOGIN/My Profile/Field A Url'), 'www.test.com')

WebUI.setText(findTestObject('LOGIN/My Profile/Field Enter A Description'), 'test')

WebUI.verifyElementClickable(findTestObject('LOGIN/My Profile/Button Enable add site'))

WebUI.click(findTestObject('LOGIN/My Profile/Button Add Site'))

WebUI.verifyElementPresent(findTestObject('LOGIN/My Profile/Element Profile Link Verif'), 1)

