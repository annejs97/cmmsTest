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

Mobile.startApplication('C:\\Users\\HP\\Downloads\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Inventory2/android.widget.EditText (1)'), '3serangkai@gmail.com')

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.EditText (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Inventory2/android.widget.EditText (3)'), 'password')

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Inventory2/android.widget.Button (3)'), 'Mesin Press')

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button (4)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Inventory2/android.widget.Button (5)'), 'Untuk lembaran metal')

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button (6)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Inventory2/android.widget.Button (7)'), 'I09KMC-ES')

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button (8)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Inventory2/android.widget.Button (9)'), 'A')

Mobile.tap(findTestObject('Object Repository/Inventory2/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.view.View (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button (10)'), 0)

Mobile.tap(findTestObject('Object Repository/Inventory2/android.widget.Button (11)'), 0)

Mobile.closeApplication()

