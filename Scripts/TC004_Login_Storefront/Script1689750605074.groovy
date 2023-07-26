import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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
import org.openqa.selenium.Keys
import org.openqa.selenium.remote.server.handler.SendKeys as Keys

def pass='123456'
def list_email = new String [3]
list_email[0] = 'wrwerw@gmail.com'
list_email[1] = 'sdfsd34@gmail.com'
list_email[2] = '123were@gmail.com'

def accountListObject=[
	account1: [
		email:list_email[0],
		pass: pass='123456'
		],
	account2: [
		email:list_email[2],
		pass: pass='123456'
			]
	]
	
	
WebUI.openBrowser('https://auto2023.myshopify.com/account/login')

inputEmailMethod(input_email , accountListObject.account1.email)
inputEmailMethod(input_pass ,accountListObject.account1.pass)
WebUI.click(submit_form) 
WebUI.takeScreenshot('loginStorefront.png')

def inputEmailMethod(def input_email,def value_email){
	WebUI.sendKeys (input_email, value_email)
}
def inputPasswordMethod(def input_pass,def value_pass){
	WebUI.sendKeys (input_pass, value_pass)
}
println()
println()