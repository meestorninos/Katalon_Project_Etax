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

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Yes_frm1701AoptAmendedReturn'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Yes_frm1701AoptShortPeriod'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Taxpayer Type_frm1701AoptTaxType'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Alphanumeric Tax Code (ATC)_frm1701AoptATC'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_(MMDDYYYY)_frm1701AtxtBirthDate'), 
    '05/25/1999')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Citizenship_frm1701AtxtCitizenship'), 
    'Filipino')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Civil Status_frm1701AoptCivilStatus'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/a_(Either from Part IVA Item 46 OR Part IVB Item 56)'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_SalesRevenuesReceiptsFees_frm1701Atxt36A'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_SalesRevenuesReceiptsFees_frm1701Atxt36A'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_SalesRevenuesReceiptsFees_frm1701Atxt36A'), 
    '850000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_SalesRevenuesReceiptsFees_frm1701Atxt36A'), 
//    '850000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Less Sales Returns Allowances and Discounts_frm1701Atxt37A'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Less Sales Returns Allowances and Discounts_frm1701Atxt37A'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Less Sales Returns Allowances and Discounts_frm1701Atxt37A'), 
    '200000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Less Sales Returns Allowances and Discounts_frm1701Atxt37A'), 
//    '200000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Tax Payments for the First Three (3) Quarters_frm1701Atxt58A'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Tax Payments for the First Three (3) Quarters_frm1701Atxt58A'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Tax Payments for the First Three (3) Quarters_frm1701Atxt58A'), 
    '4000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input_Tax Payments for the First Three (3) Quarters_frm1701Atxt58A'), 
//    '4000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input__frm1701AcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/input__btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/button_Okay'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701A/Page_eTax  BIR Form No 1701A/img'))

