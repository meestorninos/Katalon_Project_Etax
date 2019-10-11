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

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.setText(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_No of Sheets Attached_frm1602QtxtYear'), 
    '2019')

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_No of Sheets Attached_frm1602Qqtr'))

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_Yes_frm1602QAmendedRtn'))

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_No_frm1602QOptTaxWithheld'))

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_Category of Withholding Agent_frm1602QOptCategoryAgent'))

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_Yes_frm1602QOptSpecialTax'))

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/em_(From Part IV - Schedule 1)'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_WI161_frm1602QtxtSched1Amount1'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_WI161_frm1602QtxtSched1Amount1'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_WI161_frm1602QtxtSched1Amount1'), '4000000')

//WebUI.setText(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input_WI161_frm1602QtxtSched1Amount1'), '4000000')
WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input__frm1602QcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/input__btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1602Q/Page_eTax  BIR Form No 1602Qv2018/button_Okay'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

