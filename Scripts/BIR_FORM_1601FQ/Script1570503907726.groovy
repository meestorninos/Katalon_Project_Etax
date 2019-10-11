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

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_Quarter_frm1601FQOptQuarter'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_Any Taxes Withheld_frm1601FQTaxWithheld'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_Categoryof Withholding Agent_frm1601FQCatAgent'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/a_ATC'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_WI202_AtcCd1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_CASH OR PROPERTY DIVIDEND PAID BY A REAL ESTATE INVESTMENT TRUST (REIT)_btnOkPop'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_(Consolidated for the Quarter)_frm1601FQtxtTaxBase'), 
    '4000000')

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_Remittances Made_frm1601FQtxtTax23'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_Remittances Made_frm1601FQtxtTax23'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_Remittances Made_frm1601FQtxtTax23'), 
    '100000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input_Remittances Made_frm1601FQtxtTax23'), 
//    '100000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input__frm1601FQcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/input__btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601FQ/Page_eTax  BIR Form No 1601FQ/button_Okay'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

