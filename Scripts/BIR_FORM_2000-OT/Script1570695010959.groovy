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

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/a_ATC'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_DS102_AtcCode'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_P151000_btnOkPop'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Nature of Transaction_frm2000OTNatureOfTrans'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_(SellerTransferror)_frm2000OTtxtSeller'), 
    'Marionil Estorninos')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Taxpayer Identification Number_frm2000OTtxtTINS'), 
    '123456789000')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_(BuyerTransferee)_frm2000OTtxtBuyer'), 
    'Mary Grace Estorninos')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Taxpayer Identification Number_frm2000OTtxtTINB'), 
    '789456123000')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Location of Real Property_frm2000OTtxtLRP'), 
    'Marikina City')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_RDO Code of Location of Property_frm2000OTtxtRDOLP'), 
    '45')

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Classification of Real Property_frm2000OTClassRealProp'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Area of Property Sold (sq m)_frm2000OTtxt12B'), 
    '500')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_TCTOCTCCT No_frm2000OTtxt12C'), 
    '1')

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Tax Dec No_frm2000OTtxt12D'), 
    '2')

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Selling Price_frm2000OTtxt12E'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Selling Price_frm2000OTtxt12E'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Selling Price_frm2000OTtxt12E'), 
    '2000000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Selling Price_frm2000OTtxt12E'), 
//    '2000000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_frm2000OTcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/input_Machine ValidationRevenue Official Receipt Details (If not filed with the bank)_btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_2000-OT/Page_eTax  BIR Form No 2000OT/button_Okay'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

