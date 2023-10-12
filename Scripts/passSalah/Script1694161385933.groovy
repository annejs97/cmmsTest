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

Mobile.startApplication('C:\\Users\\HP\\Downloads\\app-release (2).apk', true)

Mobile.tap(findTestObject('Object Repository/passSalah/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('Object Repository/passSalah/android.widget.EditText (1)'), 'anindhyas07@gmail.com')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/passSalah/android.widget.EditText (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/passSalah/android.widget.EditText (3)'), 'pisswird')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/passSalah/android.widget.Button'), 0)

// Menambahkan verifikasi pesan kesalahan atau tindakan jika login gagal
if (Mobile.verifyElementExist(findTestObject('Object Repository/passSalah/android.widget.TextView', 0), 5)) {
	// Element yang menunjukkan pesan kesalahan ditemukan
	// Tindakan lanjutan jika login gagal, misalnya menampilkan pesan atau mencatat log
	Mobile.comment('Login Gagal: Pesan Kesalahan Ditampilkan')
} else {
	// Element pesan kesalahan tidak ditemukan
	// Tindakan jika login berhasil, misalnya menavigasi ke layar berikutnya
	Mobile.comment('Login Berhasil')
}


Mobile.closeApplication()

