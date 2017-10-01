import com.automation.remarks.kirk.Browser
import org.openqa.selenium.chrome.ChromeDriver

fun main(args: Array<String>) {
    System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver")
    val browser = Browser(ChromeDriver())
    browser.open("https://www.t-mobile.nl/login")

    val username = getEnvVarValue("tmobile_username")
    val password = getEnvVarValue("tmobile_password")
    println("username: " + username)
    println("password: " + password)
    browser.element("input[name=\"Row1.Column1.Cell2.Login.Username\"]").setValue(username)
    browser.element("input[name=\"Row1.Column1.Cell2.Login.Password\"]").setValue(password)
    browser.element("input[name=\"Row1.Column1.Cell2.Login.Login\"]").click()

    browser.open("https://www.t-mobile.nl/my/facturen")

    browser.element("div[class=\"row widget-box-content\"]:first-child a").click()

    Thread.sleep(2_000)
    browser.quit()
}

fun getEnvVarValue(envVarName: String): String {
    println("env var name: " + envVarName)
    return if (System.getenv(envVarName).isNullOrEmpty()) "secret" else System.getenv(envVarName)
}