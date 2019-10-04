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

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  BIR Form No 1600/input_Any Taxes Withheld_frm1600j_id252'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  BIR Form No 1600/input_Category                                                            of Withholding Agent_frm1600j_id392'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  BIR Form No 1600/a_ATC'))

WebUI.delay(3)

WebUI.check(findTestObject('BIR_FORM_1600/Page_eTax  BIR Form No 1600/input_WV050_AtcCode2'))

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1600/Page_eTax  BIR Form No 1600/input_OTHER SERVICES RENDERED IN THE PHILIPPINES BY NON-RESIDENTS_btnOkPop'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  BIR Form No 1600/td_VAT WITHHOLDING FROM  NON-RESIDENTS (PRIVATE WITHHOLDING AGENT)_text-center'))

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  BIR Form No 1600/input_VAT WITHHOLDING FROM  NON-RESIDENTS (PRIVATE WITHHOLDING AGENT)_frm1600txtTaxBase'), 
    '3000000')

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600/Page_eTax  BIR Form No 1600/input_Machine ValidationRevenue Official Receipt Details (If not filed with an Authorized Agent Bank)_frm0600cmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('BIR_FORM_1600/Page_eTax  BIR Form No 1600/input_Machine ValidationRevenue Official Receipt Details (If not filed with an Authorized Agent Bank)_btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_1600/Page_eTax  BIR Form No 1600/button_Okay'))

WebUI.delay(2)

WebUI.click(findTestObject('BIR_FORM_06019F/Page_eTax  BIR Form No 0619E/img'))

