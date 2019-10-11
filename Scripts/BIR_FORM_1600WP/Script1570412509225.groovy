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

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_Any TaxesWithheld_frm1600WPAnyTaxHeld'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_Category of Withholding Agent_frm1600WPCategoryAgent'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/a_ATC'))

WebUI.delay(2)

WebUI.check(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_WB193_AtcCd1'))

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_WB194_btnOkPop1'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/tr_TAX ON WINNINGS FROM DOUBLE FORECASTQUINELLA AND TRIFECTA BETS ON HORSE RACES PAID BY PRIVATE WITHHOLDING TAX AGENT'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_TAX REQUIRED TO BEWITHHELD_frm1600WPtxtTaxBase'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_TAX REQUIRED TO BEWITHHELD_frm1600WPtxtTaxBase'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_TAX REQUIRED TO BEWITHHELD_frm1600WPtxtTaxBase'), 
    '3000000')

WebUI.delay(3)

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_TAX REQUIRED TO BEWITHHELD_frm1600WPtxtTaxBase'), 
//    '30000000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/a_ATC_1'))

WebUI.delay(3)

WebUI.check(findTestObject('BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_WB193_SchedIIAtcCde1'))

WebUI.click(findTestObject('BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_WB194_btnOkPop'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_(8) TAXREQUIRED TO BE WITHHELD_frm1600WPdtSchedtxtTin1'), 
    '353766854000')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_(8) TAXREQUIRED TO BE WITHHELD_frm1600WPdtSchedtxtFullname1'), 
    'Angelica Samson')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_(8) TAXREQUIRED TO BE WITHHELD_frm1600WPdtSchedamount1'), 
    '4000000')

WebUI.click(findTestObject('BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_frm1600WPcmdValidate'))

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_btnSave'))

WebUI.delay(3)

WebUI.click(findTestObject('BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/button_Okay'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

