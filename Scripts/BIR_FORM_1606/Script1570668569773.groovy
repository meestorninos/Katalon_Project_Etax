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

WebUI.click(findTestObject('Form_0605/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('BIR_FORM_1606/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Any Taxes Withheld_frm1606j_id252'))

WebUI.setText(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_TIN Seller_frm1606txtTINS1'), '789')

WebUI.setText(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_TIN Seller_frm1606txtTINS2'), '456')

WebUI.setText(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_TIN Seller_frm1606txtTINS3'), '123')

WebUI.setText(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_TIN Seller_frm1606txtBranchCodeS'), '000')

WebUI.selectOptionByValue(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/select_'), '43A', false)

WebUI.setText(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_RDO Code_frm1606txtSellerName'), 'Samson, Angelica M.')

WebUI.setText(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_concat(Seller  s Registered Address)_frm1606txtSellerAddress'), 
    'Antipolo City')

WebUI.click(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Individual_frm1606optATC13'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Category                                                            of Withholding Agent_frm1606j_id392'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Classification of Property_frm1606j_id393'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Location of the Property_frm1606txtLocation'), 
    'Antipolo City')

WebUI.selectOptionByValue(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/select_0'), '43A', false)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_TCTOCTCCT No_frm1606txtTCT'), 
    '01')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Area Sold (sq m)_frm1606txtArea'), 
    '500')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Tax Dec No_frm1606txtTaxDC'), 
    '123')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Yes_frm1606j_id394'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Description of Transaction (Mark one box only)_frm1606j_id395'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Gross Selling Price_frm1606txtGross'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Gross Selling Price_frm1606txtGross'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Gross Selling Price_frm1606txtGross'), 
    '3000000')

WebUI.selectOptionByIndex(findTestObject('BIR_FORM_1606/Page_eTax  BIR Form No 1606/select_Select Tax Rate015356'), '2')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Gross Selling Price_frm1606txtGross'), 
//    '3000000')
 
WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Yes_frm1606SpecialLaw'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_frm1606cmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1606/Page_eTax  BIR Form No 1606/button_Okay'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

