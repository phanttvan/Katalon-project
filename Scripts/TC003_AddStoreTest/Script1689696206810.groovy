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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/menu_stores'))

WebUI.waitForElementPresent(findTestObject('Object Repository/btn_add_store'), 0)

WebUI.click(findTestObject('Object Repository/btn_add_store'))

WebUI.click(findTestObject('Object Repository/link_create_store'))

WebUI.waitForElementClickable(findTestObject('Object Repository/rd_create_store_build'), 0)

WebUI.click(findTestObject('Object Repository/link_create_store'))

WebUI.setText(findTestObject('Object Repository/input_store_name'), 'vanptt-auto')

WebUI.waitForElementVisible(findTestObject('Object Repository/txt_store_url'), 0)

WebUI.click(findTestObject('Object Repository/rd_lastest_build'))

WebUI.click(findTestObject('Object Repository/rd_start_testdata'))

WebUI.click(findTestObject('Object Repository/btn_submit_create_store'))

