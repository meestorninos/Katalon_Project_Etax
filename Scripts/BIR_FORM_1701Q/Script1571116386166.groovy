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

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Quarter_frm1701qDateQuarter'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_TaxpayerFiler Type_frm1701qoptTaxpayerType'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Alphanumeric Tax Code (ATC)_frm1701qoptATC'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Date of Birth (MMDDYYYY)_frm1701qtxtBirthMonth'), 
    '05')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/div_'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Date of Birth (MMDDYYYY)_frm1701qtxtBirthDay'), 
    '25')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Date of Birth (MMDDYYYY)_frm1701qtxtBirthYear'), 
    '1999')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Citizenship_frm1701qtxtCitizenship'), 
    'Filipino')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Itemized Deduction Sec 34(A-J) NIRC_frm1701qoptMethodOfDeduction'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/a_(From Part V Schedule 1-Item 46 OR Schedule II-Item 54)'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_(net of sales returns allowances and discounts)_frm1701qtxt36A'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_(net of sales returns allowances and discounts)_frm1701qtxt36A'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_(net of sales returns allowances and discounts)_frm1701qtxt36A'), 
    '600000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_(net of sales returns allowances and discounts)_frm1701qtxt36A'), 
//    '600000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Creditable Tax Withheld per BIR Form No 2307 for this Quarter_frm1701qtxt58A'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Creditable Tax Withheld per BIR Form No 2307 for this Quarter_frm1701qtxt58A'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Creditable Tax Withheld per BIR Form No 2307 for this Quarter_frm1701qtxt58A'), 
    '30000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input_Creditable Tax Withheld per BIR Form No 2307 for this Quarter_frm1701qtxt58A'), 
//    '30000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input__frm1701qcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/input__btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/button_Okay'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/img'))

