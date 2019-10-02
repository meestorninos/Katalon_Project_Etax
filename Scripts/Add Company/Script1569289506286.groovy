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

WebUI.click(findTestObject('Company/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Company/Page_eTax  Companies/a_New Company'))

WebUI.setText(findTestObject('Company/Company/Page_eTax/input__tin1'), '123')

WebUI.setText(findTestObject('Company/Company/Page_eTax/input__tin2'), '456')

WebUI.setText(findTestObject('Company/Company/Page_eTax/input__tin3'), '789')

WebUI.setText(findTestObject('Company/Company/Page_eTax/input__tin4'), '000')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Company/Page_eTax/select_'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input__business_line'), 'Food')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input_Last Name_lastname'), 'Butter')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input_First Name_firstname'), 'Cookies')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input_Middle Name_middlename'), 'C')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input_Registered Name'), 'BCC CORPORATION')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input__city'), 'Marikina City')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input_District_district'), '3')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input_Substreet_substreet'), 'Emerald')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input__street'), 'Pearl Street')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input__barangay'), 'Sto Niño')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input__address'), '55 Pearl Street Sto Niño Marikina City')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input__zip'), '1800')

WebUI.setText(findTestObject('Object Repository/Company/Page_eTax/input__contact'), '789456123')

WebUI.click(findTestObject('Company/Company/Page_eTax/button_Save'))

WebUI.delay(10)

