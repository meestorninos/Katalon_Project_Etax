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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://member.etax.ph/')

not_run: WebUI.setText(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax/input_Username_username'), 'maruestopia')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax/input_Password_password'), 'qEo0rSLi8fL36UBcqwrx5w==')

not_run: WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax/button_Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_Any Taxes Withheld_frm0619FoptWithheld'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_Category of Withholding Agent_frm0619FoptCategory'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_Amount of Remittance_frm0619FtxtTax13'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_Amount of Remittance_frm0619FtxtTax13'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_Amount of Remittance_frm0619FtxtTax13'), 
    '5000000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_Amount of Remittance_frm0619FtxtTax13'), 
//    '3000000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_NOTE Please read the BIR Data Privacy Policy found in the BIR website (wwwbirgovph)_frm0619FcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/input_NOTE Please read the BIR Data Privacy Policy found in the BIR website (wwwbirgovph)_btnSave'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_06019F/Page_eTax  BIR Form No 0619F/button_Okay'))

WebUI.closeBrowser()

