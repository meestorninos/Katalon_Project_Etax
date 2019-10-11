import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://member.etax.ph/')

WebUI.setText(findTestObject('Object Repository/Delete Forms/Page_eTax/input_Username_username'), 'maruestopia')

WebUI.setEncryptedText(findTestObject('Object Repository/Delete Forms/Page_eTax/input_Password_password'), 'qEo0rSLi8fL36UBcqwrx5w==')

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax/button_Login'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/a_Delete'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/button_Yes'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/a_Okay'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/a_Back'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Forms/a_Fill Up_1'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/a_Delete_1'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/button_Yes'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/a_Okay_1'))

WebUI.click(findTestObject('Object Repository/Delete Forms/Page_eTax  Form Transactions/a_Back'))

WebUI.closeBrowser()

