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

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Residence Address_frm1800txtAddress2'), 
    '123 MANGAHAN PASIG CITY')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Zip                                                                Code_frm1800txtZipCode2'), 
    '1900')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee1TIN1'), 
    '324')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee1TIN2'), 
    '123')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee1TIN3'), 
    '564')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee1BranchCode'), 
    '000')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relationship of Donee to the Donor_frm1800txtRelationshipDonee1'), 
    'SIBLING')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relationship of Donee to the Donor_frm1800txtDonee1Name'), 
    'TROY WELLS')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee2TIN1'), 
    '657')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee2TIN2'), 
    '213')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee2TIN3'), 
    '543')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TIN (Donee)_frm1800txtDonee2BranchCode'), 
    '000')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relationship of Donee to the Donor_frm1800txtRelationshipDonee2'), 
    'SIBLING')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relationship of Donee to the Donor_frm1800txtDonee2Name'), 
    'TINA WELLS')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/a_From Schedule A'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TOTALS_btnAdd1'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedAParticulars'), 
    'Land Property')

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedAStranger'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedAStranger'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedAStranger'), 
    '2000000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedAStranger'), 
//    '2000000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedARelative'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedARelative'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedARelative'), 
    '1000000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_txtSchedARelative'), 
//    '1000000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Relative_chxschedA0'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_TOTALS_btnOkPop2'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_frm1800cmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1800/Page_eTax  BIR Form No 1800/button_Okay'))

WebUI.closeBrowser()

