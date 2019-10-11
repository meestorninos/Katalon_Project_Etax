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

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_For theCalendarFiscal_frm2553itemFiscalStartMonth'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Quarter_frm2553optQtr'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/a_14B'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Rate_frm2553optATC'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_SPECIALREGULARECONOMIC FREE PORT ZONE ENTERPRISES_frm2553modalOK'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt14C'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt14C'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt14C'), 
    '500000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt14C'), 
//    '500000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/a_15B'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_CLARK DEVELOPMENT CORPORATIONS_frm2553optATC'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_SPECIALREGULARECONOMIC FREE PORT ZONE ENTERPRISES_frm2553modalOK'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt15C'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt15C'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt15C'), 
    '1000000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Tax Due_frm2553txt15C'), 
//    '1000000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Creditable Tax Withheld Per BIR Form 2307_frm2553txt20B'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Creditable Tax Withheld Per BIR Form 2307_frm2553txt20B'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Creditable Tax Withheld Per BIR Form 2307_frm2553txt20B'), 
    '100000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Creditable Tax Withheld Per BIR Form 2307_frm2553txt20B'), 
//    '100000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_frm2553cmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2553/Page_eTax  BIR Form No 2553/button_Okay'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

