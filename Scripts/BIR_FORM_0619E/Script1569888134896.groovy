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

WebUI.openBrowser('')

WebUI.click(findTestObject('Form_0605/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_For theCalendarFiscal_frm0605itemFiscalStartMonth'))

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Quarter_itemQuarter'))

WebUI.setText(findTestObject('Object Repository/Form_0605/Page_eTax  BIR Form No 0605/input_Due Date (MMDDYYYY)_frm0605txtDueDateMonth'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Form_0605/Page_eTax  BIR Form No 0605/input_Due Date (MMDDYYYY)_frm0605txtDueDateDay'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Form_0605/Page_eTax  BIR Form No 0605/input_Due Date (MMDDYYYY)_frm0605txtDueDateYear'), 
    '2019')

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/a_ATC'))

WebUI.delay(3)

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_FP010_AtcCode'))

WebUI.scrollToElement(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_XT130_AtcCode'), 1)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_CIGARETTES PACKED BY MACHINE SEC 145 (C)(4)_btnOkPop'))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Return Period (MM  DD  YYYY)_frm0605txtReturnPeriodMonth'), 
    '10')

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Return Period (MM  DD  YYYY)_frm0605txtReturnPeriodDay'), 
    '09')

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Return Period (MM  DD  YYYY)_frm0605txtReturnPeriodYear'), 
    '2019')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/a_Tax Type'))

WebUI.delay(3)

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_CG_TaxCode'))

WebUI.scrollToElement(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_XC_TaxCode'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_EXCISE TAX-PERFORMANCE OF SERVICES ON INVASIVE COSMETICS PROCEDURES_btnOkPop'))

WebUI.delay(3)

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_I_frm0605txtClassification'))

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Tax DepositAdvance Payment_frm0605itemMannerOfPayment'))

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Partial Payment_frm0605itemModeOfPayment'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Basic TaxDepositAdvance Payment_frm0605txtTax19'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Basic TaxDepositAdvance Payment_frm0605txtTax19'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Basic TaxDepositAdvance Payment_frm0605txtTax19'), 
    '5000.00')

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20A'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20A'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20A'), '500.00')

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20B'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20B'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20B'), '500.00')

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20C'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20C'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20C'), '500.00')

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Taxpayer ClassificationI - IndividualN - Non-Individual_frm0605cmdValidate'))

WebUI.waitForAlert(1)

WebUI.verifyAlertPresent(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Taxpayer ClassificationI - IndividualN - Non-Individual_btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/button_Okay'))

WebUI.delay(2)

WebUI.click(findTestObject('Form_0605/Page_eTax  Dashboard/img'))

not_run: WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/button_Yes1'))

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://member.etax.ph/')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Etax_Login/Page_eTax/input_Username_username'), 'maruestopia')

WebUI.setEncryptedText(findTestObject('Etax_Login/Page_eTax/input_Password_password'), 'qEo0rSLi8fL36UBcqwrx5w==')

WebUI.click(findTestObject('Object Repository/Etax_Login/Page_eTax/button_Login'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Dashboard/a_Company'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Companies/a_Open'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Forms/a_Fill Up'))

WebUI.click(findTestObject('Form_0605/Page_eTax  Form Transactions/a_Add'))

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_For theCalendarFiscal_frm0605itemFiscalStartMonth'))

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Quarter_itemQuarter'))

WebUI.setText(findTestObject('Object Repository/Form_0605/Page_eTax  BIR Form No 0605/input_Due Date (MMDDYYYY)_frm0605txtDueDateMonth'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Form_0605/Page_eTax  BIR Form No 0605/input_Due Date (MMDDYYYY)_frm0605txtDueDateDay'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Form_0605/Page_eTax  BIR Form No 0605/input_Due Date (MMDDYYYY)_frm0605txtDueDateYear'), 
    '2019')

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/a_ATC'))

WebUI.delay(3)

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_FP010_AtcCode'))

WebUI.scrollToElement(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_XT130_AtcCode'), 1)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_CIGARETTES PACKED BY MACHINE SEC 145 (C)(4)_btnOkPop'))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Return Period (MM  DD  YYYY)_frm0605txtReturnPeriodMonth'), 
    '10')

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Return Period (MM  DD  YYYY)_frm0605txtReturnPeriodDay'), 
    '09')

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Return Period (MM  DD  YYYY)_frm0605txtReturnPeriodYear'), 
    '2019')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/a_Tax Type'))

WebUI.delay(3)

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_CG_TaxCode'))

WebUI.scrollToElement(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_XC_TaxCode'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_EXCISE TAX-PERFORMANCE OF SERVICES ON INVASIVE COSMETICS PROCEDURES_btnOkPop'))

WebUI.delay(3)

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_I_frm0605txtClassification'))

WebUI.check(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Tax DepositAdvance Payment_frm0605itemMannerOfPayment'))

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Partial Payment_frm0605itemModeOfPayment'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Basic TaxDepositAdvance Payment_frm0605txtTax19'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Basic TaxDepositAdvance Payment_frm0605txtTax19'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Basic TaxDepositAdvance Payment_frm0605txtTax19'), 
    '5000.00')

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20A'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20A'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20A'), '500.00')

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20B'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20B'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20B'), '500.00')

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20C'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20C'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Compromise_frm0605txtTax20C'), '500.00')

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Taxpayer ClassificationI - IndividualN - Non-Individual_frm0605cmdValidate'))

WebUI.waitForAlert(1)

WebUI.verifyAlertPresent(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/input_Taxpayer ClassificationI - IndividualN - Non-Individual_btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/button_Okay'))

WebUI.delay(2)

WebUI.click(findTestObject('Form_0605/Page_eTax  Dashboard/img'))

not_run: WebUI.click(findTestObject('Form_0605/Page_eTax  BIR Form No 0605/button_Yes1'))

WebUI.delay(5)

