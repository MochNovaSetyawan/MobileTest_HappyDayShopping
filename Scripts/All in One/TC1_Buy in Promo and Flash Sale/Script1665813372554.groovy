import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.G_HappyDayShopping, true)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(943, 122)

Mobile.tap(findTestObject('Promo/Text_Column'), 0)

Mobile.setText(findTestObject('Promo/Text_Column'), 'promo' + '\\n', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Promo - NMF Aquarring', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Promo/Promo_Product_NMF Aquarring Mask  (3pc)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Promo/Text_Product_NMF Aquarring Mask  (3pc)'), 0)

Mobile.tap(findTestObject('Promo/Qty_NMF'), 0)

Mobile.setText(findTestObject('Promo/Qty_NMF'), 12 + '\\n', 0)

Mobile.delay(3)

Mobile.tapAtPosition(69, 1853)

Mobile.pressBack()

Mobile.scrollToText('Promo Lucky', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Promo/Promo_Product_Lucky Me Chicken  Magic Flakes'), 0)

Mobile.verifyElementVisible(findTestObject('Promo/Text_Product_Lucky Me Chicken  Magic Flakes'), 0)

Mobile.tap(findTestObject('Promo/Qty_Lucky'), 0)

Mobile.setText(findTestObject('Promo/Qty_Lucky'), 6 + '\\n', 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Bag/Add_to_Bag_Lucky'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Flash Sale/Flash_Sale_Button'), 0)

Mobile.scrollToText('Placenta', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Flash Sale/Flash_Product_Buy 2 Renew Placenta Classic Soap'), 0)

Mobile.verifyElementVisible(findTestObject('Flash Sale/Text_Product_Buy 2 Renew Placenta Classic Soap'), 0)

Mobile.tap(findTestObject('Flash Sale/Qty_Placenta'), 0)

Mobile.setText(findTestObject('Flash Sale/Qty_Placenta'), 8 + '\\n', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(69, 1853)

Mobile.pressBack()

Mobile.scrollToText('Anlene', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Flash Sale/Flash_Product_Anlene Chocolate 980g'), 0)

Mobile.verifyElementVisible(findTestObject('Flash Sale/Text_Product_Anlene Chocolate 980g'), 0)

Mobile.tap(findTestObject('Flash Sale/Qty_Anlene'), 0)

Mobile.setText(findTestObject('Flash Sale/Qty_Anlene'), 2 + '\\n', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Bag/Add_to_Bag_Anlene'), 0)

Mobile.tap(findTestObject('Bag/Your_Bag'), 0)

Mobile.tap(findTestObject('Bag/In_My_Bag'), 0)

Mobile.tap(findTestObject('Bag/Clear_Button'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Bag/Button - YES'), 0)

Mobile.verifyElementVisible(findTestObject('Bag/Text_Clear_Your shopping bag is waiting for its firstproduct'), 0)

Mobile.delay(3)

Mobile.closeApplication()

