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

WebUI.click(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Any Taxes Withheld_frm1601cTaxWithheld'))

WebUI.click(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Contact                                                                        Number_frm1601cCatAgent'))

WebUI.sendKeys(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Amount of Compensation_frm1601ctxtTax14'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Amount of Compensation_frm1601ctxtTax14'),
	Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Amount of Compensation_frm1601ctxtTax14'),
	'5000000')

WebUI.sendKeys(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Taxes Withheld_frm1601ctxtTax25'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Taxes Withheld_frm1601ctxtTax25'),
	Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Taxes Withheld_frm1601ctxtTax25'),
	'50000')


//WebUI.setText(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Amount of Compensation_frm1601ctxtTax14'), 
//    '5000000')
//
//WebUI.setText(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input_Total Taxes Withheld_frm1601ctxtTax25'), 
//    '50000')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input__frm1601cbtnValidate'))

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/input__btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1601Cv2018/Page_eTax  BIR Form No 1601Cv2018/button_Okay'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

