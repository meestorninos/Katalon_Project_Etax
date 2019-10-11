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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Quarter_frm1603QoptQuarter'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Any Taxes Withheld_frm1603QTaxWithheld'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Category                                                        of Withholding Agent_frm1603QCatAgent'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/a_(From Part IV-Schedule 1)'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Monetary Value of Fringe Benefit(C)_frm1603QSched1txtValue1'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Monetary Value of Fringe Benefit(C)_frm1603QSched1txtValue1'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Monetary Value of Fringe Benefit(C)_frm1603QSched1txtValue1'), 
    '3000000')

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Non-Resident Alien Not Engaged in Trade or Business Within the Philippines_frm1603QSched1txtValue2'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Non-Resident Alien Not Engaged in Trade or Business Within the Philippines_frm1603QSched1txtValue2'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Non-Resident Alien Not Engaged in Trade or Business Within the Philippines_frm1603QSched1txtValue2'), 
    '1000000')

//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Monetary Value of Fringe Benefit(C)_frm1603QSched1txtValue1'), 
//    '3000000')
//
//WebUI.setText(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input_Non-Resident Alien Not Engaged in Trade or Business Within the Philippines_frm1603QSched1txtValue2'), 
//    '1000000')
WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input__frm1603QcmdValidate'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/input__btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BIR_FORM_1603v2018/Page_eTax  BIR Form No 1603Qv2018/button_Okay'))

WebUI.click(findTestObject('Object Repository/BIR_FORM_1600WP/Page_eTax  BIR Form No 1600WP/img'))

