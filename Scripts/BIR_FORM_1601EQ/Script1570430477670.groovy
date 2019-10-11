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

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_Quarter_frm1601EQoptQuarter'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_Any Taxes Withheld_frm1601EQoptWithheld'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_Category of Withholding Agent_frm1601EQoptCategory'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/a_ATC'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_WI011_AtcCode2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_INCOME PAYMENTS ON LOCALLY PRODUCED RAW SUGAR_btnOkPop'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_(Consolidated for the Quarter)_frm1601EQtxtTaxBase'), 
    '1000000')

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_st_frm1601EQtxtTax20'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_st_frm1601EQtxtTax20'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_st_frm1601EQtxtTax20'), 
    '50000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_st_frm1601EQtxtTax20'), 
//    '50000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_NOTE Please read the BIR Data Privacy Policy found in the BIR website (wwwbirgovph)_frm1601EQcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/input_NOTE Please read the BIR Data Privacy Policy found in the BIR website (wwwbirgovph)_btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601EQ/Page_eTax  BIR Form No 1601EQ/button_Okay'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

