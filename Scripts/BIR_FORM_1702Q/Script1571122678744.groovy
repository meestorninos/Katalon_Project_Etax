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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://member.etax.ph/')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax/input_Username_username'), 'maruestopia')

WebUI.setEncryptedText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax/input_Password_password'), 'qEo0rSLi8fL36UBcqwrx5w==')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax/button_Login'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Quarter_frm1702qoptQtr'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Yes_frm1702qoptRemenderRtn'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/a_ATC'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Rate_AtcCodename'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_FOREIGN CURRENCY DEPOSIT UNITS (FCDUS)_btnOkPop'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16A'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16A'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16A'), 
    '500000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16A'), 
//    '500000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17A'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17A'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17A'), 
    '50000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17A'), 
//    '50000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16B'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16B'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16B'), 
    '450000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16B'), 
//    '450000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17B'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17B'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17B'), 
    '45000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17B'), 
//    '45000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16C'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16C'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16C'), 
    '500000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_SalesRevenuesReceiptsFees_frm1702qtxt16C'), 
//    '500000')
WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17C'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17C'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17C'), 
    '50000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Less Cost of SalesServices_frm1702qtxt17C'), 
//    '50000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_frm1702qcmdValidate'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1702Q/Page_eTax  BIR Form No 1702Q/button_Okay'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1701Q_QUARTERLY/Page_eTax  BIR Form No 1701Qv2018/img'))

